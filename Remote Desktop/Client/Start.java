import java.net.Socket;
import javax.swing.JOptionPane;

public class Start { 
    static String port = "4907";

    public static void main(String args[]) {
        String ip = JOptionPane.showInputDialog("Please Enter Server IP");
        new Start().initialize(ip, Integer.parseInt(port));
    }

    public void initialize(String ip, int port) {
        try {
            Socket socket = new Socket(ip, port);
            System.out.println("Connecting to the Server");
            Authentication framel = new Authentication(sc);
            frame.setSize(300, 80);
            frame.setLocation(500, 300);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
