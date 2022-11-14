package src.Airport.Server;

import src.Airport.Server.Flight;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface FlightInterface extends Remote {

    void receiveListOfFlights(List<Flight> flights);

    void receiveUpdatedFlight(Flight flight, boolean deleted);

    void login(String clientName, FlightInterface client) throws RemoteException;
    void logout(String clientName) throws RemoteException;
    void updateFlight(String clientName, Flight flight) throws RemoteException;
    void deleteFlight(String clientName, Flight flight) throws RemoteException;
}
