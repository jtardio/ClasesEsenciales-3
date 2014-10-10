package udpNoConcurrente;

import java.io.*;

public class ServidorUDP {
	 public static void main(String[] args) throws IOException {
	        new ServerThread().start();
	    }

}
