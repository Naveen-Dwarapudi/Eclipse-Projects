import javax.swing.JOptionPane;

public class TerinaryOperator {
	
	//Using Terinary Operator
	static void isUserValid (String username, String password) {
		String result = (username.equals("naveen") && (password.equals("navvi"))) ? "Login Success!" : "Invalid User!";
		JOptionPane.showMessageDialog(null, result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = JOptionPane.showInputDialog("Enter Username: ");
		String password = JOptionPane.showInputDialog("Enter Password: ");
		isUserValid(name, password);
			
	}

}
