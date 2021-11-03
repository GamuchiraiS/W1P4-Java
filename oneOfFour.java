import java.util.*;
import java.lang.*;

public class oneOfFour {
	public static void main(String [] args){
		char letter;
		String stringLetter;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a letter: ");
		stringLetter = sc.nextLine().toLowerCase();
		letter = stringLetter.charAt(0);


		if (letter == 'a' || letter == 'e' ||
        	letter == 'i' || letter == 'o' ||
            letter == 'u') {
			System.out.println(letter + " is a vowel.");
		}

		else {
			System.out.println(letter + " is a consonant.");
		}

	}

}