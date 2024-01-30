package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interfaces.Reglas_del_programa;

import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Vista extends JFrame implements Reglas_del_programa.Vista {
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	
	public JButton btnNewButton; 
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Vista frame = new Vista();
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 302);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(46, 82, 68, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 82, 76, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setBounds(131, 85, 22, 14);
		getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("Multiplicar");
		btnNewButton.setBounds(328, 81, 132, 23);
		getContentPane().add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setBounds(229, 154, 175, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
	}
	
}
