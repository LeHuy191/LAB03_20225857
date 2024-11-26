package hust.soict.dsai.lab01;
//Ex6.1: Chọn Yes/No
import javax.swing.JOptionPane;

public class ChoosingOption {

	public static void main(String[] args) {
		 int option = JOptionPane.showConfirmDialog(null, 
				 "Do you want to change to the first class ticket?");

	     JOptionPane.showMessageDialog(null, "You've chosen: " 
	            + (option == JOptionPane.YES_OPTION ? "Yes":"No"));
	        System.exit(0);
	}

}

