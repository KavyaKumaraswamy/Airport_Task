package src.Airport.Client;

import src.Airport.Server.Flight;
import src.Airport.Server.FlightInterface;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class RMIClient implements FlightInterface {
    private FlightInterface server;

    public RMIClient() throws RemoteException{
        UnicastRemoteObject.exportObject(this, 0);
    }

    public void startClient() throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        server = (FlightInterface)registry.lookup("Server");
    }


    @Override
    public void receiveListOfFlights(List<Flight> flights) {

    }

    @Override
    public void receiveUpdatedFlight(Flight flight, boolean deleted) {

    }

    @Override
    public void login(String clientName, FlightInterface client) throws RemoteException {

    }

    @Override
    public void logout(String clientName) throws RemoteException {

    }

    @Override
    public void updateFlight(String clientName, Flight flight) throws RemoteException {

    }

    @Override
    public void deleteFlight(String clientName, Flight flight) throws RemoteException {

    }
}
