package src.Airport.Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;

public class Flight implements Remote {
        private String IATACode;
        private String name;
        private String modelName;
        private int flightNo;
        private String departureAirport;
        private String arrivalAirport;
        private LocalDate originDate;
        private String schDateTimeA;
        private int terminalA;
        private String[] listOfGatesA;
        private String estDateTimeA;
        private String schDateTimeD;
        private int terminalD;
        private String[] listOfGatesD;
        private String checkInLoc;
        private String checkInCounter;
        private String checkInDateTime;
        private char flightStatus;

        public void Flight(String IATA_Code, String Name, String ModelName, int FlightNo, String DepartureAirport
                                  ,String ArrivalAirport, LocalDate OriginDate, String SchDateTimeA, int TerminalA,
                                  String[] ListOfGatesA, String EstDateTimeA, String SchDateTimeD, int TerminalD,
                                  String[] ListOfGatesD, String CheckInLoc, String CheckInCounter,
                                  String CheckInDateTime,char FlightStatus)
                throws RemoteException
        {
            this.IATACode = IATA_Code;
            this.name = Name;
            this.modelName = ModelName;
            this.flightNo = FlightNo;
            this.departureAirport = DepartureAirport;
            this.arrivalAirport = ArrivalAirport;
            this.originDate = OriginDate;
            this.schDateTimeA = SchDateTimeA;
            this.terminalA = TerminalA;
            this.listOfGatesA = ListOfGatesA;
            this.estDateTimeA = EstDateTimeA;
            this.schDateTimeD = SchDateTimeD;
            this.terminalD = TerminalD;
            this.listOfGatesD = ListOfGatesD;
            this.checkInLoc = CheckInLoc;
            this.checkInCounter = CheckInCounter;
            this.checkInDateTime = CheckInDateTime;
            this.flightStatus = FlightStatus;
        }

        public String getIATACode() throws RemoteException
        {
            return this.IATACode;
        }

        public String getName() throws RemoteException
        {
            return this.name;
        }

        public String getModelName() throws RemoteException
        {
            return this.modelName;
        }

        public int getFlightNo() throws RemoteException
        {
            return this.flightNo;
        }

        public String getDepartureAirport() throws RemoteException
        {
            return this.departureAirport;
        }

        public String getArrivalAirport() throws RemoteException
        {
            return this.arrivalAirport;
        }

        public LocalDate getOriginDate() throws RemoteException
        {
            return this.originDate;
        }

        public String getSchDateTimeA() throws RemoteException
        {
            return this.schDateTimeA;
        }

        public int getTerminalA() throws RemoteException
        {
            return this.terminalA;
        }

        public String[] getListOfGatesA() throws RemoteException
        {
            return this.listOfGatesA;
        }

        public String getEstDateTimeA() throws RemoteException
        {
            return this.estDateTimeA;
        }

        public String getEstDateTimeD() throws RemoteException
        {
            return this.schDateTimeD;
        }

        public int getTerminalD() throws RemoteException
        {
            return this.terminalD;
        }

        public String[] getListOfGatesD() throws RemoteException
        {
            return this.listOfGatesD;
        }

        public String getCheckInLoc() throws RemoteException
        {
            return this.checkInLoc;
        }

        public String getCheckInCounter() throws RemoteException
        {
            return this.checkInCounter;
        }

        public String getCheckInDateTime() throws RemoteException
        {
            return this.checkInDateTime;
        }

        public char getFlightStatus() throws RemoteException
        {
            return this.flightStatus;
        }

}

