import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class CalculatorGui implements ActionListener{
 //JFrame:windows frame
	private JFrame frame;
	//Jpanel:separate sections in a frame
	private JPanel panel;
	//JTextField:for user input
	private JLabel label;
	private JLabel output;
	//JButton: user can click
	private JTextField textField1;
	private JTextField textField2;
	private JButton button;
	public CalculatorGui(){
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(320,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.GREEN);
		
		
		label = new JLabel();
		label.setText("Enter the number");
		output =new JLabel();
		output.setText("-----");
		label.setForeground(Color.WHITE);
		
		textField1 = new JTextField(5);
		textField2 = new JTextField(5);
		
		button = new JButton("Find Sum");
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(button);
		panel.add(output);
		
		frame.add(panel);
		
	}
	public void actionPerformed(ActionEvent e){
		double num1 =Double.parseDouble(textField1.getText());
		double num2 =Double.parseDouble(textField2.getText());
		double sum = num1 +num2;
		output.setText(String.valueOf(sum));
		
		
	}
}
