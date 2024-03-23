import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Electricitybill {

	private JFrame frame;
	private JTextField t3;
	private JTextField t2;
	private JTextField t1;
	JTextArea ta = new JTextArea();

	
	/**
	 * Launch the application.
	 */
	public static void main(String args[]){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Electricitybill window = new Electricitybill();
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
	public Electricitybill() {
		initialize();
	}
		String cid,cname,unit;
		double charge,grandtotal;
		int count;
		public void print()
		{
			cid=t3.getText();
			cname=t2.getText();
			unit=t1.getText();
			ta.setText(ta.getText()+"\n");
			ta.setText(ta.getText()+"Electricity Billing System"+"\n");
		    ta.setText(ta.getText()+"\n");
			ta.setText(ta.getText()+"Costomer ID:"+cid+"\n");
			ta.setText(ta.getText()+"Costomer Name:"+cname+"\n");
			ta.setText(ta.getText()+"Unit:"+unit+"\n");
			ta.setText(ta.getText()+"Amount:"+grandtotal+"\n");
			ta.setText(ta.getText()+"Thank you visit again");
			
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("ELECTRICITY BILL");
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		l1.setBounds(147, 22, 173, 29);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("COSTOMER ID");
		l2.setBounds(44, 76, 89, 14);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("COSTOMER NAME");
		l3.setBounds(44, 113, 96, 14);
		frame.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("UNIT");
		l4.setBounds(44, 149, 46, 14);
		frame.getContentPane().add(l4);
		
		t3 = new JTextField();
		t3.setBounds(153, 73, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(153, 110, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t1 = new JTextField();
		t1.setBounds(153, 146, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		
		ta.setBounds(249, 71, 153, 115);
		frame.getContentPane().add(ta);
		
		Button button = new Button("CAL");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cid=t3.getText();
				count=Integer.parseInt(t1.getText());
				if(count<500)
				{
					charge=1.00;
					
				}
				else if(count<500 && count<800)
				{
					charge=1.80;
				}
				else if(count<600 && count<800)
				{
					charge=2.80;
				}
				else
				{
					charge=3.00;
				}
				grandtotal=charge*count;
				JOptionPane.showMessageDialog(null, "grandtotal:"+ grandtotal);
				
			}
		});
		button.setBounds(44, 209, 70, 22);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("PRINT");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				print();
				
			}
		});
		button_1.setBounds(286, 209, 70, 22);
		frame.getContentPane().add(button_1);
		
		
		ta.setBounds(273, 71, 120, 118);
		frame.getContentPane().add(ta);
		
		
		ta.setBounds(273, 71, 129, 115);
		frame.getContentPane().add(ta);
	}
}
