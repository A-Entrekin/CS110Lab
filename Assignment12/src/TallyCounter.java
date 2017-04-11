import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TallyCounter extends JPanel implements ActionListener {

	public JButton add;
	public int count;
	
	public TallyCounter(){
		add = new JButton("0");
		add.setActionCommand("add 1");
		add.addActionListener(this);
		add(add);
	
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if("add 1".equals(e.getActionCommand())){
			count++;
			add.setText(String.valueOf(count));
		}
		
	}
	
	private static void creatAndShowGUI(){
		JFrame frame = new JFrame();
		frame.add(new TallyCounter());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setMinimumSize(new Dimension(200, 200));
		
	}
	
	public static void main(String args[]){
		creatAndShowGUI();
	}
	
}
