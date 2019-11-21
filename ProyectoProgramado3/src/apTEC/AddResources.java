package apTEC;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.LinkedList;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddResources extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	LinkedList<Resource> Resources;
	

	/**
	 * Create the frame.
	 */
	public AddResources() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddResources = new JLabel("Add Resources");
		lblAddResources.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddResources.setBounds(102, 71, 100, 17);
		contentPane.add(lblAddResources);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(45, 125, 46, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(148, 125, 146, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(34, 158, 57, 14);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 158, 146, 20);
		contentPane.add(textField_1);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(34, 189, 67, 14);
		contentPane.add(lblType);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 189, 146, 20);
		contentPane.add(textField_2);
		
		JLabel lblCapacity = new JLabel("Capacity:");
		lblCapacity.setBounds(34, 218, 67, 14);
		contentPane.add(lblCapacity);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 220, 146, 20);
		contentPane.add(textField_3);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(34, 251, 67, 14);
		contentPane.add(lblQuantity);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(148, 251, 146, 20);
		contentPane.add(textField_4);
		
		JLabel lblInCharge = new JLabel("In charge:");
		lblInCharge.setBounds(34, 282, 67, 14);
		contentPane.add(lblInCharge);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(148, 282, 146, 20);
		contentPane.add(textField_5);
		
		JButton btnAdd = new JButton("Create");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createResource(textField,textField_1,textField_2,textField_3,textField_4,textField_5);
				Resources.toString();
			}
		});
		btnAdd.setBounds(148, 339, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText(""); 
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		btnClear.setBounds(49, 339, 89, 23);
		contentPane.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(24, 392, 89, 23);
		contentPane.add(btnExit);
	
	}
	
	//Method to create a resource
	public void createResource(JTextField textField,JTextField textField_1,JTextField textField_2,JTextField textField_3,JTextField textField_4,JTextField textField_5) {
		String ID = textField.getText();
		String name = textField_1.getText();
		String type = textField_2.getText();
		String capacity = textField_3.getText();
		String quantity = textField_4.getText();
		String inCharge = textField_5.getText();
		
		Resource newResource = new Resource(ID,name,type,capacity,quantity,inCharge);
		
		Resources.addFirst(newResource);; 
		System.out.println(Resources.toString());
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
