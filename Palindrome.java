import javax.swing.*;
import java.awt.event.*;
public class Palindrome{
public static void main(String[] args){
JFrame f1 = new JFrame("Palindrome");
JPanel p1 = new JPanel();
JPanel p2 = new JPanel();
JPanel p3 = new JPanel();
JLabel l1 = new JLabel("Enter");
JButton b1 = new JButton("Check");
JTextField t1 = new JTextField(10);

p1.add(l1);
p1.add(t1);

p2.add(b1);
f1.add(p1);
f1.add(p1);
b1.addActionListener(new ActionListener(){
public void actionPerformer(ActionEvent e){
if (e.getActionCommand().equals("Check")){
String f =t1.getText();
String p;
x=length(f);
for (int i=(x-1);i>=0;i--){
char c=f.charAt(i);
p+=c;
}
if (p==f)
{
JLabel l2=new JLabel("Palindrome")
p1.add(l2);
f1.add(p1);
f1.show();
}
}