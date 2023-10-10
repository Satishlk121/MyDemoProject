import java.util.Scanner;

public class Try_catch {

	public static void main(String[] args) {
		int division;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");

		int n1 = sc.nextInt();

		System.out.println("Enter second number:");

		int n2 = sc.nextInt();

		try {

			division = n1 / n2;
			System.out.println("The division is : " + division);

		}

		catch (Exception e)

		{
			System.out.println("The exception occured is :" + e);
			System.out.println("End of catch block");

			
		}

		System.out.println("After catch block");

		sc.close();

	}



	}


