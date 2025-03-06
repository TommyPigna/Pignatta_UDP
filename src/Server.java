import java.io.IOException;
import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Date;

/*
* @author tommaso pignatta
*/

public class Server {

    public int port = 2000;

    // Oggetto Socket UDP
    public DatagramSocket dSocket;
    // Datagramma UDP ricevuto dal client
    public DatagramPacket inPacket;
    // Datagramma UDP di risposta da inviare
    public DatagramPacket outPacket;
    // Buffer per il contenuto del segmento da ricevere
    public byte[] bufferIn, bufferOut;
    // Testo dei messaggi in I/O
    public String messageIn, messageOut;
    // Data e ora correnti
    public Date d;

    public Server() {
        try {
            // Creazione del socket UDP sulla porta specificata
            dSocket = new DatagramSocket(port);
            System.out.println("Server avviato sulla porta: " + port);
        } catch (BindException e) {
            System.err.println("Errore: porta già in uso.");
        } catch (SocketException e) {
            System.err.println("Errore nella creazione del socket UDP.");
        }
    }

    public void ascolto() {
        while (true) {
            System.out.println("Server in ascolto sulla porta " + port + "!\n");
            bufferIn = new byte[256];
        }
    }
}