import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdminService {
  
    Scanner sc=new Scanner(System.in);

    // ADD QUESTIONS
    public void addQuestion(){
         System.out.println("\n====== ADD QUESTION ======");
          
         System.out.println("Enter question id :");
         int id=sc.nextInt();
         sc.nextLine();

         
         System.out.println("Enter Question");
         
         String question = sc.nextLine();

         System.out.println("option A :");
         String optionA=sc.nextLine();

         System.out.println("option B :");
         String optionB=sc.nextLine();

         System.out.println("option C :");
         String optionC=sc.nextLine();

         System.out.println("option D :");
         String optionD=sc.nextLine();

         System.out.println(" Correct option (A-D) :");
         char answer=sc.next().charAt(0);
         
         Question q=new Question(id,question,optionA,optionB,optionC,optionD,answer);

         try {
             FileWriter writer=new FileWriter("question.txt",true);

             writer.write(q.toString()+"\n");
             writer.close();
             System.out.println("Question Added SuccessFully");
         } catch (IOException e) {
            System.out.println("Error :"+e.getMessage());
         }
    }

    // VIEW QUESTIONS
    public void viewQuestions(){
        try {
            File file=new File("question.txt");
            Scanner reader=new Scanner(file);

            System.out.println("\n======== ALL Questions=======");
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                String data[]=line.split(",");

                System.out.println("----------------------------------");
                System.out.println("Question Id :" + data[0]);
                System.out.println("Question :" + data[1]);
                System.out.println("A" + data[2]);
                System.out.println("B" + data[3]);
                System.out.println("C" + data[4]);
                System.out.println("D" + data[5]);
                System.out.println("Correct Answer" + data[6]);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("question file not found");
        }
    }

    // Delete Question

    public void deleteQuestion(){
        System.out.println("Enter Question Id to delete :");
        int deleted=sc.nextInt();

        File inputFile=new File("question.txt");
        File tempFile=new File("tem.txt");

        boolean found=false;

        try {
            Scanner reader = new Scanner(inputFile);
            FileWriter writer = new FileWriter(tempFile);
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                String data[]=line.split(",");
                int id = Integer.parseInt(data[0]);

                if(id!=deleted){
                    writer.write(line+"\n");
                }
                else{
                    found = true;
                }
            }
            reader.close();
            writer.close();

            inputFile.delete();
            tempFile.renameTo(inputFile);
            if(found){
                System.out.println("Question deleted successfully ");
            }
            else{
                System.out.println("Question Id not found");
            }
        } catch (IOException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
    // Admin menu

    public void adminMenu(){
        while(true){
           System.out.println("\n===== ADMIN MENU =====");
           System.out.println("1. Add Questions");
           System.out.println("2. View Questions");
           System.out.println("3. Delete Questions");
           System.out.println("4. Logout");

           System.out.println("Enter Choice : ");
           int choice =sc.nextInt();

           switch(choice){
            case 1:
                addQuestion();
                break;
             
            case 2:
                viewQuestions();
                break;

                 case 3:
                deleteQuestion();
                break;
                
            case 4:
                System.out.println("Admin Logged Out"); 
                return;
                
                default:
                    System.out.println("Invalid choice");
           }
        }
    }
    public Object getUsername() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
    }
}
