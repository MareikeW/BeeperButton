import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//* Button makes a noise when clicked and number of times button is clicked gets count */

public class Beeper extends JFrame {
	JButton button;
	JLabel emptylabel;
	JLabel label;
	int counter = 0, x = 0;
	String s;
	
	//Constructor
	public Beeper() {
		setLayout(new FlowLayout());
		
		emptylabel = new JLabel(" "); //empty line
		add(emptylabel);
		
		button = new JButton("Click me and I'll make a sound!");
		add(button);
		
		label = new JLabel("");//first empty label
		add(label);
		
		event e = new event(); //make button do something
		button.addActionListener(e);
	}
	
	public class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Toolkit.getDefaultToolkit().beep(); //makes beeping sound
			counter++; //counts each time user clicks button
			if (x==0) {
				s = "time"; //after one click
			} else if (x==1) {
				s = "times"; //after >1 click
			}
			
			label.setText("You've clicked "+ counter +" "+ s);//label says how many times user had clicked button
			x = 1; //after clicked x becomes 1 so "time" --> "times"
		}
	}
	
	public static void main(String[] args) {
		Beeper frame = new Beeper(); //create window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setTitle("Beeper");
	}
}
