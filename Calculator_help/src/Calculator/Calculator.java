package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstnum;
	double secondnum;
	String  operations;
	String answer;
	double result;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 266, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 230, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		
		
	 
	
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String EnterNumber =textField.getText() +  btn7.getText();	
			textField.setText(EnterNumber);
			
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 54, 55, 52);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText() +  btn8.getText();	
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(69, 54, 60, 52);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText() +  btn9.getText();	
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(122, 54, 55, 52);
		frame.getContentPane().add(btn9);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			firstnum=Double.parseDouble(textField.getText());
		textField.setText("");
		operations="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplus.setBounds(178, 54, 60, 52);
		frame.getContentPane().add(btnplus);
		////////////////////////////////////////////////////////////////////////////////////////
		
		

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText() +  btn4.getText();	
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 110, 55, 52);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText() +  btn5.getText();	
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(69, 110, 60, 52);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText() +  btn6.getText();	
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(122, 110, 55, 52);
		frame.getContentPane().add(btn6);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsub.setBounds(178, 110, 60, 52);
		frame.getContentPane().add(btnsub);
		
		////////////////////////////////////////////////////////////////////////////////////////////
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText() +  btn1.getText();	
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 166, 55, 52);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText() +  btn2.getText();	
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(69, 166, 60, 52);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText() +  btn3.getText();	
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(122, 166, 55, 52);
		frame.getContentPane().add(btn3);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmul.setBounds(178,166, 60, 52);
		frame.getContentPane().add(btnmul);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText() +  btn0.getText();	
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 222, 55, 52);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber =textField.getText() +  btnDot.getText();	
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(69, 222, 60, 52);
		frame.getContentPane().add(btnDot);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(textField.getText());
				textField.setText("");
				operations="/";
				
			}
			
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(122, 222, 55, 52);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum= Double.parseDouble(textField.getText());
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%2f",result);
					textField.setText(answer);
				}
				else if(operations == "-")
				{
					result = firstnum + secondnum;
					answer = String.format("%2f",result);
					textField.setText(answer);
				}
				else if(operations == "*")
				{
					result = firstnum + secondnum;
					answer = String.format("%2f",result);
					textField.setText(answer);
				}
				else if(operations == "/")
				{
					result = firstnum + secondnum;
					answer = String.format("%2f",result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(178, 222, 60, 52);
		frame.getContentPane().add(btnEqual);

///////////////////////////////////////////////////////////////////////////////////


	
			
		////////////////////////////////////////////////////////////////////////////////////////
		

	

	}
}
