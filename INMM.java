import java.util.Scanner;
import java.util.InputMismatchException;

 class INMM{

	static int result;
	public static void main(String[] args)  throws InputMismatchException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome");
		
		//Creating Menu
		try{
			System.out.println();
			System.out.println("Enter first number::");
			int firstNumber = scan.nextInt();
			System.out.println("Enter second number::");
			int secondNumber = scan.nextInt();
			
			System.out.println("To perform addition, Enter 1");
			System.out.println("To perform subtraction, Enter 2");
			System.out.println("To perform division, Enter 3");
			System.out.println("To perform multiplication, Enter 4");
			System.out.println("To Exit, Enter 9");

			System.out.println();
			System.out.println("Enter choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("Adding the numbers");
			add(firstNumber, secondNumber);
			break;
			case 2: System.out.println("Subtracting the numbers");
			subtract(firstNumber, secondNumber);
			break;
			case 3: System.out.println("Dividing the numbers");
			divide(firstNumber, secondNumber);
			break;
			case 4: System.out.println("Multiplying the numbers");
			multiply(firstNumber, secondNumber);
			break;
			case 9: System.out.println("Thanks , Visit again");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}catch(InputMismatchException ex) {
        ex.printStackTrace();
		}
		finally{
			System.out.println("Enter input in integer format");
		}

	}
	
	//Method for addition
	public static void add(int num1, int num2){
		result = num1+num2;
		System.out.println("Addition result="+ result);
		
	}
	//Method for subtraction
	public static void subtract(int num1, int num2){
		result = num1-num2;
		System.out.println("Subtraction result="+ result);
	}
	//Method for multiplication
	public static void multiply(int num1, int num2){
		result = num1*num2;
		System.out.println("Multiplication result="+ result);
	}
	//Method for division
	public static void divide(int num1, int num2){
		result = num1/num2;
		System.out.println("Division result="+ result);
	}

}