import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Operations {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Operations window = new Operations();
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
	public Operations() {
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
		
		JLabel lblNewLabel = new JLabel("String Operations");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel.setBounds(124, 11, 203, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Upperstring");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				t2.setText(""+s1.toUpperCase());
			}
		});
		btnNewButton_1.setBounds(37, 92, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Lowercase");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				t3.setText(""+s1.toLowerCase());
			}
		});
		btnNewButton_2.setBounds(37, 126, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Bold");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				Font f=new Font("Cambria",Font.BOLD,18);
				t4.setFont(f);
				t4.setText(s1);
			}
		});
		btnNewButton_3.setBounds(37, 160, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Italic");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				Font f=new Font("Cambria",Font.ITALIC,18);
				t5.setFont(f);
				t5.setText(s1);
			}
		});
		btnNewButton_4.setBounds(37, 194, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		t1 = new JTextField();
		t1.setBounds(181, 59, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(181, 93, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(181, 127, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(181, 161, 86, 20);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(181, 195, 86, 20);
		frame.getContentPane().add(t5);
		t5.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Enter string");
		lblNewLabel_1.setBounds(52, 58, 83, 19);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
