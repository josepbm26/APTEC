package apTEC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MakeRoute extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MakeRoute() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(306, 96, 239, 297);
		contentPane.add(list);
		
		JButton btnChoose = new JButton("Choose");
		btnChoose.setBounds(85, 93, 106, 23);
		contentPane.add(btnChoose);
		
		JLabel lblTasks = new JLabel("Tasks");
		lblTasks.setBounds(412, 71, 57, 14);
		contentPane.add(lblTasks);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExit.setBounds(479, 438, 89, 23);
		contentPane.add(btnExit);
	}
}
