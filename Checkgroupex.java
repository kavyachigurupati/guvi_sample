/**
 * @(#)Checkgroupex.java
 *
 *
 * @author 
 * @version 1.00 2017/3/24
 */



import java.awt.*;
import java.awt.event.*;

public class Checkgroupex extends Frame  implements ItemListener,WindowListener
 {

Checkbox c1,c2;
Panel p1,p2,p3;
//Label l1,l2;
Checkgroupex()

{
setTitle("Checkbox ");
//Font f=new Font("Serif",Font.BOLD,24);
addWindowListener(this);
setBounds(100,100,500,500);
setLayout(new BorderLayout());
CheckboxGroup cg=new CheckboxGroup();
p1=new Panel(new GridLayout(2,1));
add(p1,BorderLayout.CENTER);
p2=new Panel();
add(p2,BorderLayout.SOUTH);

//p3=new Panel();
//add(p3,BorderLayout.WEST);

//l1=new Label("red");
//l1.setFont(f);
//p1.add(l1);
c1=new Checkbox("red",cg,false);
p1.add(c1);
c1.addItemListener(this);
//l2=new Label("Blue");
//l2.setFont(f);
//p1.add(l2);
c2=new Checkbox("blue",cg,false);
p1.add(c2);
c2.addItemListener(this);
setVisible(true);
}
public void itemStateChanged(ItemEvent ie)
{
	if(ie.getSource()==c1)
		p2.setBackground(Color.RED);
	else if(ie.getSource()==c2)
		p2.setBackground(Color.BLUE);	
	
}

    public static void main(String args[]){
new Checkgroupex();
    }
public void windowActivated(WindowEvent we)
{}
public void windowClosed(WindowEvent we)
{}
public void windowClosing(WindowEvent we)
{
	System.exit(0);
}

public void windowDeactivated(WindowEvent we)
{}
public void windowDeiconified(WindowEvent we)
{}
public void windowIconified(WindowEvent we)
{}
   
public void windowOpened(WindowEvent we)
{}   
    
}