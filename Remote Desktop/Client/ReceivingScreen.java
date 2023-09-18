import java.io.ObjectInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import jaava.awt.Image;
import java.awt.Graphics;
import java.io.IOException;
import java.io.ByteArrayInputStream;

class ReceivingScreen extends Thread
{
	private ObjectInputStream cObjectInputStream=null;
	private JPanel=null;
	private boolan continueLoop=null;
	InputStream oin=null;
	Image image1=null;
	
	public ReceivingScreen(InputStream in,JPanel p)
	{
		oin=in;
		cPanel=p;
		start();
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
			byte[] byte[1024*1024];
			int count=0;
			do
			{
				count+=oin.read(bytes,count,bytes.lengeth-count);
			}
			while(!(count>4&&bytes[count-2]==(bytes)-1&&bytes[count-1]==(byte)-39));
			image1=imageIO.read(new ByteArrayInputStream(bytes));
			image1=image1.getScalendInstance(cPanel.getWidth(),cPanel.getHeight(),Image.SCALE_FAST);
			
			Graphics graphics=cPanel.Graphics();
			graphics.drawImage(image1,0,0,cPanel.getWidth(),cPanel.getHeight(),cPanel)
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}