import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setBounds(165, 22, 93, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number 1");
		lblNewLabel_1.setBounds(51, 80, 77, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number 2");
		lblNewLabel_2.setBounds(51, 119, 77, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(155, 74, 142, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(155, 116, 142, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
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
		button.setBounds(35, 164, 70, 22);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,c;
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=a-b;
				t3.setText(""+c);
			}
		});
		button_1.setBounds(131, 164, 70, 22);
		frame.getContentPane().add(button_1);
		
		Button button_2 = new Button("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,c;
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=a*b;
				t3.setText(""+c);
			}
		});
		button_2.setBounds(227, 164, 70, 22);
		frame.getContentPane().add(button_2);
		
		Button button_3 = new Button("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,c;
				a=Integer.parseInt(t1.getText());
				b=Integer.parseInt(t2.getText());
				c=a/b;
				t3.setText(""+c);
			}
		});
		button_3.setBounds(328, 164, 70, 22);
		frame.getContentPane().add(button_3);
		
		JLabel lblNewLabel_3 = new JLabel("Result");
		lblNewLabel_3.setBounds(160, 220, 61, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		t3 = new JTextField();
		t3.setBounds(227, 217, 70, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
	}
}
