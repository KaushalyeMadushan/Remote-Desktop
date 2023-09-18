import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.robot;
import java.awt.Tooltit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;

public class ServerSocket
{
	
	ServerSocket socket=null;
	DataInputStream passsword=null;
	DataOutputStream verify=null;
	String width="";
	String height="";
	
	InitConnection (int port, String value1)
	{
		robot robot = null;
		Rectangle ractangle= null;
		try
		{
			System.out.println("waiting for client to get connected");
			socket=new ServerSocket(port);
			GraphicsEnvironment gEnv=GraphicsEnvironment.getLocalGraphicsEnvironment();
			GraphicsDevice gDev=gEnv.getDefaultSreenDevice();
			Dimension dim=Toolkit.getDefaultToolkit();
			rectangle=new rectangle(dim);
			robot=new Robot (gDev);
			
			drawGUI
		}
		
		while(true)
		{
			Socket sc=socket.accept();
			password=new DataInputStream(scInputStream());
			verify=new DataOutputStream(sc.getOutputStream());
			String passsword=passsword.readUT();
			if(passsword.equals(value1))
			{
				verify.writeUTF("Valid");
				verify.writeUTF(width);
				verify.writeUTF(height);
				new SendScream(sc,robot,rectangle);
				new ReceiveEvents(cs,robot);
			}
		}
		else
		{
			verify.writeUTF("invalid");
			
		}
		
		catch(Exception e)
		{
		e.printStackTrace()
		}
		private void drawGUI()
		{
			
		}
		
	