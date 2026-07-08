public class Validation {
    public static boolean isValidUsername(String username){
        if(username.length()<4){
            System.out.println("Username must be at least 4 characters");
            return false;
        }
        return true;
    }

    public static boolean isValidPassword(String password){
        if(password.length()<6){
            System.out.println("Password must be at least 6 characters");
            return false;
        }
        return true;
    }
}
