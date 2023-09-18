import java.awt.Robot;
import java.io.IOException;
import java.net.socket;
import java.util.Scanner;

public class ReceiveEvents extends thread
{
	Socket socket=null;
	Robot robot=null;
	boolean continueLopp=true;
	
	public ReceiveEvents(Socket socket, Robot robot)
	{
		this.socket=socket;
		this.robot=robot;
		start();
		
	}
	public void run()
	{
		Sceener scaner=null;
		try
		{
			scanner=new scanner(socket.getInputStream());
			
			while(continueLopp)
			{
				int command=scanner.nextInt();
				switch(command)
			
			{
			case-1:
			robot.mousepress(scanner.nextInt());
			break;
			case-2:
			robot.mouseRelease(scanner.nextInt());
			break;
			case-3:
			robot.keyPress(scanner.nextInt());
			break;
			case-4:
			robot.keyRelease(scanner.nextInt());
			break;
			case-5
			robot.mouseMove(scanner.nextInt(),scanner.nextInt());
			break;
						
			}
		}
	}
	catch(IOException e)
	{
		e.printStacktrace();
	}
	
	}
		
