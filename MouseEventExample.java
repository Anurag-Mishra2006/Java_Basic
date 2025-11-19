import java.awt.*;
import java.awt.event.*;

/* MouseListener has these 5 events...
mouseClicked(MouseEvent e)
mousePressed(MouseEvent e)
mouseReleased(MouseEvent e)
mouseEntered(MouseEvent e)
mouseExited(MouseEvent e)

*/

public class MouseEventExample extends Frame implements MouseListener{
    Label l;
    MouseEventExample(){
        // l.setText("Mouse is inactive"); // since label is null we cannot set anything this give error
        l = new Label("Mouse is inactive");
        l.setBounds(50,100,200,30);
        add(l);
        addMouseListener(this);
        // 
        setSize(100,200); // set the size of the window
        setLayout(null); // set the layout of the elements of page like button, label..
        setVisible(true); // by this the window will appear

    }
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse is clicked");
    }
    public void mousePressed(MouseEvent e){
        l.setText("Mouse is pressed...");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("Mouse is released...");
    }
    public void mouseEntered(MouseEvent e){
        l.setText("Mouse is  Entered...");
    }
    public void mouseExited(MouseEvent e){}

    public static void main(String []args){
        new MouseEventExample();
    }    
}
