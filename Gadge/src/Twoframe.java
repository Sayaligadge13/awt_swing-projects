import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Twoframe extends JFrame implements ActionListener
{
JFrame f1,f2;
JLabel l1,l2,l3,l4,l5,l6,l7;
JTextField t1,t3,t4,t5;
JPasswordField t2;
JButton b1,b2;
Twoframe()
{
f1=new JFrame();
l1=new JLabel("Login Page");
l1.setBounds(80,20,170,20);

l2=new JLabel("Username");
l2.setBounds(20,50,170,20);
t1=new JTextField();
t1.setBounds(100,50,70,20);
l3=new JLabel("Password");
l3.setBounds(20,80,170,20);
t2=new JPasswordField();
t2.setBounds(100,80,70,20);
b1=new JButton("Login");
b1.setBounds(40,130,100,20);
f1.add(l1);
f1.add(l2);
f1.add(t1);
f1.add(l3);
f1.add(t2);
f1.add(b1);
b1.addActionListener(this);
f1.setSize(300,300);
f1.setLayout(null);
f1.add(t2);
f1.add(b1);
b1.addActionListener(this);
f1.setSize(300,300);
f1.setLayout(null);
f1.setVisible(true);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae)
{
String s1,s2;
s1=t1.getText();
s2=t2.getText();
if(ae.getSource()==b1)
{
if(s1.equals(""))
{
JOptionPane.showMessageDialog(null,"Please Enter Username");
}
else if(s2.equals(""))
{
JOptionPane.showMessageDialog(null,"Please Enter password");
}
else
{
JOptionPane.showMessageDialog(null,"Congratulation login successful");
}
f2=new JFrame();
l4=new JLabel("Ragistration");
l4.setBounds(80,20,150,20);
l5=new JLabel("RollNo");
l5.setBounds(30,50,70,20);
t3=new JTextField();
t3.setBounds(120,50,70,20);
//t3=Integer.parseInt(t3.getText());
l6=new JLabel("Name:");
l6.setBounds(30,80,70,20);
t4=new JTextField();
t4.setBounds(120,80,70,20);
l7=new JLabel("Marks:");
l7.setBounds(30,120,70,20);
t5=new JTextField();
t5.setBounds(120,120,70,20);
b2=new JButton("Insert");
b2.setBounds(40,200,170,20);
f2.add(l4);
f2.add(l5);
f2.add(t3);
f2.add(l6);
f2.add(t4);
f2.add(l7);
f2.add(t5);
f2.add(b2);
f2.setSize(400,400);
f2.setLayout(null);
f2.setVisible(true);
b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JOptionPane.showMessageDialog(null,"Record Added successfully....");
t3.setText("");
t4.setText("");
t5.setText("");
f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
});
}
{
JOptionPane.showMessageDialog(null,"Sorry...Trt again...");
}
}
public static void main(String args[])
{
new Twoframe();
}
}




