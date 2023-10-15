import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wicket extends JFrame {
	Cricket window = new Cricket();
	Wicket r123=new Wicket();
	private JPanel contentPane;
	private JTextField t_11;
	protected Object frmScorecard;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wicket frame = new Wicket();
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
	public Wicket() {
		setTitle("WICKET");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\icon\\icons8-cricket-game-48.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 338);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(50, 205, 50));
		panel.setBounds(10, 10, 416, 45);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fall of wicket");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(25, 10, 171, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How Wicket Fall ?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(39, 65, 231, 32);
		contentPane.add(lblNewLabel_1);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(240, 248, 255));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Boweld", "Catch out", "Run out striker", "run out non-striker", "Stumping", "LBW", "Hit wicket"}));
		comboBox.setBounds(39, 107, 179, 21);
		contentPane.add(comboBox);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("New Batsman");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(39, 149, 231, 32);
		contentPane.add(lblNewLabel_1_1);
		
		t_11 = new JTextField();
		t_11.setBounds(39, 195, 179, 19);
		contentPane.add(t_11);
		t_11.setColumns(10);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 
                  
			}
		});
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(173, 241, 97, 32);
		contentPane.add(btnNewButton);
		
		
	}
}
