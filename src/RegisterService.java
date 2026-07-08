import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class RegisterService {
    Scanner sc=new Scanner(System.in);
    
    public void registerUser(){
          System.out.println("======== User Registration ==========");

          System.out.println("Enter Username : ");
           String username=sc.next();

           if(! Validation.isValidUsername(username))
            return;

           System.out.println("Enter Password : ");
           String password = sc.next();
           
           if(! Validation.isValidPassword(password))
            return;

           User user=new User(username,password);

           try {
               FileWriter writer=new FileWriter("user.text",true);
               writer.write(user.toString()+"\n");
               writer.close();

               System.out.println("Registration Successful");
           } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
           }
    }
}
