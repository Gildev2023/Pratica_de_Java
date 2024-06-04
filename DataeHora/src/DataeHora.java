import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.util.Date;

public class DataeHora {

	private JFrame frame;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataeHora window = new DataeHora();
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
	public DataeHora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Gilvandro\\Desktop\\Calendar.jpeg"));
		lblNewLabel.setBounds(10, 64, 126, 120);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Calendário");
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(175, 41, 142, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label2 = new JLabel("Data e hora atuais");
		label2.setForeground(Color.RED);
		label2.setBackground(Color.WHITE);
		label2.setHorizontalAlignment(SwingConstants.LEFT);
		label2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label2.setBounds(159, 91, 241, 14);
		frame.getContentPane().add(label2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date relogio = new Date(); 
				
				label2.setText(relogio.toString());
				
				
			}
		});
		btnNewButton.setAction(action);
		btnNewButton.setBounds(175, 127, 142, 23);
		frame.getContentPane().add(btnNewButton);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Clique em mim");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
