import java.util.Scanner;

/*
	ISYS 320
	Name(s): Clayton Bruce
	Date: 4/16/2018
*/

import java.util.Scanner;

public class P1_FindMinAndMax {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		// YOUR CODE STARTS HERE

		int i = 0;

		while (i >= 0) {
			System.out.print("Enter a number (or -1 or below to stop) : ");
			i = console.nextInt();

			if (i > max) {
				max = i;
			}
			else if (i < min) {
				min = i;
			}

		}
		System.out.println("Entered a negitive So we stopped");

		// YOUR CODE ENDS HERE

		System.out.println("Maximum was " + max);
		System.out.println("Minimum was " + min);
	}

}
