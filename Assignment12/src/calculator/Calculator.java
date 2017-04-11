package calculator;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;


public class Calculator extends JFrame implements ActionListener {
	int register = 0;
	int input    = 0;
	DisplayPanel out;
	
	public Calculator(){
		BoxLayout layout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		this.getContentPane().setLayout(layout);
		out = new DisplayPanel();
		add(out);
		add(new ButtonPanel(this));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		if(e.getActionCommand().equals("add")){
			register += input;
			input = 0;
		}else if(e.getActionCommand().equals("subtract")){
			register -= input;
			input = 0;
		}else if(e.getActionCommand().equals("multiply")){
			register *= input;
			input = 0;
		}else if(e.getActionCommand().equals("divide")){
			try{
				register /= input;
			}catch(ArithmeticException ex){
				register = 0;
			}
			input = 0;
		}else{
			int in = Integer.parseInt(e.getActionCommand());
			input *= 10;
			input += in;
		}
		
		out.setTop(register);
		out.setBottom(input);
		
	}
	
	public static void main(String args[]){
		Calculator frame = new Calculator();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setMinimumSize(new Dimension(200, 200));
	}
	
}
