import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Togglebutton {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Togglebutton window = new Togglebutton();
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
	public Togglebutton() {
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
		JLabel l1 = new JLabel("Message");
		l1.setBounds(184, 169, 99, 40);
		frame.getContentPane().add(l1);

		JToggleButton b1 = new JToggleButton("ON/OFF");
		b1.setBounds(152, 44, 121, 23);
		frame.getContentPane().add(b1);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(b1.isSelected())
			{
			l1.setText("OFF");
			Font f=new Font("Cambria",Font.BOLD,40);
			l1.setFont(f);
			l1.setForeground(Color.red);
			}
			else
			{
			l1.setText("ON");
			Font f=new Font("Cambria",Font.BOLD,40);
			l1.setFont(f);
			l1.setForeground(Color.blue);
			}
			}
			});
		
			}
}
