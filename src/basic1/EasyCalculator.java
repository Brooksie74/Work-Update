package basic1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class EasyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField TxtDisplay;
	private double total1 = 0.0;
	private double total2 = 0.0;
	private char CalculatorOp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EasyCalculator frame = new EasyCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	
			try
			{
				int i = 1000/0;
			}
		catch (Exception e)
			{
			}
			}
			});
	}

	
	private void getOperator(String btnText) {
		CalculatorOp = btnText.charAt(0);
		total1 = total1 + Double.parseDouble(TxtDisplay.getText());
		TxtDisplay.setText("");
		
	}
	/**
	 * Create the frame.
	 */
	public EasyCalculator() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 324);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new CompoundBorder(new CompoundBorder(), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TxtDisplay = new JTextField();
		TxtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		TxtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 22));
		TxtDisplay.setForeground(Color.GREEN);
		TxtDisplay.setBackground(Color.BLACK);
		TxtDisplay.setBounds(10, 11, 230, 47);
		contentPane.add(TxtDisplay);
		TxtDisplay.setColumns(10);
		
		JButton Btn7 = new JButton("7");
		Btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String Btn7Text = TxtDisplay.getText() + Btn7.getText();
			TxtDisplay.setText(Btn7Text);
			
			}
		});
		Btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn7.setBackground(Color.GRAY);
		Btn7.setBounds(10, 69, 50, 30);
		contentPane.add(Btn7);
		
		JButton Btn8 = new JButton("8");
		Btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Btn8Text = TxtDisplay.getText() + Btn8.getText();
				TxtDisplay.setText(Btn8Text);
			}
		});
		Btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn8.setBackground(Color.GRAY);
		Btn8.setBounds(70, 69, 50, 30);
		contentPane.add(Btn8);
		
		JButton Btn9 = new JButton("9");
		Btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Btn9Text = TxtDisplay.getText() + Btn9.getText();
				TxtDisplay.setText(Btn9Text);
			}
		});
		Btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn9.setBackground(Color.GRAY);
		Btn9.setBounds(130, 69, 50, 30);
		contentPane.add(Btn9);
		
		JButton BtnAdd = new JButton("+");
		BtnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = BtnAdd.getText();
				getOperator(button_text);
				}
		});
		BtnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtnAdd.setBackground(Color.GRAY);
		BtnAdd.setBounds(190, 69, 50, 30);
		contentPane.add(BtnAdd);
		
		JButton Btn4 = new JButton("4");
		Btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Btn4Text = TxtDisplay.getText() + Btn4.getText();
				TxtDisplay.setText(Btn4Text);
			}
		});
		Btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn4.setBackground(Color.GRAY);
		Btn4.setBounds(10, 110, 50, 30);
		contentPane.add(Btn4);
		
		JButton Btn5 = new JButton("5");
		Btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Btn5Text = TxtDisplay.getText() + Btn5.getText();
				TxtDisplay.setText(Btn5Text);
			}
		});
		Btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn5.setBackground(Color.GRAY);
		Btn5.setBounds(70, 110, 50, 30);
		contentPane.add(Btn5);
		
		JButton Btn6 = new JButton("6");
		Btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Btn6Text = TxtDisplay.getText() + Btn6.getText();
				TxtDisplay.setText(Btn6Text);
			}
		});
		Btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn6.setBackground(Color.GRAY);
		Btn6.setBounds(130, 110, 50, 30);
		contentPane.add(Btn6);
		
		JButton BtnSub = new JButton("-");
		BtnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = BtnSub.getText();
				getOperator(button_text);
			}
		});
		BtnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtnSub.setBackground(Color.GRAY);
		BtnSub.setBounds(190, 110, 50, 30);
		contentPane.add(BtnSub);
		
		JButton Btn1 = new JButton("1");
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String Btn1Text = TxtDisplay.getText() + Btn1.getText();
				TxtDisplay.setText(Btn1Text);}
		});
		Btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn1.setBackground(Color.GRAY);
		Btn1.setBounds(10, 151, 50, 30);
		contentPane.add(Btn1);
		
		JButton Btn2 = new JButton("2");
		Btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Btn2Text = TxtDisplay.getText() + Btn2.getText();
				TxtDisplay.setText(Btn2Text);
			}
		});
		Btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn2.setBackground(Color.GRAY);
		Btn2.setBounds(70, 151, 50, 30);
		contentPane.add(Btn2);
		
		JButton Btn3 = new JButton("3");
		Btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Btn3Text = TxtDisplay.getText() + Btn3.getText();
				TxtDisplay.setText(Btn3Text);
			}
		});
		Btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn3.setBackground(Color.GRAY);
		Btn3.setBounds(130, 151, 50, 30);
		contentPane.add(Btn3);
		
		JButton BtnMult = new JButton("*");
		BtnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = BtnMult.getText();
				getOperator(button_text);
			}
		});
		BtnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtnMult.setBackground(Color.GRAY);
		BtnMult.setBounds(190, 151, 50, 30);
		contentPane.add(BtnMult);
		
		JButton Btn0 = new JButton("0");
		Btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Btn0Text = TxtDisplay.getText() + Btn0.getText();
				TxtDisplay.setText(Btn0Text);
			}
		});
		Btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		Btn0.setBackground(Color.GRAY);
		Btn0.setBounds(10, 192, 50, 30);
		contentPane.add(Btn0);
		
		JButton BtnDec = new JButton(".");
		BtnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = BtnDec.getText();
				getOperator(button_text);
			}
		});
		BtnDec.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtnDec.setBackground(Color.GRAY);
		BtnDec.setBounds(70, 192, 50, 30);
		contentPane.add(BtnDec);
		
		JButton BtnEqual = new JButton("=");
		BtnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (CalculatorOp) {
				
				case '+' :
				total2 = total1 + Double.parseDouble(TxtDisplay.getText());
				break;
				
				case '-' :
					total2 = total1 - Double.parseDouble(TxtDisplay.getText());
					break;
				
				case '/' :
					total2 = total1 / Double.parseDouble(TxtDisplay.getText());
					break;
					
				case '*' :
					total2 = total1 * Double.parseDouble(TxtDisplay.getText());
					break;
				
				case '.' :
					total2 = total1 * Double.parseDouble(TxtDisplay.getText());
					break;

				
				}
				
			TxtDisplay.setText(Double.toString(total2));
				total1 = 0;
			}
		});
		BtnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtnEqual.setBackground(Color.GRAY);
		BtnEqual.setBounds(130, 192, 50, 30);
		contentPane.add(BtnEqual);
		
		JButton BtnDiv = new JButton("/");
		BtnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button_text = BtnDiv.getText();
				getOperator(button_text);
			}
		});
		BtnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtnDiv.setBackground(Color.GRAY);
		BtnDiv.setBounds(190, 192, 50, 30);
		contentPane.add(BtnDiv);
		
		JButton BtnClear = new JButton("Clear");
		BtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total2 = 0;
				TxtDisplay.setText("");
					
			}
		});
		BtnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		BtnClear.setBackground(Color.GRAY);
		BtnClear.setBounds(130, 233, 110, 30);
		contentPane.add(BtnClear);
	}
}
