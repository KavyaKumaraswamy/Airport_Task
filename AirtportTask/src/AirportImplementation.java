import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.FlowLayout;
import java.awt.SystemColor;

public class AirportImplementation extends JFrame {

	private JPanel contentPane;
	private JTextField txtAirportName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		setTitle("Flight Booking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 887, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Airpot Name");
		lblNewLabel.setBounds(10, 13, 62, 14);
		contentPane.add(lblNewLabel);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(77, 20, 0, 0);
		contentPane.add(horizontalBox);
		
		txtAirportName = new JTextField();
		txtAirportName.setBounds(82, 10, 195, 20);
		txtAirportName.setText("Airport Name");
		contentPane.add(txtAirportName);
		txtAirportName.setColumns(10);
	}

}
