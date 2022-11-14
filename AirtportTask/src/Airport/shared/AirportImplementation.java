package src.Airport.shared;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.SystemColor;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class AirportImplementation extends JFrame {

	private JPanel contentPane;
	private JTextField txtAirportName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField txtLufthansa;
	private JTextField txtFra;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws AlreadyBoundException, RemoteException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AirportImplementation frame = new AirportImplementation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AirportImplementation() {
		setForeground(SystemColor.desktop);
		setTitle("Flight Details");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 887, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IATA Code:");
		lblNewLabel.setBounds(10, 13, 62, 14);
		contentPane.add(lblNewLabel);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(77, 20, 0, 0);
		contentPane.add(horizontalBox);
		
		txtAirportName = new JTextField();
		txtAirportName.setBounds(132, 10, 283, 20);
		txtAirportName.setText("Airport Name");
		contentPane.add(txtAirportName);
		txtAirportName.setColumns(10);
		
		JLabel lblAircraft = new JLabel("Aircraft Model Name:");
		lblAircraft.setBounds(10, 38, 106, 14);
		contentPane.add(lblAircraft);
		
		textField = new JTextField();
		textField.setText("Airport Name");
		textField.setColumns(10);
		textField.setBounds(132, 35, 283, 20);
		contentPane.add(textField);
		
		JLabel lblTrackingNumber = new JLabel("Tracking Number:");
		lblTrackingNumber.setBounds(10, 63, 106, 14);
		contentPane.add(lblTrackingNumber);
		
		JLabel lblDeparture = new JLabel("Departure Airport:");
		lblDeparture.setBounds(10, 88, 106, 14);
		contentPane.add(lblDeparture);
		
		JLabel lblOriginDate = new JLabel("Origin Date:");
		lblOriginDate.setBounds(10, 113, 106, 14);
		contentPane.add(lblOriginDate);
		
		JLabel lblScheduledDeparture = new JLabel("Scheduled Departure:");
		lblScheduledDeparture.setBounds(10, 138, 106, 14);
		contentPane.add(lblScheduledDeparture);
		
		JLabel lblDepartureTerminal = new JLabel("Departure Terminal:");
		lblDepartureTerminal.setBounds(10, 163, 106, 14);
		contentPane.add(lblDepartureTerminal);
		
		JLabel lblDepartureGates = new JLabel("Departure Gates:");
		lblDepartureGates.setBounds(10, 188, 106, 14);
		contentPane.add(lblDepartureGates);
		
		JLabel lblEstimatedDeparture = new JLabel("Estimated Departure:");
		lblEstimatedDeparture.setBounds(10, 213, 106, 14);
		contentPane.add(lblEstimatedDeparture);
		
		JLabel lblCheckinLocation = new JLabel("Check-in Location:");
		lblCheckinLocation.setBounds(10, 238, 106, 14);
		contentPane.add(lblCheckinLocation);
		
		textField_1 = new JTextField();
		textField_1.setText("Airport Name");
		textField_1.setColumns(10);
		textField_1.setBounds(132, 60, 283, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Airport Name");
		textField_2.setColumns(10);
		textField_2.setBounds(132, 85, 283, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Airport Name");
		textField_3.setColumns(10);
		textField_3.setBounds(132, 110, 283, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("Airport Name");
		textField_4.setColumns(10);
		textField_4.setBounds(132, 135, 283, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("Airport Name");
		textField_5.setColumns(10);
		textField_5.setBounds(132, 160, 283, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("Airport Name");
		textField_6.setColumns(10);
		textField_6.setBounds(132, 185, 283, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("Airport Name");
		textField_7.setColumns(10);
		textField_7.setBounds(132, 210, 283, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("Airport Name");
		textField_8.setColumns(10);
		textField_8.setBounds(132, 235, 283, 20);
		contentPane.add(textField_8);
		
		JLabel lblCheckinCounter = new JLabel("Check-in Counter:");
		lblCheckinCounter.setBounds(10, 263, 106, 14);
		contentPane.add(lblCheckinCounter);
		
		JLabel lblCheckinStart = new JLabel("Check-in Start:");
		lblCheckinStart.setBounds(10, 288, 106, 14);
		contentPane.add(lblCheckinStart);
		
		JLabel lblFlightStatus = new JLabel("Flight Status:");
		lblFlightStatus.setBounds(10, 313, 106, 14);
		contentPane.add(lblFlightStatus);
		
		JLabel lblOperatingAirlines = new JLabel("Operating Airlines:");
		lblOperatingAirlines.setBounds(425, 13, 89, 14);
		contentPane.add(lblOperatingAirlines);
		
		JLabel lblArrivalAirport = new JLabel("Arrival Airport:");
		lblArrivalAirport.setBounds(425, 38, 89, 14);
		contentPane.add(lblArrivalAirport);
		
		JLabel lblArrivalTerminal = new JLabel("Arrival Terminal:");
		lblArrivalTerminal.setBounds(425, 88, 89, 14);
		contentPane.add(lblArrivalTerminal);
		
		JLabel lblArrivalGates = new JLabel("Arrival Gates:");
		lblArrivalGates.setBounds(425, 138, 89, 14);
		contentPane.add(lblArrivalGates);
		
		JLabel lblEstimatedArrival = new JLabel("Estimated Arrival:");
		lblEstimatedArrival.setBounds(425, 163, 89, 14);
		contentPane.add(lblEstimatedArrival);
		
		JLabel lblCheckinEnd = new JLabel("Check-in End:");
		lblCheckinEnd.setBounds(425, 238, 89, 14);
		contentPane.add(lblCheckinEnd);
		
		JLabel lblScheduledArrival = new JLabel("Scheduled Arrival:");
		lblScheduledArrival.setBounds(425, 63, 89, 14);
		contentPane.add(lblScheduledArrival);
		
		txtLufthansa = new JTextField();
		txtLufthansa.setText("Lufthansa");
		txtLufthansa.setColumns(10);
		txtLufthansa.setBounds(524, 10, 298, 20);
		contentPane.add(txtLufthansa);
		
		txtFra = new JTextField();
		txtFra.setText("FRA");
		txtFra.setColumns(10);
		txtFra.setBounds(524, 35, 298, 20);
		contentPane.add(txtFra);
		
		textField_11 = new JTextField();
		textField_11.setText("Airport Name");
		textField_11.setColumns(10);
		textField_11.setBounds(524, 60, 298, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("Airport Name");
		textField_12.setColumns(10);
		textField_12.setBounds(524, 85, 298, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("Airport Name");
		textField_13.setColumns(10);
		textField_13.setBounds(524, 135, 298, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("Airport Name");
		textField_14.setColumns(10);
		textField_14.setBounds(524, 160, 298, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("Airport Name");
		textField_15.setColumns(10);
		textField_15.setBounds(524, 235, 298, 20);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("Airport Name");
		textField_16.setColumns(10);
		textField_16.setBounds(132, 260, 283, 20);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("Airport Name");
		textField_17.setColumns(10);
		textField_17.setBounds(132, 285, 283, 20);
		contentPane.add(textField_17);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(132, 309, 593, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setBounds(462, 354, 189, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(672, 354, 189, 23);
		contentPane.add(btnSave);
	}
}
