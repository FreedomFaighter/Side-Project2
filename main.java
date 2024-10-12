package UsernameGen;

import java.util.Scanner;
import java.util.Random;
public class UsernameGen {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName, lastName, username;
		Random rand = new Random ();
		
		
		System.out.print("First Name: ");
		firstName = scan.nextLine();
	
		System.out.print("Last Name: ");
		lastName = scan.nextLine();
	
		username = firstName.charAt (0) + lastName.substring(0, 5);//starting at character 0 and stopping at 5
		username = username.toLowerCase();//making the username lowercase
	
		username = (username + (rand.nextInt(90) + 10)); //99 - 10 + 1 = 90
		System.out.print("Your username is: " + username);//display username with random number attached
		
		
		
	}
}
