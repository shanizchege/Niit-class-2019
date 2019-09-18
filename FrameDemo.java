import javax.swing.*;
import java.awt.*;

public class FrameDemo{
public static void main(String[]args){
JFrame obj= new JFrame("NIIT SONGS");

Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
obj.setSize(screenSize.width,screenSize.height);
//obj.setSize(screenSize.width/2,screenSize.height/2);
obj.setVisible(true);


obj.setLayout(new FlowLayout());
 
obj.setResizable(false);

{                                   
    int confirmed = JOptionPane.showConfirmDialog(null, "DO YOU WANNA EXIT?","EXIT",JOptionPane.OK_CANCEL_OPTION);
    if(confirmed == JOptionPane.OK_OPTION)
    {
        dispose();
    }
else {
     setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

   
       
        JPanel jp = new JPanel();
        
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
    
        obj.add(jb1);
        obj.add(jb2);
       
        obj.add(jp);
     //   obj.pack();
	 
}
}
{
        JPanel jp = new JPanel();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		tabbedPane.addTab("HOME", makePanel("This is your Home page"));
		tabbedPane.addTab("TRENDING", makePanel("This is your Treanding page"));
		tabbedPane.addTab("MY MUSIC",makePanel("This is your Music"));

		frame.getContentPane().add(tabbedPane);

}
JScrollPane jp = new JScrollPane(
  panel,
  JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
  JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
  
  tabbedPane.add(jp);
)
}