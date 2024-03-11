
    import java.util.Scanner;
    public class GetUserName
    {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in); //create scanner
            String firstName = "";
            String lastName = "";
            firstName = SafeInput.getNonZeroLenString(in, "Enter your first name"); //first name, making sure length =/= 0
            lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");//last name, making sure length =/= 0 
                System.out.println("\nYour full name is: " + firstName + " " + lastName);
        }
    }

