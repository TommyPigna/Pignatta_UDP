import java.net.*;
/*
* @author tommaso pignatta
*/

public class Client {

    public int port = 2000;
    // Indirizzo del server
    public InetAddress serverAddress;
    // Socket UDP
    public DatagramSocket dSocket;
    // Datagramma UDP con la richiesta da inviare al server
    public DatagramPacket outPacket;
    // Datagram UDP di risposta ricevuto dal server
    public DatagramPacket inPacket;
    // Buffer per i dati da inviare
    public byte[] buffer;
    // Messaggio di richiesta
    public String message = "RICHIESTA DATA E ORA";
    // Messaggio di risposta
    public String response;

    public Client() {
        try {
            // Ottenere l'indirizzo del server
            serverAddress = InetAddress.getLocalHost();
            System.out.println("Indirizzo del server trovato: " + serverAddress);

            // Creazione del socket UDP
            dSocket = new DatagramSocket();
            System.out.println("Socket UDP creato sulla porta " + port);
        } catch (UnknownHostException e) {
            System.err.println("Errore: impossibile determinare l'indirizzo del server.");
        } catch (SocketException e) {
            System.err.println("Errore nella creazione del socket UDP.");
        }
    }

    /*public void richiesta() {
        try {

        } catch (BindException e) {
            System.err.println("Errore: porta già in uso");
        } catch (SocketException e) {
            System.err.println("Errore Socket");
        } catch (UnknownHostException e) {
            System.err.println("Errore di I/O");
        }
    }*/
}