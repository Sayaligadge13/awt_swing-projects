import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Radiobuttons {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Radiobuttons window = new Radiobuttons();
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
	public Radiobuttons() {
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
		
		JRadioButton rb1 = new JRadioButton("Male");
		rb1.setBounds(26, 83, 109, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Female");
		rb2.setBounds(26, 131, 109, 23);
		frame.getContentPane().add(rb2);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rb1.isSelected())
				{
					JOptionPane.showMessageDialog(null,"you are male");
			}
			if(rb2.isSelected())
			{
				JOptionPane.showMessageDialog(null,"you are Female");
			}
			}
		});
		btnNewButton.setBounds(158, 189, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("GENDER CHECKING");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNewLabel.setBounds(138, 37, 159, 33);
		frame.getContentPane().add(lblNewLabel);
	}
}
