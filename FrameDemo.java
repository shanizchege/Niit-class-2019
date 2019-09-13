import javax.swing.*;
import java.awt.*;

public class FrameDemo{
public static void main(String[]args){
JFrame obj= new JFrame("NIIT SONGS");

Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
obj.setSize(screenSize.width,screenSize.height);
obj.setSize(screenSize.width/2,screenSize.height/2);
obj.setVisible(true);


obj.setLayout(new FlowLayout());
 
obj.setResizable(false);


obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   
       
        JPanel jp = new JPanel();
        
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
    
        obj.add(jb1);
        obj.add(jb2);
       
        obj.add(jp);
        obj.pack();
      
        
}

}