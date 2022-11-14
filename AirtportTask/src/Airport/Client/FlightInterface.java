package src.Airport.Client;

import src.Airport.Server.Flight;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface FlightInterface extends Remote {


    void receiveListOfFlights(List<Flight> flights) throws RemoteException;

    void receiveUpdatedFlight(Flight flight, boolean deleted) throws RemoteException;

    void login(String clientName, FlightInterface client);

    void logout(String clientName);

    void updateFlight(String clientName, Flight flight);

    void deleteFlight(String clientName, Flight flight);
}
