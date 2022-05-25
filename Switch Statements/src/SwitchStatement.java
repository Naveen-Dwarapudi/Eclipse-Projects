import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the day name: ");
		String day = scanner.nextLine();
		
		switch (day) {
		case "Monday":System.out.println("Today is " + day);
		break;
		case "Tuesday":System.out.println("Today is " + day);
		break;
		case "Wednesday":System.out.println("Today is " + day);
		break;
		case "Thursday":System.out.println("Today is " + day);
		break;
		case "Friday":System.out.println("Today is " + day);
		break;
		case "Saturday":System.out.println("Today is " + day);
		break;
		case "Sunday":System.out.println("Today is " + day);
		break;
		default:System.out.println("That is not a day!");
		}

	}

}
