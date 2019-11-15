package apTEC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 655, 303);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblwelcomeToAptec = new JLabel("\u00A1Welcome to APTEC!");
		lblwelcomeToAptec.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 25));
		lblwelcomeToAptec.setBounds(177, 75, 293, 58);
		frame.getContentPane().add(lblwelcomeToAptec);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calling the constructor of the next window to open (taskmanagement), and creating it
				TasksManagement window = new TasksManagement();
				window.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnContinue.setBounds(274, 155, 89, 23);
		frame.getContentPane().add(btnContinue);
		
		JLabel lblaProjectManagement = new JLabel("~~A project management application~~");
		lblaProjectManagement.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		lblaProjectManagement.setBounds(187, 120, 301, 23);
		frame.getContentPane().add(lblaProjectManagement);
	}
}
