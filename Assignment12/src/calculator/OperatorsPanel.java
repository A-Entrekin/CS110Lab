package calculator;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class OperatorsPanel extends JPanel {
	 public OperatorsPanel(ActionListener whoCares){
		 BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		 this.setLayout(layout);
		 
		 JButton add = new JButton("+");
		 add.setActionCommand("add");
		 add.addActionListener(whoCares);
		 this.add(add);
		 
		 JButton sub = new JButton("-");
		 sub.setActionCommand("subtract");
		 sub.addActionListener(whoCares);
		 this.add(sub);
		 
		 JButton mul = new JButton("*");
		 mul.setActionCommand("multiply");
		 mul.addActionListener(whoCares);
		 this.add(mul);
		 
		 JButton div = new JButton("/");
		 div.setActionCommand("divide");
		 div.addActionListener(whoCares);
		 this.add(div);
	 }
}
