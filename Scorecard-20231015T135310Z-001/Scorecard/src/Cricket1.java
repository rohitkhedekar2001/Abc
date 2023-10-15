import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cricket1 extends JFrame {

	 JPanel contentPane;
	 JTextField team1;
	 JTextField team2;
 ButtonGroup buttonGroup = new ButtonGroup();
	 JTextField textField_2;
	 JTextField s1;
	 JTextField s2;
	 JTextField b1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cricket1 frame = new Cricket1();
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
	public Cricket1() {
		setForeground(new Color(50, 205, 50));
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("ROHIT'S SCORRER");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\icon\\icons8-cricket-game-48.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 728);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 929, 90);
		panel.setLayout(null);
		panel.setBackground(new Color(50, 205, 50));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Cricket");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 30));
		lblNewLabel.setBackground(new Color(240, 255, 240));
		lblNewLabel.setBounds(29, 26, 143, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("scorer");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(182, 39, 93, 19);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(939, 26, 31, 34);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setIcon(new ImageIcon("E:\\icon\\icons8-settings-system-daydream-48.png"));
		btnNewButton.setBounds(831, 26, 31, 34);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("E:\\icon\\icons8-bell-24.png"));
		btnNewButton_2.setBounds(790, 26, 31, 34);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("E:\\icon\\icons8-time-machine-24.png"));
		btnNewButton_4.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_4.setBounds(872, 26, 31, 34);
		panel.add(btnNewButton_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(5, 105, 934, 137);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTeam = new JLabel("Teams");
		lblTeam.setBounds(421, 10, 134, 31);
		lblTeam.setForeground(Color.BLACK);
		lblTeam.setFont(new Font("Stencil", Font.BOLD, 30));
		lblTeam.setBackground(new Color(240, 255, 240));
		panel_1.add(lblTeam);
		
		JLabel lblNewLabel_1_1 = new JLabel("Host team");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(130, 38, 149, 19);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("visitor team");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(694, 42, 142, 19);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("vs");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Stencil", Font.PLAIN, 25));
		lblNewLabel_1_3.setBounds(458, 67, 47, 26);
		panel_1.add(lblNewLabel_1_3);
		
		team1 = new JTextField();
		team1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		team1.setBounds(52, 67, 254, 36);
		panel_1.add(team1);
		team1.setColumns(10);
		
		team2 = new JTextField();
		team2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		team2.setColumns(10);
		team2.setBounds(634, 71, 254, 36);
		panel_1.add(team2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 248, 255));
		panel_2.setBounds(5, 247, 924, 61);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("toss won by ?");
		lblNewLabel_1_1_1.setBounds(26, 24, 153, 21);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Stencil", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_1_1_1);
		
		JRadioButton tossh = new JRadioButton("HOST TEAM");
		tossh.setBackground(new Color(240, 240, 240));
		buttonGroup.add(tossh);
		tossh.setFont(new Font("Times New Roman", Font.BOLD, 20));
		tossh.setBounds(209, 18, 153, 28);
		panel_2.add(tossh);
		
		JRadioButton tossv = new JRadioButton("VISITOR TEAM");
		buttonGroup.add(tossv);
		tossv.setFont(new Font("Times New Roman", Font.BOLD, 20));
		tossv.setBounds(383, 18, 192, 28);
		panel_2.add(tossv);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(240, 248, 255));
		panel_2_1.setBounds(5, 317, 924, 61);
		contentPane.add(panel_2_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("OPTED TO ?");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(26, 24, 153, 21);
		panel_2_1.add(lblNewLabel_1_1_1_1);
		
		JRadioButton tb = new JRadioButton("BAT");
		tb.setFont(new Font("Times New Roman", Font.BOLD, 20));
		tb.setBounds(209, 18, 153, 28);
		panel_2_1.add(tb);
		
		JRadioButton to = new JRadioButton("BOWL");
		to.setFont(new Font("Times New Roman", Font.BOLD, 20));
		to.setBounds(383, 18, 192, 28);
		panel_2_1.add(to);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(240, 248, 255));
		panel_2_1_1.setBounds(5, 388, 461, 61);
		contentPane.add(panel_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("OVERS ?");
		lblNewLabel_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(26, 24, 153, 21);
		panel_2_1_1.add(lblNewLabel_1_1_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_2.setBounds(134, 10, 96, 35);
		panel_2_1_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("START MATCH");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cricket window = new Cricket();
				String str1=team1.getText();
				String str=team2.getText();
				String ss1=s1.getText();
				String ss2=s2.getText();
				String bb1=b1.getText();
				window.lab1.setText(str1);
				window.lab2.setText(str);
				window.bata.setText(ss1);
			    window.batb1.setText(ss2);
				window.bowler_name.setText(bb1);
				
				if((tossh.isSelected()&&tb.isSelected())||(tossv.isSelected()&&to.isSelected()))
				{
					window.bating.setText(str1);
				}
				else
				{
					window.bating.setText(str);
				}
				window.frmRohit.setVisible(true);	
				
			}
		});
		btnNewButton_3.setBackground(new Color(50, 205, 50));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton_3.setBounds(387, 640, 182, 41);
		contentPane.add(btnNewButton_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 248, 255));
		panel_3.setBounds(5, 459, 924, 72);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("opening batsman");
		lblNewLabel_1_1_1_2.setBounds(10, 23, 197, 21);
		lblNewLabel_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_2.setFont(new Font("Stencil", Font.PLAIN, 20));
		panel_3.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("striker");
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(319, 10, 99, 19);
		panel_3.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("non-striket");
		lblNewLabel_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_1_3.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_1_1_3.setBounds(653, 10, 136, 19);
		panel_3.add(lblNewLabel_1_1_3);
		
		s1 = new JTextField();
		s1.setBounds(285, 34, 168, 28);
		panel_3.add(s1);
		s1.setColumns(10);
		
		s2 = new JTextField();
		s2.setColumns(10);
		s2.setBounds(634, 38, 168, 28);
		panel_3.add(s2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 248, 255));
		panel_4.setBounds(5, 541, 924, 72);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("opening bowler");
		lblNewLabel_1_1_1_2_1.setBounds(10, 24, 181, 21);
		lblNewLabel_1_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_2_1.setFont(new Font("Stencil", Font.PLAIN, 20));
		panel_4.add(lblNewLabel_1_1_1_2_1);
		
		b1 = new JTextField();
		b1.setBounds(285, 21, 168, 30);
		panel_4.add(b1);
		b1.setColumns(10);
	}
}
