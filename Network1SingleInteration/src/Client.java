
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;


public class Client {
    private static final String SERVER_IP = "127.0.0.1";
    private static final int SERVER_PORT = 2222;
    private static int status;
    
    public static void main(String[] args) throws IOException {
    Socket socket = new Socket (SERVER_IP, SERVER_PORT);
    
    BufferedReader input = new BufferedReader (new InputStreamReader (socket.getInputStream()));
    
    String serverResponse = input.readLine();
    
    JOptionPane.showMessageDialog(null, "Data Sent", "Data Sent", JOptionPane.INFORMATION_MESSAGE)/**/;
    
    socket.close();
    System.exit(0);
    }
}
