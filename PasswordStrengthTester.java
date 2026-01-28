public class PasswordStrengthTester {
    public static void main(String [] args){

        String[] passwords = {"Name", "1234567","123456789",
        "Raghu123*", "Pass@123", "abc"};
        
        System.out.println("Password Strength Report");

        for(String pass : passwords){
            boolean result = validatePassword(pass);
            System.out.println("Password: " + pass + " --> " + (result ? "PASS" : "FAIL"));
        }
    }

    public static boolean validatePassword(String pass){
        
        if(pass.length()<8){
            return false;
        }
        boolean hasNumber = pass.matches(".*[0-9].*");
        boolean hasSpecialChar = pass.matches(".*[^a-zA-Z0-9].*");

        return hasNumber && hasSpecialChar;
    }
} 