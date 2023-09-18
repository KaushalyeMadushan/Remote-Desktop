import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public clss SetPassword extends JFrame implements ActionListener
{
	static String port="4907"
	Jbutton submit;
	Jpanel panel;
	JTextField text,text2;
	String value1,value2;
	JLabe1 labe1,labe11,labe12;
	 
	 
	    Setpassword(){
			lable11=new JLabe1();
			labe11.setText("Setpassword");
			text1=new JTextField(15);
			labe1=new JLabe1();
			this.setLayout(new BorderLayout());
            submit=new JButton("Submit");
			panel=newJPanel(new Gridlayout(2,1));
			panel.add(labell);
			panel.add(text1);
			panel.add(label);
			panel.add(submit);
			add(panel,BorderLayout.CENTER);
			submit.addActionListener(this);
			setTitle("setting password for client");
		}            
	public void actionPerformed(ActionEvent e){
		value1=text.getText();
		new InitConnection(Integer.parseInt(port),value);
	}
	public String getValue1()
	{
		return value1;
	}
     public static void main (String args[])
	 {
		 setpassword frame=new Setpassword();
		 frame1.setsize(300,80);
		 frame1.setLocation(500,300);
		 frame1.setVisibile(true);
	 }
}