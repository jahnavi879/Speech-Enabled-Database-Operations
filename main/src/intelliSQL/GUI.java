package intelliSQL;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;


public class GUI extends JFrame {

	private JPanel contentPane;
	JTextField NPL;
	JTextField SQL;
String s;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Natural Language Query");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 424, 20);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.BLUE);
		contentPane.add(lblNewLabel);
		
		NPL = new JTextField();
		NPL.setBackground(Color.YELLOW);
		NPL.setBounds(10, 38, 367, 20);
		contentPane.add(NPL);
		NPL.setColumns(10);
		
		JLabel lblSqlQuery = new JLabel("SQL Query");
		lblSqlQuery.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSqlQuery.setForeground(Color.BLUE);
		lblSqlQuery.setBounds(10, 113, 414, 25);
		contentPane.add(lblSqlQuery);
		
		SQL = new JTextField();
		SQL.setBackground(Color.YELLOW);
		SQL.setBounds(10, 149, 367, 20);
		contentPane.add(SQL);
		SQL.setColumns(10);
		
		JButton btnExecute = new JButton("Execute");
		btnExecute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			
			}
		});
		btnExecute.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExecute.setForeground(Color.RED);
		btnExecute.setBackground(Color.BLUE);
		btnExecute.setBounds(36, 191, 89, 23);
		contentPane.add(btnExecute);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			NPL.setText("");
			SQL.setText("");
			}
		});
		btnReset.setForeground(Color.RED);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBackground(Color.BLUE);
		btnReset.setBounds(210, 191, 89, 23);
		contentPane.add(btnReset);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.BLUE);
		label.setBackground(Color.WHITE);
		label.setBounds(91, 225, 174, 14);
		contentPane.add(label);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				modify();
				SQL.setText("Select * from OSS");
			}

			private void modify() {
				// TODO Auto-generated method stub
				
			}
		});
		btnGenerate.setBackground(Color.BLUE);
		btnGenerate.setForeground(Color.RED);
		btnGenerate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGenerate.setBounds(127, 79, 89, 23);
		contentPane.add(btnGenerate);
	


	
}  }