
public class LogicalOperators {

	//Logical And Operator
	static void and(int num1, int num2) {
		if (num1 > 5 && num2 < 10) {
			System.out.println(num1 + num2);
		} else {
			System.out.println("invalid data");
		}
	}
	
	//Logical Or Operator 
	static void or(int num1, int num2) {
		if (num1 > 5 || num2 >5) {
			System.out.println(num1+num2);
		} else {
			System.out.println("invalid data");
		}
	}
	
	//Logical Not Operator 
	static void not(int num1, int num2) {
		if (!(num1 > 5)) {
			System.out.println(num1 * num2);
		} else {
			System.out.println("invalid data");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		and(5,10);
		or(5,10);
		not(6, 10);
	}

}
