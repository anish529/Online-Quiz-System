import java.util.*;
public class Main {

    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        RegisterService register=new RegisterService();
        LoginService login=new LoginService();
        QuizService quizService= new QuizService();
        Result result = new Result(null, 0, 0, 0, 0);
        //AdminService admin=new AdminService();

        while(true){
            System.out.println("==================================================================");

            System.out.println(" Online Quiz System ");

             System.out.println("==================================================================");


             System.out.println("1.Register");
                System.out.println("2. Login");
                  System.out.println("3. Admin");
                  System.out.println("4. Start Quiz");
                   System.out.println("5. Exit");
                      System.out.println(" enter choice:");

                      int choice =sc.nextInt();
                      switch(choice){
                        case 1:
                            // System.out.println("Registration module coming...");
                            register.registerUser();
                            break;
                        case 2:
                        // System.out.println("Login Module coming..");
                        login.loginUser();
                        break;


                        case 3:
                            Admin admin=new Admin();
                            System.out.println("Enter Admin Username:");
                            String adminUser=sc.next();
                            System.out.println("Enter Admin Password:");
                            String adminpassword=sc.next();

                            if(adminUser.equals(admin.getUsername())&& adminpassword.equals(admin.getPassword())){
                               AdminService adminService=new AdminService();
                               adminService.adminMenu();
                            }
                               else{
                                     System.out.println("Invalid admin Username or password ");
                               }
                               break;


                               case 4:
                               quizService.startQuiz();
                                  break;


                        case 5:
                            System.out.println("Thankyou...");
                            System.exit(0);

                            default:
                                System.out.println("Invalid choice");

                      }

                      

        }
        
    }
}
