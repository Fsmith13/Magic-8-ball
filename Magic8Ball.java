// Filename: Magic8Ball.java
// Author: Frank
// Date: 2/11/19

import java.util.Scanner;

public class Magic8Ball
{
	public static void main(String[] args)
	{
		// variables and constants
		String question;
		int randomNum;
		String[] responses = {"It is decidedly so.", "Better not tell you now.", "My reply is no.", "Without a doubt.", "My sources say no."};
		final String QUIT = "QUIT";
		Scanner keyboard = new Scanner(System.in);

		System.out.print("The Magic 8-Ball knows all! Type your yes or no question. Or type " + QUIT + " to return to your ordinary life!");
		question = keyboard.nextLine();

		while(!question.equalsIgnoreCase(QUIT))
		{
			randomNum = ((int)Math.random() * responses.length);
			System.out.println("The Magic 8-Ball says: " + responses[randomNum]);
			System.out.print("Would you like to ask another question? \nEnter your yes or no question. Or type " + QUIT + " to return to your ordinary life!");
		}
	}
}