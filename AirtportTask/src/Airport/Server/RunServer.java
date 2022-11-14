package src.Airport.Server;

import src.Airport.shared.AirportImplementation;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RunServer extends AirportImplementation {
    public static void main(String []args) {
        try{
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");


            Flight f1 = new Flight();
            //Flight f2 = new Flight("", "",......);
            //Flight f3 = new Flight("", "",......);
            //Flight f4 = new Flight("", "",......);
            //Flight f5 = new Flight("", "",......);
            //Flight f6 = new Flight("", "",......);

            FlightInterface stub1 = (FlightInterface) UnicastRemoteObject.exportObject(f1,0);
            //FlightInterface stub2 = (FlightInterface) UnicastRemoteObject.exportObject(f2,0);
            //FlightInterface stub3 = (FlightInterface) UnicastRemoteObject.exportObject(f3,0);
            //FlightInterface stub4 = (FlightInterface) UnicastRemoteObject.exportObject(f4,0);
            //FlightInterface stub5 = (FlightInterface) UnicastRemoteObject.exportObject(f5,0);
            //FlightInterface stub6 = (FlightInterface) UnicastRemoteObject.exportObject(f6,0);

            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 0);

            registry.rebind("l", stub1);
            //registry.rebind("", stub2);
            //registry.rebind("", stub3);
            //registry.rebind("", stub4);
            //registry.rebind("", stub5);
            //registry.rebind("", stub6);

            System.out.println("Done!");

        }catch (Exception ex) {
            System.out.println("Server error..." +ex);
        }

    }

}

