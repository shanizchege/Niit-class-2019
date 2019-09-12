import javax.swing.*;
import javax.awt.*;
public class FrameDemo{
JFrame obj;

	public FrameDemo(){
	obj=new JFrame();
	obj.setTitle("NIIT songs");
	obj.setVisible(true);
	public class JFrameSize{

private void makeFullSize(JFrame obj){
   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
   obj.setSize(screenSize.width,screenSize.height);

}
   
private void makeHalfScreenSize(Jframe obj){
   Dimention screenSize = Toolkit.getDefaultToolkit().getScreenSize();
   obj.setSize(screenSize.width/2,screenSize.height/2);

}
  }

	obj.setLayout(new FlowLayout());
	}
          
	public static void main(String[]args){
	FrameDemo obj= new FrameDemo();
       
        JPanel jp = new JPanel();
        
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        
        obj.add(jb1);
        obj.add(jb2);
       
        obj.add(jp);
        obj.pack();
      
        

	}

}