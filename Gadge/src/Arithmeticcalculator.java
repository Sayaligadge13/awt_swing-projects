import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Arithmeticcalculator {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Arithmeticcalculator window = new Arithmeticcalculator();
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
	public Arithmeticcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 548, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("Arithmetic Calculator");
		l1.setFont(new Font("Cambria", Font.BOLD, 15));
		l1.setBounds(137, 11, 179, 27);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("No 1");
		l2.setBounds(36, 56, 46, 14);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("No 2");
		l3.setBounds(36, 81, 46, 14);
		frame.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("Addition");
		l4.setBounds(36, 106, 70, 14);
		frame.getContentPane().add(l4);
		
		JLabel l5 = new JLabel("Substraction");
		l5.setBounds(36, 131, 70, 14);
		frame.getContentPane().add(l5);
		
		JLabel l6 = new JLabel("Multiplication");
		l6.setBounds(36, 156, 70, 14);
		frame.getContentPane().add(l6);
		
		JLabel l7 = new JLabel("Division");
		l7.setBounds(36, 181, 59, 14);
		frame.getContentPane().add(l7);
		
		t1 = new JTextField();
		t1.setBounds(147, 49, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(147, 78, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(147, 103, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(147, 128, 86, 20);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(147, 153, 86, 20);
		frame.getContentPane().add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setBounds(147, 178, 86, 20);
		frame.getContentPane().add(t6);
		t6.setColumns(10);
		
		Button button = new Button("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,c;
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=a+b;
				t3.setText(""+c);
			}
		});
		button.setBounds(12, 217, 70, 22);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,c;
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=a-b;
				t4.setText(""+c);
			}
		});
		button_1.setBounds(97, 217, 70, 22);
		frame.getContentPane().add(button_1);
		
		Button button_2 = new Button("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,c;
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=a*b;
				t5.setText(""+c);
			}
		});
		button_2.setBounds(185, 217, 70, 22);
		frame.getContentPane().add(button_2);
		
		Button button_3 = new Button("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a/b;
			t6.setText(""+c);
			}
		});
		button_3.setBounds(272, 217, 70, 22);
		frame.getContentPane().add(button_3);
		
		Button button_4 = new Button("clear");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				
			}
		});
		button_4.setBounds(354, 217, 70, 22);
		frame.getContentPane().add(button_4);
		
		Button button_5 = new Button("Exit");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_5.setBounds(430, 217, 77, 27);
		frame.getContentPane().add(button_5);
	}
}
