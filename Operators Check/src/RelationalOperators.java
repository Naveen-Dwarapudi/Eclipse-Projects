
public class RelationalOperators {
	
	//Equals to Operator 
	static void equalToOp(String var1, String var2) {
		System.out.println(var1 == var2);
	}

	//Not Equals to Operator
	static void notEqualToOp(String var1, String var2) {
		System.out.println(var1 != var2);
	}
	
	//Greater Than and Greater than or Equal to Operator
	static void isgreaterThan(int num1, int num2) {
		System.out.println(num1 >= num2);
	}
	
	//Lessthan and lessthan or equal to is similar to greater than
	
	//
	
	public static void main(String[] args) {
		
		equalToOp("naveen", "naveen");
		notEqualToOp("naveen", "naveen");
		isgreaterThan(10, 2);
	}

}
