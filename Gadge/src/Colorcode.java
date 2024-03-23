import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Colorcode {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colorcode window = new Colorcode();
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
	public Colorcode() {
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
		
		JLabel lblNewLabel = new JLabel("TEXT COLOR CHANGE");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNewLabel.setBounds(161, 25, 193, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel l1 = new JLabel("Enter Text");
		l1.setBounds(52, 102, 70, 19);
		frame.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setBounds(161, 101, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel l2 = new JLabel("Message");
		l2.setBounds(172, 164, 86, 19);
		frame.getContentPane().add(l2);
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(324, 102, 30, 22);
		frame.getContentPane().add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Red", "Green", "Blue", "Yellow"}));
		
		JButton b1 = new JButton("Ok");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				if(comboBox.getSelectedItem().equals("Red"))
				{
				l2.setText(name);
				l2.setForeground(Color.RED);

				}
				else if(comboBox.getSelectedItem().equals("Green"))
				{
				l2.setText(name);
				l2.setForeground(Color.GREEN);

				}
				else if(comboBox.getSelectedItem().equals("Blue"))
				{
				l2.setText(name);
				l2.setForeground(Color.BLUE);

				}
				else if(comboBox.getSelectedItem().equals("Yellow"))
				{
				l2.setText(name);
				l2.setForeground(Color.YELLOW);

				}

			}
		});
		b1.setBounds(161, 208, 89, 23);
		frame.getContentPane().add(b1);
		
		
	}
}
