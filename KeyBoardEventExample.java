import java.awt.*;
import java.awt.event.*;

/*
    KeyBoard Listener has exactly three methods
    1. KeyPressed(KeyEvent e)
    2. KeyReleased(KeyEvent e)
    3. KeyTyped(KeyEvent e)
*/

public class KeyBoardEventExample extends Frame implements KeyListener{
    Label l;

    KeyBoardEventExample(){
        l = new Label("Key is not used yet...");
        l.setBounds(50,100,200,30);
        add(l);
        addKeyListener(this);
        setSize(200,300);
        setLayout(null);
        setVisible(true);

    }
    public void keyPressed(KeyEvent e){
        l.setText("Key is pressed.");
    }
    public void keyReleased(KeyEvent e){
        l.setText("Key is Released.");
    }
    public void keyTyped(KeyEvent e){
        l.setText("Key is Typed.");
    }

    public static void main(String []args){
        new KeyBoardEventExample();
      
    }
}