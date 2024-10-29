import WS.EtudiantService;

import javax.xml.ws.Endpoint;


public class Server {
    public static void main(String[] args){
        String url ="http://localhost:8098/";
        Endpoint.publish(url, new EtudiantService());
        System.out.println(url);
    }
}
