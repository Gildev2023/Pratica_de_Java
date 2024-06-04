import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class OlaMundo {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundo window = new OlaMundo();
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
	public OlaMundo() {
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
		
		JLabel label1 = new JLabel("Vai aparecer algo aqui");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label1.setForeground(Color.RED);
		label1.setBounds(116, 35, 208, 51);
		frame.getContentPane().add(label1);
		
		JButton button1 = new JButton("Clique em mim");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label1.setText("Olá, Mundo!!");
			}
			
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button1.setForeground(Color.RED);
		button1.setBounds(128, 112, 184, 29);
		frame.getContentPane().add(button1);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Clique em mim!!");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
