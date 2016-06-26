package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.main;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;

public class GUI extends JFrame {

	private JPanel contentPane;
	public static JTextField textField;
	public static String zvtxt;
	public static String zetxt;
	public static JTextField textField_1;

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
		setBounds(100, 100, 445, 422);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("verschl\u00FCsseln");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				texteinlesenv();
			}
		});
		btnNewButton.setBounds(34, 203, 133, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("entschl\u00FCsseln");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texteinlesene();
			}
		});
		btnNewButton_1.setBounds(34, 321, 133, 23);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(34, 172, 363, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(35, 290, 362, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("0");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.datum = 0;
			}
		});
		btnNewButton_2.setBounds(183, 85, 46, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.datum = 1;
			}
		});
		btnNewButton_3.setBounds(239, 85, 46, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.datum = 2;
			}
		});
		btnNewButton_4.setBounds(295, 85, 46, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("3");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.datum = 3;
			}
		});
		btnNewButton_5.setBounds(351, 85, 46, 23);
		contentPane.add(btnNewButton_5);
		
		JLabel lblVerschlsselungsmaschine = new JLabel("Verschl\u00FCsselungsmaschine");
		lblVerschlsselungsmaschine.setForeground(Color.RED);
		lblVerschlsselungsmaschine.setBackground(Color.WHITE);
		lblVerschlsselungsmaschine.setFont(new Font("Arial", Font.BOLD, 14));
		lblVerschlsselungsmaschine.setBounds(126, 11, 193, 14);
		contentPane.add(lblVerschlsselungsmaschine);
		
		JLabel lblVerschlsselungsgrad = new JLabel("Verschl\u00FCsselungsgrad:");
		lblVerschlsselungsgrad.setFont(new Font("Arial", Font.BOLD, 11));
		lblVerschlsselungsgrad.setBounds(34, 89, 137, 14);
		contentPane.add(lblVerschlsselungsgrad);
		
		JLabel lblNurKleibuchstabenKeine = new JLabel("Nur Kleibuchstaben, keine Umlaute, keine Sonderzeichen!");
		lblNurKleibuchstabenKeine.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNurKleibuchstabenKeine.setBounds(34, 38, 363, 14);
		contentPane.add(lblNurKleibuchstabenKeine);
		
		JLabel lblZuVerschlsselnderText = new JLabel("Zu verschl\u00FCsselnder Text/ entschl\u00FCsselter Text");
		lblZuVerschlsselnderText.setFont(new Font("Arial", Font.PLAIN, 11));
		lblZuVerschlsselnderText.setBounds(34, 147, 363, 14);
		contentPane.add(lblZuVerschlsselnderText);
		
		JLabel lblZuEntschlsselnderText = new JLabel("Zu entschl\u00FCsselnder Text/ verschl\u00FCsselter Text");
		lblZuEntschlsselnderText.setFont(new Font("Arial", Font.PLAIN, 11));
		lblZuEntschlsselnderText.setBounds(34, 265, 363, 14);
		contentPane.add(lblZuEntschlsselnderText);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 245, 363, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(34, 124, 363, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(34, 67, 363, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel = new JLabel("\u00A9 David Schneider");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(301, 358, 96, 14);
		contentPane.add(lblNewLabel);
	}
	
	public void texteinlesenv()
	{
		zvtxt = textField.getText();
		main.verschlüsseln();
	}
	
	public void texteinlesene()
	{
		zetxt = textField_1.getText();
		main.entschlüsseln();
	}
}
