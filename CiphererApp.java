package ciphererApp;
import javax.swing.JFrame;

class CiphererApp extends Panel03 {
	public static void main(String[] args) {
		
		   JFrame frame=new JFrame("Cipherer");
		   frame.setSize(400,200);
		   frame.setLocation(200,100);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setContentPane(new Panel03());
		   frame.setVisible(true);
		   frame.setAlwaysOnTop(true);
		
		// System.out.println("Your ciphered phrase is: " + cipheredSentence);
	}
}




