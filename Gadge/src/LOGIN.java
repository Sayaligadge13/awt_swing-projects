import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LOGIN {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
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
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 15));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setBounds(169, 33, 75, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel PASSWORD = new JLabel("PASSWORD");
		PASSWORD.setBounds(36, 129, 110, 14);
		frame.getContentPane().add(PASSWORD);
		
		JLabel lblNewLabel_2 = new JLabel("USERNAME");
		lblNewLabel_2.setBounds(36, 85, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(144, 85, 151, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=t1.getText();
				String password=t2.getText();
				
				if(password.contains("world")&& username.contains("hello"))
				{
					t1.setText(null);
					t2.setText(null);
				}
				else
				{
	JOptionPane.showMessageDialog(null,"INVALID LOGIN","ERROR",JOptionPane.ERROR_MESSAGE);
					t1.setText(null);
					t2.setText(null);
				
				}
			}
		});
		btnNewButton.setBounds(22, 188, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				}
		});
		btnNewButton_1.setBounds(155, 188, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(287, 188, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		t2 = new JPasswordField();
		t2.setBounds(144, 129, 151, 20);
		frame.getContentPane().add(t2);
		
		}
}
