import javax.swing.*;
import javax.awt.*;
public class FrameDemo{
JFrame obj;

	public FrameDemo(){
	obj=new JFrame();
	obj.setTitle("NIIT songs");
	obj.setVisible(true);
	obj.setSize(300,300);

	obj.setLayout(new FlowLayout());
	}
          
	public static void main(String[]args){
	FrameDemo obj= new FrameDemo();

	}



}