package calculator;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class DisplayPanel extends JPanel{
	JLabel top;
	JLabel bottom;
	
	public DisplayPanel(){
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layout);
		top = new JLabel("0", SwingConstants.RIGHT);
		bottom = new JLabel("0", SwingConstants.RIGHT);
		add(top);
		add(bottom);
	}
	
	public void setTop(int num){
		top.setText(String.valueOf(num));
	}
	public void setBottom(int num){
		bottom.setText(String.valueOf(num));
	}
}
