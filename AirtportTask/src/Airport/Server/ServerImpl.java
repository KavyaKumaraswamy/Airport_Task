package src.Airport.Server;

import src.Airport.Client.FlightInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ServerImpl implements FlightInterface {

    public ServerImpl() throws RemoteException{
        UnicastRemoteObject.exportObject(this, 0);
    }

    @Override
    public void receiveListOfFlights(List<Flight> flights) {

    }

    @Override
    public void receiveUpdatedFlight(Flight flight, boolean deleted) {

    }

    @Override
    public void login(String clientName, FlightInterface client) {

    }

    @Override
    public void logout(String clientName) {

    }

    @Override
    public void updateFlight(String clientName, Flight flight) {

    }

    @Override
    public void deleteFlight(String clientName, Flight flight) {

    }
}
