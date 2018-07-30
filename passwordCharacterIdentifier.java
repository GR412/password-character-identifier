import java.util.Scanner;

public class passwordCharacterIdentifier 
{
	public static void main(String[] args) 
	{
		String password; 
		int passwordValue;
				
		Scanner passwordInput = new Scanner(System.in);
		Scanner passwordCharValueInput = new Scanner (System.in);
		
		while (true)
		{
			System.out.println("Enter a password with more than 2 and less than 32 characters: ");
		
		    password = passwordInput.nextLine();
		
		    if (password.isEmpty())
			    System.out.println("ERROR: Your password length " + "(" + password.length() + ") is empty!");
		
		    else if (password.length() < 2)
			    System.out.println("ERROR: Your password length " + "(" + password.length() + ") is smaller than 2!");
		
		    else if (password.length() > 32)
			    System.out.println("ERROR: Your password length " + "(" + password.length() + ") exceeds 32!");
			
		    else 
		    while (true)
		    {
			    System.out.println("Enter a number postion or press 0 to enter a new password");
		
		        while (!passwordCharValueInput.hasNextInt())
		        {
		        	System.out.println("Please enter a valid number!");
		        	passwordCharValueInput.next();		        	
		        }
		        
		        passwordValue = passwordCharValueInput.nextInt();	
		        		  
		        if (passwordValue < 0)
		            System.out.println("ERROR: " + passwordValue + " " + "falls short of 0!");
		
		        else if (passwordValue > password.length())
		            System.out.println("ERROR: " + passwordValue + " " + "exceeds the password length (" + password.length() + ")!");
		        
		        else if (passwordValue == 0)
		        	break;
		        		 	        						
		        else
		        System.out.println(password.charAt(passwordValue-1));
		    }			    	
	     }		
    }
}
