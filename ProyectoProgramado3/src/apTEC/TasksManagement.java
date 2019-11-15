package apTEC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;

public class TasksManagement extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame
	 */
	public TasksManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTasksManagement = new JLabel("Tasks Management");
		lblTasksManagement.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTasksManagement.setBounds(20, 11, 174, 22);
		contentPane.add(lblTasksManagement);
		
		JLabel lblAddTasks = new JLabel("Add tasks");
		lblAddTasks.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddTasks.setBounds(30, 44, 67, 14);
		contentPane.add(lblAddTasks);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(642, 362, 89, 23);
		contentPane.add(btnExit);
		
		JList list = new JList();
		list.setBounds(419, 70, 211, 230);
		contentPane.add(list);
		
		JLabel lblTasksOfThe = new JLabel("Tasks of the project");
		lblTasksOfThe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTasksOfThe.setBounds(443, 44, 156, 14);
		contentPane.add(lblTasksOfThe);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(50, 82, 48, 14);
		contentPane.add(lblName);
	}
}
