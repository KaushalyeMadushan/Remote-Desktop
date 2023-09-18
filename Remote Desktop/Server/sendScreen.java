import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.Bufferimage;
import java.io.OutputStream;
import java.io.IoException;
import java.io.socket;
import javax.imageio.Image.imageIo;

public class sendscrean extends Tread
{
Soket soket=null;
Robot robot=null;
Rectangle rectangle=null;
boolean continueLoop=true;
outputStream oos=null;

public sendscrean(Socket socket, Robot robot, Rectangle rect)
{
	this.socket=socket;
	this.robot=robot;
	rectangle=rect;
	start();
	
}
public void run()
{
	try

	{
	oos=socket.getOutputStream();
		
	}
	catch(IoException e)
	{
		e.printStackTrace();
	}
	while(continueLoop)
	{
		BufferdImage=robot.createScreenCapture(rectangle);
		try
		{
		ImageIo.write(image,"jpeg",oos)	;
		}
		catch(IoException e)
		{
			e.printStackTrace();
			
		}
		try
		{
			Thread.sleep(10);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

}
	oos=soket.getOutputScree()
}
catch(IOException e);
{
	e.printStackTrace();
}







