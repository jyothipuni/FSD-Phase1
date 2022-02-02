package validation_of_email;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class validationOfEmail
{
		   public static boolean isValidEmail(String email)
		   {
			   String regex = "^(.+)@(.+)$";
			 //Initialize the Pattern object
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(email);
		       return matcher.matches();	       
		   }

		   public static void main(String[] args) 
		  {
		       List<String> emails = new ArrayList<String>();
		       // valid email addresses
		       emails.add("jyothi@example.com");
		       emails.add("geetha@example.com");
		       emails.add("shruthi@example.me.org");
		       
		       //invalid email addresses
		       emails.add("ram.example.com");
		       emails.add("srivarun@example..com");
		       emails.add("varun@.example.com");

		       for (String value : emails)
		       {
		           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
		       }
		       
		       System.out.println("Enter any email address to check");
		       Scanner sc = new Scanner(System.in);
		       String input = sc.nextLine();
		       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
		       
		   }
		   
}
