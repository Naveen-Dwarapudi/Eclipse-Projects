import java.util.Scanner;

public class UnaryOperator {
	
	//Using Not Operator
	static void isUserValid (String username, String password) {
		String result = (username.equals("naveen") && (password.equals("navvi"))) ? "Login Success!" : "Invalid User!";
		System.out.println(result);
	}
	
	//Increment Operator
	static void increment (int num) {
		int result = ++num;
		System.out.println(result);
	}

	//Decrement Operator
	static void decrement (int num) {
		int result = --num;
	    System.out.println(result);
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String name = scanner.nextLine();
		System.out.println("Enter Password: ");
		String password = scanner.nextLine();
		isUserValid(name, password);
		System.out.println("Enter Value for increment: ");
		int num = scanner.nextInt();
		System.out.println("Incremented value is: ");
		increment(num);
		System.out.println("Decremented Value is: ");
		decrement(num);
	}

}
