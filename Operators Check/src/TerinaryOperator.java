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
		
		if (name.equals("naveen")) {
			String password = JOptionPane.showInputDialog("Enter Password: ");
			
			if (password.equals("navvi")) {
				
				isUserValid(name, password);
				
			} else {
				JOptionPane.showMessageDialog(null, "Invalid Password");
				JOptionPane.showMessageDialog(null, "Login Failed!");
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Username");
			JOptionPane.showMessageDialog(null, "Login Failed!");
			
		}	
			
	}

}
