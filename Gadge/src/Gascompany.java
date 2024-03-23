import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gascompany {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gascompany window = new Gascompany();
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
	public Gascompany() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	double smallgas=1000.0;
	double biggas=2000.0;
	double tot;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GAS COMPANY");
		lblNewLabel.setFont(new Font("Cambria", Font.ITALIC, 18));
		lblNewLabel.setBounds(178, 23, 155, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rb1 = new JRadioButton("Small Gas");
		rb1.setFont(new Font("Cambria", Font.ITALIC, 11));
		rb1.setBounds(71, 83, 109, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Big Gas");
		rb2.setFont(new Font("Cambria", Font.ITALIC, 11));
		rb2.setBounds(71, 147, 109, 23);
		frame.getContentPane().add(rb2);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rb1.isSelected())
				{
				tot=smallgas*1;
				}
				if(rb2.isSelected())
				{
				tot=biggas*1;
				}
				JOptionPane.showMessageDialog(null,Double.valueOf(tot));
				
			}
			
		});
		btnNewButton.setBounds(266, 115, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
