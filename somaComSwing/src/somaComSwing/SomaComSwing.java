package somaComSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.lang.annotation.Target;
import java.util.Scanner;
import java.awt.event.InputMethodEvent;
import javax.swing.border.LineBorder;

public class SomaComSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JLabel label1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SomaComSwing frame = new SomaComSwing();
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
	public SomaComSwing() {
		Float valor1 = null;
		Float valor2 = null;
		Float soma = null;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}
			public void inputMethodTextChanged(InputMethodEvent event) {
				Scanner teclado2 = new Scanner(System.in);
				Float valor1 = teclado2.nextFloat();
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(255, 113, 51, 46);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}
			public void inputMethodTextChanged(InputMethodEvent event) {
				Scanner teclado1 = new Scanner(System.in);
				Float valor1 = teclado1.nextFloat();
				
				
				
				
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(87, 113, 51, 46);
		contentPane.add(textField);
		
		JButton btnNewButton_1 = new JButton("=");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String vfinal = Float.toString(valor1);
				label1.setText(vfinal);
				    
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(331, 114, 64, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Calculadora de soma");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(138, 33, 257, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(165, 113, 49, 46);
		contentPane.add(lblNewLabel_1);
		
		label1 = new JLabel("0");
		label1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBackground(Color.WHITE);
		label1.setForeground(Color.BLACK);
		label1.setBounds(428, 113, 49, 46);
		contentPane.add(label1);
	}
}
