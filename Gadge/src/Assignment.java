import java.awt.EventQueue;
import javax.swing.*;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Assignment {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment window = new Assignment();
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
	public Assignment() {
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
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(36, 39, 70, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(36, 86, 70, 25);
		frame.getContentPane().add(lblSubject);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setBounds(36, 122, 70, 25);
		frame.getContentPane().add(lblCode);
		
		t1 = new JTextField();
		t1.setBounds(142, 41, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(142, 88, 86, 20);
		frame.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(142, 124, 86, 20);
		frame.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals(""))
				{
				JOptionPane.showMessageDialog(null,"Please enter all data....");
				}
				else
				{
				String data[]= {t1.getText(),t2.getText(),t3.getText()};
				DefaultTableModel tbmodel= (DefaultTableModel)table.getModel();
				tbmodel.addRow(data);//to add row
				JOptionPane.showMessageDialog(null,"Data Added Successfully.........");
				//after inserting data clear the fields
				t1.setText("");
				t2.setText(null);
				t3.setText(null);
				}
				}
			
		});
		btnNewButton.setBounds(17, 195, 70, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tbModel=(DefaultTableModel)table.getModel();
				//delete row

				if(table.getSelectedRowCount()==1)
				{

				//if single row is selected then delete
				tbModel.removeRow(table.getSelectedRow());

				}
				else
				{
				if(table.getRowCount()==0)

				{
				JOptionPane.showMessageDialog(null,"Table Is Empty");
				}
				else
				{
				//it table is not empty but row is not selected or multiple row is selected
				JOptionPane.showMessageDialog(null,"Please select single row for delete.");
				}
				}
			}
		});
		btnDelete.setBounds(110, 195, 80, 39);
		frame.getContentPane().add(btnDelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tbModel=(DefaultTableModel)table.getModel();
				if(table.getSelectedRowCount()==1)
				{
				String name=t1.getText();
				String subject=t2.getText();
				String code=t3.getText();
				//to update data use the following code
				tbModel.setValueAt(name,table.getSelectedRow(),0);
				tbModel.setValueAt(subject,table.getSelectedRow(),1);
				tbModel.setValueAt(code,table.getSelectedRow(),2);
				//update message showig here
				JOptionPane.showMessageDialog(null,"Data Updated Successfully.");
				t1.setText("");
				t2.setText(null);
				t3.setText(null);
				}
				else
				{
				if(table.getRowCount()==0)
				{	
				//it table is empty
				JOptionPane.showMessageDialog(null,"Table is Empty.");
				}
				else
				{	
				//if row is not selected
				JOptionPane.showMessageDialog(null,"Please Select Single Row For Update record.");
				}
				}
			}
		});
		btnUpdate.setBounds(221, 195, 86, 39);
		frame.getContentPane().add(btnUpdate);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel tbmodel=(DefaultTableModel)table.getModel();
				//set data to text field when row is selected
				String tbname=tbmodel.getValueAt(table.getSelectedRow(), 0).toString();
				String tbsubject=tbmodel.getValueAt(table.getSelectedRow(), 1).toString();
				String tbcode=tbmodel.getValueAt(table.getSelectedRow(), 2).toString();
				t1.setText(tbname);
				t2.setText(tbsubject);
				t3.setText(tbcode);
			}
		});
		scrollPane.setBounds(258, 39, 166, 144);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Subject", "Code"
			}
		));
	}

}
