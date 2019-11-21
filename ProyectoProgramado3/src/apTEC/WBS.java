package apTEC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class WBS extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public WBS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWorkBreakdownStructure = new JLabel("Work Breakdown Structure");
		lblWorkBreakdownStructure.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWorkBreakdownStructure.setBounds(46, 38, 159, 22);
		contentPane.add(lblWorkBreakdownStructure);
	}

}
