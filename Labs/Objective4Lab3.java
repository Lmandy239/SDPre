import java.util.Scanner;

	public class Objective4Lab3 {
		public static void main (String[] args) {

			Scanner input = new Scanner(System.in);
			int birthYear, age, currentYear;

			birthYear = 0;

			System.out.println("How old are you?");
			age = input.nextInt();
			currentYear = 2023;
			birthYear = (currentYear - age);

			System.out.println("You were born in " + birthYear);
			input.close();
			

		}



	}