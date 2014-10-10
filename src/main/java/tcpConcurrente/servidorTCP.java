package tcpConcurrente;

import java.io.*;
import java.net.*;
import java.util.logging.*;

public class servidorTCP {
	public static void main(String args[]) throws IOException {

        ServerSocket ss;
        System.out.print("Inicializando servidor... ");
        try {
            ss = new ServerSocket(50001);
            System.out.println("\t[OK]");
            int idSession = 0;
            while (true) {
                Socket socket;
                socket = ss.accept();
                System.out.println("Nueva conexion entrante: "+socket);
                ((ServerThread) new ServerThread(socket, idSession)).start();
                idSession++;
            }

        } catch (IOException ex) {
            Logger.getLogger(servidorTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
