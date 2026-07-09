import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class QuizService {
    Scanner sc=new Scanner(System.in);
    public void startQuiz(){
          int totalQuestions=0;
          int correctAnswers=0;

        try {
            File file=new File("question.txt");
            Scanner reader= new Scanner(file);
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                totalQuestions++;
                //System.out.println(line);
                String data[]= line.split(",");

                System.out.println("------------------------------");
                System.out.println("Question : " + data[1]);
                System.out.println("A." + data[2]);
                System.out.println("B. " + data[3]);
                System.out.println("C." + data[4]);
                System.out.println("D." + data[5]);
                System.out.println("Enter Answer :");

                String userAnswer=sc.next().toUpperCase();
                String correctAnswer= data[6];
                if(userAnswer.equals(correctAnswer)){
                    correctAnswers++;
                    System.out.println("Correct Answer");

                }
                else{
                    System.out.println("Wrong Answer");
                }
            }
            int wrongAnswer = totalQuestions - correctAnswers;
            double percentage=(correctAnswers*100.0)/totalQuestions;

            Result result = new Result("Anish", totalQuestions, correctAnswers, wrongAnswer, percentage);
            result.displayresult();

            try{
                 FileWriter writer = new FileWriter("result.txt",true);
                 writer.write("Username : Anish\n");
                 writer.write("Total Question :" + totalQuestions + "\n");
                    writer.write("Correct Answers :" + correctAnswers + "\n");
                    writer.write("Wrong Answers :" + wrongAnswer + "\n");
                       writer.write("Percentage : " + percentage + "\n");
                          writer.write("Score     :" + correctAnswers + "/" + totalQuestions + "\n");
                             writer.write("\n");
                             writer.close();
            }catch(Exception e){
                System.out.println("Result File not Found");
            }


            // System.out.println("\n ==== Result ====");
            // System.out.println("Total Questions :" + totalQuestions);
            //  System.out.println("Correct Answers :" + correctAnswers);
            //   System.out.println("Wrong Answers :" + (totalQuestions-correctAnswers));
            //    System.out.println("Score     :" + correctAnswers + "/" + totalQuestions);
            //     System.out.println("");

            reader.close();
        } catch (Exception e) {
            System.out.println("Question File not Found");
        }
    }
}
