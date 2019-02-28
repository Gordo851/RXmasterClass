package guiExample;

import java.awt.*;  
import java.awt.event.*;

import javax.swing.JFrame;

public class ActionListenerExample {  
public void gui() {  
    JFrame f=new JFrame("ActionListener Example");  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30);  
  
    b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("Was that Reactive?");  
    }  
    });  
    f.add(b);f.add(tf);  
    f.setSize(300,170);  
    f.setLayout(null);  
    f.setVisible(true);   
}

}