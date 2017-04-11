package calculator;
import java.awt.event.ActionListener;

import javax.swing.*;


public class NumPad extends JPanel {
	public NumPad(ActionListener whoCares){
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layout);
		for(int i = 2; i >= 0; i--){
			JPanel innerPanel = new JPanel();
			BoxLayout innerLayout = new BoxLayout(innerPanel, BoxLayout.X_AXIS);
			innerPanel.setLayout(innerLayout);
			for(int j = 0; j < 3; j++){
				String s = String.valueOf(i * 3 + j + 1);
				JButton button = new JButton(s);
				button.setActionCommand(s);
				button.addActionListener(whoCares);
				innerPanel.add(button);
			}
			this.add(innerPanel);
		}
		String s = "0";
		JButton zero = new JButton(s);
		zero.setActionCommand(s);
		zero.addActionListener(whoCares);
		add(zero);
	}
}
