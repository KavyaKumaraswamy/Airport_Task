package src.Airport.Client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RunClient {
    public static void main(String []args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 0);

            FlightInterface l = (FlightInterface) registry.lookup("l");
        }catch(Exception ex) {
            System.out.println("Client error..." + ex);
        }


    }
}
