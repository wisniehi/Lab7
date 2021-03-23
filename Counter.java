import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {
  JLabel label;
ButtonDemo() {
	JFrame frame = new JFrame("Let's count");
	frame.setLayout(new FlowLayout());
	frame.setSize(200,110);

JButton left = new JButton("Left");
	JButton right = new JButton("Right");

  int leftCount =0;
  int rightCount=0;

left.addActionListener(this);
right.addActionListener(this);

frame.add(left);
frame.add(right);

labelLeft = ("Count: ");
rghtLabel = ("Count: ");
frame.add(leftLabel);
frame.add(rightLabel);

JButton reset = new JButton ("Reset");
	frame.add(reset);
	frame.setVisible(true);

int count leftButton++;
int count rightButton++;
} 
public void actionPerformed(ActionEvent ae) {
   if(ae.getActionCommand().equals("Left")) {
	labelcount = 0; leftCount++ )("You pressed left");
   }
   if
   else {
	label.setText("You pressed right");
   }


}
}
