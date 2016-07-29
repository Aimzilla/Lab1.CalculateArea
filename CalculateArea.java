import java.util.Scanner;
//testing github push
public class CalculateArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float width;
		float length;
		String choice = "y";
		

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Enter Length:");
			length = input.nextFloat();

			System.out.print("Enter Width:");
			width = input.nextFloat();

			float area = (width * length);
			System.out.println("Area:" + area);

			float perimeter = (2 * width) + (2 * length);
			System.out.println("Perimeter:" + perimeter);

			// garbage line to clean input stream
			input.nextLine();

			System.out.println("Would you like to continue? (y/n)");
			choice = input.nextLine();
			System.out.println();
		}
		input.close();
	}

}
