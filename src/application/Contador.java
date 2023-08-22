package application;

import java.util.Scanner;

import customized.exceptions.InvalidParameterException;

public class Contador {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.print("Type the first parameter: ");
			Integer parameter1 = input.nextInt();
			System.out.print("Type the second parameter: ");
			Integer parameter2 = input.nextInt();

			toCount(parameter1, parameter2);
		} catch (RuntimeException e) {
			throw new InvalidParameterException("Error: Second parameter needs to be less than second parameter.");
		} finally {
			if (input != null) {
				input.close();
			}
		}
	}

	public static void toCount(int parameter1, int parameter2) {
		if (parameter1 > parameter2) {
			throw new RuntimeException();
		} 
		else {
			System.out.printf("\nCounting from %d to %d:\n", parameter1, parameter2);
			
			for (int i = parameter1; i >= parameter2; i++) {
				System.out.println("|" + i + "| ");
			}
		}
	}

}
