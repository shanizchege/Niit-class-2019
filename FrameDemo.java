import javax.swing.*;
import java.awt.*;
import javax.swing.JPanel;

 class FrameDemo{


Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
obj.setSize(screenSize.width,screenSize.height);
//obj.setSize(screenSize.width/2,screenSize.height/2);
obj.setVisible(true);


obj.setLayout(new FlowLayout());
 
obj.setResizable(false);


obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

public class PanelDemo extends FrameDemo{
	JPanel obj;
	public PanelDemo(){
	mainPanel = new JPanel(); //main panel
        setTitle("Main Panel");
	setSize(300,300);
	setBackground(Color.green);
	setBorder(BorderFactory.createLineBorder(Color.black, 1));
	menuPanel = new JPanel(); //menu panel
	setTitle("Menu Panel");
	setSize(300,300);
	setBackground(Colour.red);
	contentPanel =new JPanel(); //content panel
	setTitle("Content Panel");
	setSize(300,300);
	setBackground(Color.blue);
	mainPanel.add(menuPanel);
	mainPanel.add(contentPanel); 
	add(obj);
}
}
	public static void main(String[]args){
	JFrame obj= new JFrame("NIIT SONGS");
	}
}