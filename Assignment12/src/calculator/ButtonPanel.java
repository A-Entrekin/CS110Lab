package calculator;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class ButtonPanel extends JPanel {
	public ButtonPanel(ActionListener whoCares){
		BoxLayout layout = new BoxLayout(this, BoxLayout.X_AXIS);
		this.setLayout(layout);
		add(new NumPad(whoCares));
		add(new OperatorsPanel(whoCares));
	}
}
