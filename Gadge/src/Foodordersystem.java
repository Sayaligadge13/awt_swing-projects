import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Foodordersystem {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Foodordersystem window = new Foodordersystem();
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
	public Foodordersystem() {
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
		
		JLabel lblNewLabel = new JLabel("FOOD ORDERING SYSTEM");
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 16));
		lblNewLabel.setBounds(121, 25, 219, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox cb1 = new JCheckBox("Pizza@Rs 100/-");
		cb1.setBounds(55, 74, 176, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Burger@Rs 55/-");
		cb2.setBounds(55, 115, 176, 23);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("Tea@Rs 15/-");
		cb3.setBounds(55, 158, 176, 23);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float amount=0;
				String msg="";
				if(cb1.isSelected())
				{
					amount+=100;
					msg="pizza:100\n";
				}
				if(cb2.isSelected())
				{
					amount+=55;
					msg="Burger:55\n";
				}
				if(cb3.isSelected())
				{
					amount+=15;
					msg="Tea:15\n";
					
				}
				msg+="----------\\n";
				JOptionPane.showMessageDialog(btnNewButton, this,msg+"Total:"+amount,0);
					
			}
		});
		btnNewButton.setBounds(55, 214, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
