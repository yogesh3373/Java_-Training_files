import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame implements MouseListener{
Label l;
MouseListenerExample(){

 l=new Label();
addMouseListener(this);
l.setBounds(20,50,100,20);
add(l);
setLayout(null);
setVisible(true);
setSize(200,200);
}

public void mouseEntered(MouseEvent e){
  l.setText ("mouseEntered");
}
public void mousePressed(MouseEvent e){
  l.setText ("mousePressed");
}
public void mouseReleased(MouseEvent e){
  l.setText ("mouseReleased");
}
public void mouseExited(MouseEvent e){
  l.setText ("mouseExited");
}
public void mouseClicked(MouseEvent e){
  l.setText ("mouseClicked");
}
 public static void main(String args[]){
    new MouseListenerExample();
}
}