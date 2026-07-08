import java.io.File;
import java.util.*;
public class LoginService {
    Scanner sc =new Scanner (System.in);

    public void loginUser(){
        System.out.println("\n===== User Login =====");

        System.out.println("Username : ");
        String username=sc.next();

        System.out.println("Password : ");
        String password=sc.next();

        try {
            File file=new File("user.text");
            Scanner reader=new Scanner(file);
            boolean found =false;
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                String data[]=line.split(",");

                if (data[0].equals(username)&&data[1].equals(password)){
                    found =true;
                    break;
                }
            }
            reader.close();
            if(found){
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Invalid Username or Password");
            }

        } catch (Exception e) {
            System.out.println("User file Not found ");
        }


    }
}
