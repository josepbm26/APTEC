package apTEC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import estructurasDatos.Grafo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class TasksManagement extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	//graph that will contain all the tasks of the project
	private Grafo TasksGraph;
	
	//List for the listbox
	DefaultListModel DLM = new DefaultListModel();


	/**
	 * Create the frame
	 */
	public TasksManagement() {
		//instantiating the graph
		TasksGraph = new Grafo();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 385);
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
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(663, 312, 89, 23);
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
		
		textField = new JTextField();
		textField.setBounds(98, 79, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(67, 107, 30, 14);
		contentPane.add(lblId);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(20, 132, 77, 14);
		contentPane.add(lblDescription);
		
		JLabel lblEffort = new JLabel("Effort:");
		lblEffort.setBounds(49, 213, 48, 14);
		contentPane.add(lblEffort);
		
		JLabel lblResponsable = new JLabel("Responsable:");
		lblResponsable.setBounds(10, 185, 87, 14);
		contentPane.add(lblResponsable);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 104, 150, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(98, 129, 150, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"(type)", "Operative Task", "Aprobation Task", "Contract Signature", "Managament Task", "Changes"}));
		comboBox.setBounds(98, 153, 150, 22);
		contentPane.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(98, 182, 150, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"(difficulty)", "Low", "Medium", "High"}));
		comboBox_1.setBounds(98, 209, 150, 22);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Add task");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creating the task object with the information written by the user
				String name = textField.getText();
				int id = Integer.parseInt(textField_1.getText());   //gathering all the information 
				String description = textField_2.getText();
				String type = (String)comboBox.getSelectedItem();
				String responsable = textField_3.getText();
				String effort = (String)comboBox_1.getSelectedItem();
				
				//instantiating the task class
				Tasks task = new Tasks(name,id,description,type,responsable,effort);
				
				//adding task to the listbox
				DLM.addElement(name);
				list.setModel(DLM);
				
				//adding the task (vertex) to the graph.  NOTE: it'll only add the id of the task
				TasksGraph.agregarVertice(id);
				
				//~~~~~~
				//PROBANDO SI SE ANADIO EL VERTICE AL GRAFO EN LA CONSOLA BORRARR DESPUESS
				TasksGraph.imprimeGrafo();
				//~~~~~~~~~~~
				
				//confirmation message with all the information of the task
				JOptionPane.showMessageDialog(null, "The task has been succesfully added to the project!");
				String message_JOPT = task.toString();
				JOptionPane.showMessageDialog(null, message_JOPT);
				
				
			}
		});
		btnNewButton.setBounds(133, 241, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(49, 157, 48, 14);
		contentPane.add(lblType);
		

	}
}
