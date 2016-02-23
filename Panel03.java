   package ciphererApp;
	import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel03 extends JPanel
   {
	   public String theWord = "";
	   public int key = 0;
	   public Panel03() {
		   
      JLabel label1 = new JLabel("Please enter the word/phrase to be Ciphered: ");
      add(label1);
      
      JTextField tBox = new JTextField("", 10);
      add(tBox);
      
      JLabel label2 = new JLabel("Enter the encryption key: ");
      label2.setVisible(false);
      add(label2);
      
      JTextField kBox = new JTextField("", 10);
      kBox.setVisible(false);
      add(kBox);
      
      
      
      JButton but2 = new JButton("Next");
      but2.setVisible(false);
      but2.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e) {
    		  key = Integer.parseInt(kBox.getText());
    		  
    		  label1.setVisible(false);
    		  label2.setVisible(false);
    		  but2.setVisible(false);
    		  tBox.setVisible(false);
    		  kBox.setVisible(false);
    		  
    		  Cipherer cipher = new Cipherer();
    		  String sentence = cipher.encrypt(theWord, key);
    	      
    	      JLabel label3 = new JLabel("Your ciphered phrase is: " + sentence);
    	      label3.setFont(new Font("Arial", Font.BOLD, 15));
    	      add(label3);
    		  
    	  }
      });
       add(but2);
      
      JButton but1 = new JButton("Next");
      but1.addActionListener(new ActionListener() {
    	  public void actionPerformed(ActionEvent e) {
    		  theWord = tBox.getText();
    		  label2.setVisible(true);
    		  kBox.setVisible(true);
    		  but1.setVisible(false);
    		  but2.setVisible(true);
    	  }
      });
      add(but1);
      
      
      
   }
	
}