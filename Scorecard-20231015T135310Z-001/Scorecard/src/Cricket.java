
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Cricket {
//	Wicket frame = new Wicket();
	JFrame frmRohit;
	JLabel lab1;
	JLabel lab2;
	JLabel bating;
	JLabel bowler_name;
	private JTextField t1;
	private JTextField t4;
	private JTextField t2;
	private JTextField t3;
	private JTextField b1_run;
	private JTextField b2_run;
	private JTextField b1_balls;
	private JTextField b2_balls;
	private JTextField b1_four;
	private JTextField b2_four;
	private JTextField b1_six;
	private JTextField b2_six;
	private JTextField b1_sr;
	private JTextField b2_sr;
	private JTextField bow_ovr;
	private JTextField bow_mdn;
	private JTextField bow_run;
	private JTextField bow_wik;
	private JTextField bow_eco;
	JLabel bata;
	JLabel batb1;
	JRadioButton r1;
	JRadioButton r2;
	JCheckBox wic;
	JCheckBox wide;
	JCheckBox noball;
	JCheckBox byes;
	JCheckBox leg_byes;
	int ex_total=0;
	int total;
	int e_ball;
	int no_ball=0;
	String p_ball;
	String answer;
	String rr;
	double r_r;
	int b2_r=0;
	int b1_r=0;
	int ball_1=0;
	int ball_2=0;
	int four_1=0;
	int four_2=0;
	int six_1=0;
	int six_2=0;
	double sr_1;
	double sr_2;
	int wicket=0;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField t5;
	private JTextField this_over;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cricket window = new Cricket();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	void bat1()
	{
		
	}
	/**
	 * Create the application.
	 */
	public Cricket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRohit = new JFrame();
		frmRohit.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\icon\\icons8-cricket-game-48.png"));
		frmRohit.setTitle("rohit's scorrer");
		frmRohit.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 22));
		frmRohit.getContentPane().setBackground(new Color(230, 230, 250));
		frmRohit.setBounds(100, 100, 1025, 763);
		frmRohit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRohit.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(50, 205, 50));
		panel.setBounds(10, 10, 991, 89);
		frmRohit.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cricket");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(240, 255, 240));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 30));
		lblNewLabel.setBounds(74, 26, 143, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("scorer");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(220, 39, 93, 19);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("E:\\icon\\icons8-settings-system-daydream-48.png"));
		btnNewButton_1.setBounds(939, 26, 31, 34);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBounds(897, 26, 31, 34);
		panel.add(btnNewButton_1_1);
		
	     lab1 = new JLabel("TEAM 'A'");
	     lab1.setFont(new Font("Times New Roman", Font.BOLD, 24));
	     lab1.setHorizontalAlignment(SwingConstants.CENTER);
		lab1.setBounds(378, 26, 108, 40);
		panel.add(lab1);
		
		 lab2 = new JLabel("TEAM 'B'");
		 lab2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		 lab2.setHorizontalAlignment(SwingConstants.CENTER);
		lab2.setBounds(563, 26, 127, 40);
		panel.add(lab2);
		
		JLabel lblVs = new JLabel("VS");
		lblVs.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVs.setBounds(513, 38, 23, 23);
		panel.add(lblVs);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(10, 109, 991, 70);
		frmRohit.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	 bating = new JLabel("TEAM 'A'");
	 bating.setHorizontalAlignment(SwingConstants.CENTER);
		bating.setFont(new Font("Tahoma", Font.BOLD, 20));
		bating.setBounds(10, 10, 89, 50);
		panel_1.add(bating);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		t1.setBounds(111, 19, 44, 32);
		panel_1.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("/");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel_2_1.setBounds(165, 2, 31, 58);
		panel_1.add(lblNewLabel_2_1);
		
		t4 = new JTextField();
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		t4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		t4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		t4.setText("0");
		t4.setColumns(10);
		t4.setBounds(185, 18, 31, 32);
		panel_1.add(t4);
		
		JLabel lblNewLabel_2_2 = new JLabel("0VERS");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(266, 10, 89, 50);
		panel_1.add(lblNewLabel_2_2);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t2.setText("0.0");
		t2.setColumns(10);
		t2.setBounds(340, 23, 44, 28);
		panel_1.add(t2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("R.R");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBounds(679, 10, 51, 50);
		panel_1.add(lblNewLabel_2_2_1);
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setText("0.0");
		t3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t3.setColumns(10);
		t3.setBounds(740, 26, 107, 28);
		panel_1.add(t3);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("EXTRAS");
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2_2.setBounds(418, 10, 89, 50);
		panel_1.add(lblNewLabel_2_2_2);
		
		t5 = new JTextField();
		t5.setText("0.0");
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		t5.setColumns(10);
		t5.setBounds(509, 21, 80, 28);
		panel_1.add(t5);
		
		JPanel bat1 = new JPanel();
		bat1.setBackground(new Color(240, 248, 255));
		bat1.setBounds(10, 189, 991, 196);
		frmRohit.getContentPane().add(bat1);
		bat1.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("Batsman");
		lblNewLabel_2_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_2_3.setBounds(33, 10, 86, 25);
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		bat1.add(lblNewLabel_2_3);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(10, 28, 971, 25);
		bat1.add(horizontalStrut);
		
		bata = new JLabel("Bat A");
		bata.setHorizontalAlignment(SwingConstants.CENTER);
		bata.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		bata.setBackground(SystemColor.menu);
		bata.setBounds(10, 50, 80, 25);
		bat1.add(bata);
		
		batb1 = new JLabel("Bat B");
		batb1.setHorizontalAlignment(SwingConstants.CENTER);
		batb1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		batb1.setBackground(SystemColor.menu);
		batb1.setBounds(10, 79, 80, 25);
		bat1.add(batb1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(10, 132, 971, 25);
		bat1.add(horizontalStrut_1);
		
		JLabel lblNewLabel_2_3_3 = new JLabel("Bowler");
		lblNewLabel_2_3_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_3.setBackground(SystemColor.menu);
		lblNewLabel_2_3_3.setBounds(33, 110, 86, 25);
		bat1.add(lblNewLabel_2_3_3);
		
		bowler_name = new JLabel("Bow Name:");
		bowler_name.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		bowler_name.setBackground(SystemColor.menu);
		bowler_name.setBounds(33, 145, 122, 41);
		bat1.add(bowler_name);
		
		JLabel lblNewLabel_2_3_4 = new JLabel("RUN");
		lblNewLabel_2_3_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_4.setBackground(SystemColor.menu);
		lblNewLabel_2_3_4.setBounds(408, 10, 63, 25);
		bat1.add(lblNewLabel_2_3_4);
		
		JLabel lblNewLabel_2_3_4_1 = new JLabel("FOURS");
		lblNewLabel_2_3_4_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_4_1.setBackground(SystemColor.menu);
		lblNewLabel_2_3_4_1.setBounds(628, 10, 91, 25);
		bat1.add(lblNewLabel_2_3_4_1);
		
		JLabel lblNewLabel_2_3_4_2 = new JLabel("BALLS");
		lblNewLabel_2_3_4_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_4_2.setBackground(SystemColor.menu);
		lblNewLabel_2_3_4_2.setBounds(503, 10, 76, 25);
		bat1.add(lblNewLabel_2_3_4_2);
		
		JLabel lblNewLabel_2_3_4_3 = new JLabel("SIXS");
		lblNewLabel_2_3_4_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_4_3.setBackground(SystemColor.menu);
		lblNewLabel_2_3_4_3.setBounds(767, 10, 63, 25);
		bat1.add(lblNewLabel_2_3_4_3);
		
		JLabel lblNewLabel_2_3_4_3_1 = new JLabel("SR.");
		lblNewLabel_2_3_4_3_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_4_3_1.setBackground(SystemColor.menu);
		lblNewLabel_2_3_4_3_1.setBounds(880, 10, 86, 25);
		bat1.add(lblNewLabel_2_3_4_3_1);
		
		JLabel lblNewLabel_2_3_4_4 = new JLabel("OVERS");
		lblNewLabel_2_3_4_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_4_4.setBackground(SystemColor.menu);
		lblNewLabel_2_3_4_4.setBounds(397, 110, 74, 25);
		bat1.add(lblNewLabel_2_3_4_4);
		
		JLabel lblNewLabel_2_3_4_5 = new JLabel("MADIEN");
		lblNewLabel_2_3_4_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_4_5.setBackground(SystemColor.menu);
		lblNewLabel_2_3_4_5.setBounds(503, 110, 86, 25);
		bat1.add(lblNewLabel_2_3_4_5);
		
		JLabel lblNewLabel_2_3_4_6 = new JLabel("RUN");
		lblNewLabel_2_3_4_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_4_6.setBackground(SystemColor.menu);
		lblNewLabel_2_3_4_6.setBounds(628, 110, 63, 25);
		bat1.add(lblNewLabel_2_3_4_6);
		
		JLabel lblNewLabel_2_3_4_7 = new JLabel("WICKET");
		lblNewLabel_2_3_4_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_4_7.setBackground(SystemColor.menu);
		lblNewLabel_2_3_4_7.setBounds(754, 110, 91, 25);
		bat1.add(lblNewLabel_2_3_4_7);
		
		JLabel lblNewLabel_2_3_4_8 = new JLabel("ECO.");
		lblNewLabel_2_3_4_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_4_8.setBackground(SystemColor.menu);
		lblNewLabel_2_3_4_8.setBounds(880, 110, 63, 25);
		bat1.add(lblNewLabel_2_3_4_8);
		
		wic = new JCheckBox("WICKET");
		
		b1_run = new JTextField();
		b1_run.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b1_run.setColumns(10);
		b1_run.setBounds(398, 50, 73, 19);
		bat1.add(b1_run);
		
		b2_run = new JTextField();
		b2_run.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b2_run.setColumns(10);
		b2_run.setBounds(398, 84, 73, 19);
		bat1.add(b2_run);
		
		b1_balls = new JTextField();
		b1_balls.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b1_balls.setColumns(10);
		b1_balls.setBounds(503, 50, 73, 19);
		bat1.add(b1_balls);
		
		b2_balls = new JTextField();
		b2_balls.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b2_balls.setColumns(10);
		b2_balls.setBounds(503, 84, 73, 19);
		bat1.add(b2_balls);
		
		b1_four = new JTextField();
		b1_four.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b1_four.setColumns(10);
		b1_four.setBounds(628, 50, 73, 19);
		bat1.add(b1_four);
		
		b2_four = new JTextField();
		b2_four.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b2_four.setColumns(10);
		b2_four.setBounds(628, 84, 73, 19);
		bat1.add(b2_four);
		
		b1_six = new JTextField();
		b1_six.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b1_six.setColumns(10);
		b1_six.setBounds(757, 50, 73, 19);
		bat1.add(b1_six);
		
		b2_six = new JTextField();
		b2_six.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b2_six.setColumns(10);
		b2_six.setBounds(757, 84, 73, 19);
		bat1.add(b2_six);
		
		b1_sr = new JTextField();
		b1_sr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b1_sr.setColumns(10);
		b1_sr.setBounds(861, 50, 73, 19);
		bat1.add(b1_sr);
		
		b2_sr = new JTextField();
		b2_sr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b2_sr.setColumns(10);
		b2_sr.setBounds(861, 84, 73, 19);
		bat1.add(b2_sr);
		
		bow_ovr = new JTextField();
		bow_ovr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bow_ovr.setColumns(10);
		bow_ovr.setBounds(398, 158, 73, 19);
		bat1.add(bow_ovr);
		
		bow_mdn = new JTextField();
		bow_mdn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bow_mdn.setColumns(10);
		bow_mdn.setBounds(503, 158, 73, 19);
		bat1.add(bow_mdn);
		
		bow_run = new JTextField();
		bow_run.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bow_run.setColumns(10);
		bow_run.setBounds(628, 158, 73, 19);
		bat1.add(bow_run);
		
		bow_wik = new JTextField();
		bow_wik.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bow_wik.setColumns(10);
		bow_wik.setBounds(754, 158, 73, 19);
		bat1.add(bow_wik);
		
		bow_eco = new JTextField();
		bow_eco.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bow_eco.setColumns(10);
		bow_eco.setBounds(861, 158, 73, 19);
		bat1.add(bow_eco);
		
		r1 = new JRadioButton("");
		r1.setSelected(true);
		buttonGroup.add(r1);
		r1.setBounds(96, 54, 46, 21);
		bat1.add(r1);
		
	    r2 = new JRadioButton("");
		buttonGroup.add(r2);
		r2.setBounds(96, 79, 46, 21);
		bat1.add(r2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 248, 255));
		panel_3.setBounds(10, 395, 991, 41);
		frmRohit.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_3_3_1 = new JLabel("This Over:");
		lblNewLabel_2_3_3_1.setBounds(10, 10, 132, 24);
		lblNewLabel_2_3_3_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_3_3_1.setBackground(SystemColor.menu);
		panel_3.add(lblNewLabel_2_3_3_1);
		
		this_over = new JTextField();
		this_over.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this_over.setColumns(10);
		this_over.setBounds(152, 10, 387, 24);
		panel_3.add(this_over);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 248, 255));
		panel_4.setBounds(10, 442, 190, 144);
		frmRohit.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("UNDO");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setBounds(41, 10, 108, 34);
		panel_4.add(btnNewButton);
		
		JButton btnPartnership = new JButton("PARTNERSHIP");
		btnPartnership.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPartnership.setBackground(new Color(50, 205, 50));
		btnPartnership.setBounds(41, 54, 108, 34);
		panel_4.add(btnPartnership);
		
		JButton btnExtras = new JButton("EXTRAS");
		btnExtras.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExtras.setBackground(new Color(50, 205, 50));
		btnExtras.setBounds(41, 100, 108, 34);
		panel_4.add(btnExtras);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(240, 248, 255));
		panel_5.setBounds(210, 446, 310, 144);
		frmRohit.getContentPane().add(panel_5);
		panel_5.setLayout(null);
//-------------------------------------------------------------------------------------------------------------------------------------		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//--------------------wicket------------------
			if(wic.isSelected())
			{
				Wicket frame = new Wicket();
				frame.setVisible(true);
				//String number1=this_over.getText();
				this_over.setText(" W ");
			}
			else
			{
			//----------------extras-----------	
			if(wide.isSelected()||noball.isSelected())
			{
				t1.setText(null);
				String number=t1.getText()+b0.getText();
			    e_ball=Integer.parseInt(number); 
			  
				total=total+1;
				answer=Integer.toString(total);  
				t1.setText(answer);
				
				ex_total=ex_total+1;
				String ex=Integer.toString(ex_total);
				t5.setText(ex);
				
				String number1=this_over.getText()+b0.getText();
			   
			     if(wide.isSelected())
			     {
			    	 this_over.setText(number1+"_WD ");
			     }
			     if(noball.isSelected())
			     {
			    	 this_over.setText(number1+"_NB ");
			     }
			     
			     wide.setSelected(false);
			     noball.setSelected(false);
			     
			}
			else
			{
				//---------------total run-------------
				t1.setText(null);
				String number=t1.getText()+b0.getText();
			    e_ball=Integer.parseInt(number); 
			    
				total=total+e_ball;
				answer=Integer.toString(total);  
				t1.setText(answer);
				//----------------this over----------
				if(no_ball%6==0 && no_ball>0)
				{
					New_bowler frame = new New_bowler();
					frame.setVisible(true);
					this_over.setText(null);
					
				}
				String number1=this_over.getText()+b0.getText();
				this_over.setText(number1+" ");
				
				
				//-------------------over-----------------
				
				t2.setText(null);
				String s1=t2.getText()+b0.getText();
		        no_ball=no_ball+1;
		        String round = String.valueOf(Math.round(no_ball / 6));
		        String mod=String.valueOf(no_ball%6);
		        double numberOfOvers=Double.valueOf(round+"."+mod);
				p_ball=Double.toString(numberOfOvers);
				t2.setText(p_ball);
				bow_ovr.setText(p_ball);
				
				//--------------batsman change-------------
				if(no_ball%6==0)
				{
					if(r1.isSelected())
					{
						r2.setSelected(true);
					}
					else
					{
						r1.setSelected(true);
					}
				}
				//-----------------run rate--------------
				
				t3.setText(null);
				String s2=t3.getText()+b0.getText();
				double d2=Double.valueOf(total);
				r_r=d2/numberOfOvers;
				rr=String.format("%.2f", r_r);
				t3.setText(rr);
				
				//-------------------batsman run----------------
		
				 if(r1.isSelected())
				 {
					
					 
					 b1_r=b1_r+e_ball;
						String run=Integer.toString(b1_r);
					 b1_run.setText(run);
					 
					 ball_1=ball_1+1;
					 String ball_b1=Integer.toString(ball_1);
					 b1_balls.setText(ball_b1);
					 
		            double a,b;
		            a=Double.valueOf(b1_r);
		            b=Double.valueOf(ball_1);
		            sr_1=(a/b)*100;
		            String sr1=String.format("%.2f", sr_1);
		            b1_sr.setText(sr1);
				 }
				 else
				 {
					 b2_r=b2_r+e_ball;
						String run1=Integer.toString(b2_r);
					 b2_run.setText(run1);
					 
					 ball_2=ball_2+1;
					 String ball_b2=Integer.toString(ball_2);
					 b2_balls.setText(ball_b2);
					 
					 double a,b;
					 a=Double.valueOf(b2_r);
					 b=Double.valueOf(ball_2);
					 sr_2=(a/b)*100;
					 String sr2=String.format("%.2f", sr_2);
	               	 b2_sr.setText(sr2);
				 }
				
				
				
			
			}
			}
			}
			
		});
		b0.setFont(new Font("Tahoma", Font.BOLD, 18));
		b0.setBackground(new Color(50, 205, 50));
		b0.setBounds(10, 10, 85, 30);
		panel_5.add(b0);
	//----------------------------------------------------------------------------------------------------------------------------------	
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		//---------------------extras-------------
				
				if(wide.isSelected()||noball.isSelected()||byes.isSelected()||leg_byes.isSelected())
				{
					t1.setText(null);
					String number=t1.getText()+b0.getText();
				    e_ball=Integer.parseInt(number); 
				  
					total=total+4;
					answer=Integer.toString(total);  
					t1.setText(answer);
					
					ex_total=ex_total+4;
					String ex=Integer.toString(ex_total);
					t5.setText(ex);
				     
				     if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
				 	String number1=this_over.getText()+b3.getText();
				     
				     if(byes.isSelected())
				     {
				    	 this_over.setText(number1+"_B ");
				     }
				   
				     else if(leg_byes.isSelected())
				     {
				    	 this_over.setText(number1+"_LB ");
				     }
				     else if(noball.isSelected())
				     {
				    	 this_over.setText(number1+"_NB ");
				     }
				     else
				    	 this_over.setText(number1+"_WD ");
				     
				     wide.setSelected(false);
				     noball.setSelected(false);
				     byes.setSelected(false);
				     leg_byes.setSelected(false);
				     
				}
				else
				{
			//-----------------------batsman runs-------------
					
				t1.setText(null);
				String number=t1.getText()+b3.getText();
			    e_ball=Integer.parseInt(number);  
				total=total+e_ball;
				answer=Integer.toString(total);  
				t1.setText(answer);
				
                //----------------this over----------
				if(no_ball%6==0 && no_ball>0)
				{
					this_over.setText(null);
				}
				String number1=this_over.getText()+b3.getText();
				this_over.setText(number1+" ");
				
				//--------------over-------------
				
				t2.setText(null);
				String s1=t2.getText()+b0.getText();
		        no_ball=no_ball+1;
		        String round = String.valueOf(Math.round(no_ball / 6));
		        String mod=String.valueOf(no_ball%6);
		        double numberOfOvers=Double.valueOf(round+"."+mod);
				p_ball=Double.toString(numberOfOvers);
				t2.setText(p_ball);
				bow_ovr.setText(p_ball);
				
				//--------------run rate-------------
				t3.setText(null);
				String s2=t3.getText()+b0.getText();
				double d2=Double.valueOf(total);
				r_r=d2/numberOfOvers;
				rr=String.format("%.2f", r_r);
				t3.setText(rr);
				//--------------batsman-------------
				
				
				 if(r1.isSelected())
				 {
					 b1_r=b1_r+e_ball;
					String run=Integer.toString(b1_r);
					 b1_run.setText(run);
					 
					 ball_1=ball_1+1;
					 String ball_b1=Integer.toString(ball_1);
					 b1_balls.setText(ball_b1);
					 
					 double a,b;
			            a=Double.valueOf(b1_r);
			            b=Double.valueOf(ball_1);
			            sr_1=(a/b)*100;
			            String sr1=String.format("%.2f", sr_1);
			            b1_sr.setText(sr1);
			            
					 if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
				 }
				 else
				 {
					 b2_r=b2_r+e_ball;
					String run1=Integer.toString(b2_r);
					 b2_run.setText(run1);
					 
					 ball_2=ball_2+1;
					 String ball_b2=Integer.toString(ball_2);
					 b2_balls.setText(ball_b2);
					 
					 double a,b;
					 a=Double.valueOf(b2_r);
					 b=Double.valueOf(ball_2);
					 sr_2=(a/b)*100;
					 String sr2=String.format("%.2f", sr_2);
	               	 b2_sr.setText(sr2);
	               	 
					 if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
				 }
				//--------------batsman change-------------
				 
					if(no_ball%6==0)
					{
						if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
					}
				
			}
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 18));
		b3.setBackground(new Color(50, 205, 50));
		b3.setBounds(10, 50, 85, 30);
		panel_5.add(b3);
		//----------------------------------------------------------------------------------------------------------------------------
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//-------------batsman runs--------------------
				
				t1.setText(null);
				String number=t1.getText()+b5.getText();
			    e_ball=Integer.parseInt(number);  
				total=total+e_ball;
				answer=Integer.toString(total);  
				t1.setText(answer);
				
                //----------------this over----------
				if(no_ball%6==0 && no_ball>0)
				{
					this_over.setText(null);
				}
				String number1=this_over.getText()+b5.getText();
				this_over.setText(number1+" ");
				
				
				//--------------over-------------
				
				t2.setText(null);
				String s1=t2.getText()+b0.getText();
		        no_ball=no_ball+1;
		        String round = String.valueOf(Math.round(no_ball / 6));
		        String mod=String.valueOf(no_ball%6);
		        double numberOfOvers=Double.valueOf(round+"."+mod);
				p_ball=Double.toString(numberOfOvers);
				t2.setText(p_ball);
				bow_ovr.setText(p_ball);
				
				//--------------run rete-------------
				
				t3.setText(null);
				String s2=t3.getText()+b0.getText();
				double d2=Double.valueOf(total);
				r_r=d2/numberOfOvers;
				rr=String.format("%.2f", r_r);
				t3.setText(rr);
				
				//--------------batsman-------------
				
				
				if(r1.isSelected())
				 {
					 b1_r=b1_r+e_ball;
					String run=Integer.toString(b1_r);
					 b1_run.setText(run);
					 
					 ball_1=ball_1+1;
					 String ball_b1=Integer.toString(ball_1);
					 b1_balls.setText(ball_b1);
					 double a,b;
			            a=Double.valueOf(b1_r);
			            b=Double.valueOf(ball_1);
			            sr_1=(a/b)*100;
			            String sr1=String.format("%.2f", sr_1);
			            b1_sr.setText(sr1);
			            
					 if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
					 
					
				 }
				 else
				 {
					 b2_r=b2_r+e_ball;
					String run1=Integer.toString(b2_r);
					 b2_run.setText(run1);
					 
					 ball_2=ball_2+1;
					 String ball_b2=Integer.toString(ball_2);
					 b2_balls.setText(ball_b2);
					 
					 double a,b;
					 a=Double.valueOf(b2_r);
					 b=Double.valueOf(ball_2);
					 sr_2=(a/b)*100;
					 String sr2=String.format("%.2f", sr_2);
	               	 b2_sr.setText(sr2);
	               	 
					 if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
				 }
				//--------------batsman change-------------
				
					if(no_ball%6==0)
					{
						if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
					}
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 18));
		b5.setBackground(new Color(50, 205, 50));
		b5.setBounds(10, 90, 85, 30);
		panel_5.add(b5);
	//----------------------------------------------------------------------------------------------------------------------------------------------	
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//---------------------extras---------------
				
				if(wide.isSelected()||noball.isSelected()||byes.isSelected()||leg_byes.isSelected())
				{ 
					t1.setText(null);
					String number=t1.getText()+b0.getText();
				    e_ball=Integer.parseInt(number); 
				  
					total=total+2;
					answer=Integer.toString(total);  
					t1.setText(answer);
					
					ex_total=ex_total+2;
					String ex=Integer.toString(ex_total);
					t5.setText(ex);
				     
				
				     if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
				     
				 	String number1=this_over.getText()+b1.getText();
				 	
				     if(byes.isSelected())
				     {
				    	 this_over.setText(number1+"_B ");
				     }
				     else if(leg_byes.isSelected())
				     {
				    	 this_over.setText(number1+"_LB ");
				     }
				     else if(noball.isSelected())
				     {
				    	 this_over.setText(number1+"_NB ");
				     }
				     else
				    	 this_over.setText(number1+"_WD ");
				     
				     wide.setSelected(false);
				     noball.setSelected(false);
				     byes.setSelected(false);
				     leg_byes.setSelected(false);
				}
				else
				{
				//---------batsman runs------------ 
				t1.setText(null);
				String number=t1.getText()+b1.getText();
			    e_ball=Integer.parseInt(number);  
				total=total+e_ball;
				answer=Integer.toString(total);  
				t1.setText(answer);
                //----------------this over----------
				if(no_ball%6==0 && no_ball>0)
				{
					this_over.setText(null);
				}
				String number1=this_over.getText()+b1.getText();
				this_over.setText(number1+" ");
				
				
				//--------------over-------------
				
				t2.setText(null);
				String s1=t2.getText()+b0.getText();
		        no_ball=no_ball+1;
		        String round = String.valueOf(Math.round(no_ball / 6));
		        String mod=String.valueOf(no_ball%6);
		        double numberOfOvers=Double.valueOf(round+"."+mod);
				p_ball=Double.toString(numberOfOvers);
				t2.setText(p_ball);
				bow_ovr.setText(p_ball);
				
				//--------------run rate-------------
				
				t3.setText(null);
				String s2=t3.getText()+b0.getText();
				double d2=Double.valueOf(total);
				r_r=d2/numberOfOvers;
				rr=String.format("%.2f", r_r);
				t3.setText(rr);
				
				//--------------batsman-------------
								
				 if(r1.isSelected())
				 {
					 b1_r=b1_r+e_ball;
					String run=Integer.toString(b1_r);
					 b1_run.setText(run);
					 
					 ball_1=ball_1+1;
					 String ball_b1=Integer.toString(ball_1);
					 b1_balls.setText(ball_b1);
					 
					 double a,b;
			            a=Double.valueOf(b1_r);
			            b=Double.valueOf(ball_1);
			            sr_1=(a/b)*100;
			            String sr1=String.format("%.2f", sr_1);
			            b1_sr.setText(sr1);
			            
					 if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
				 }
				 else
				 {
					 b2_r=b2_r+e_ball;
					String run1=Integer.toString(b2_r);
					 b2_run.setText(run1);
					 
					 ball_2=ball_2+1;
					 String ball_b2=Integer.toString(ball_2);
					 b2_balls.setText(ball_b2);
					 
					 double a,b;
					 a=Double.valueOf(b2_r);
					 b=Double.valueOf(ball_2);
					 sr_2=(a/b)*100;
					 String sr2=String.format("%.2f", sr_2);
	               	 b2_sr.setText(sr2);
	               	 
					 if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
					
				 }
				//--------------batsman change-------------
				 
					if(no_ball%6==0)
					{
						if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
					}
				
				
			}
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 18));
		b1.setBackground(new Color(50, 205, 50));
		b1.setBounds(108, 10, 85, 30);
		panel_5.add(b1);
//-------------------------------------------------------------------------------------------------------------------------------------		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			
			//-------------------extras---------------
			
			public void actionPerformed(ActionEvent e) {
				
				if(wide.isSelected()||noball.isSelected()||byes.isSelected()||leg_byes.isSelected())
				{
					t1.setText(null);
					String number=t1.getText()+b0.getText();
				    e_ball=Integer.parseInt(number); 
				  
					total=total+3;
					answer=Integer.toString(total);  
					t1.setText(answer);
					
					ex_total=ex_total+3;
					String ex=Integer.toString(ex_total);
					t5.setText(ex);
				
					String number1=this_over.getText()+b2.getText();
					
				     if(byes.isSelected())
				     {
				    	 this_over.setText(number1+"_B ");
				     }
				     if(leg_byes.isSelected())
				     {
				    	 this_over.setText(number1+"_LB ");
				     }
				     if(noball.isSelected())
				     {
				    	 this_over.setText(number1+"_NB ");
				     }
				     else
				    	 this_over.setText(number1+"_WD ");
				     
				     wide.setSelected(false);
				     noball.setSelected(false);
				     byes.setSelected(false);
				     leg_byes.setSelected(false);
				     
				}
				else
				{
				t1.setText(null);
				String number=t1.getText()+b2.getText();
			    e_ball=Integer.parseInt(number);  
				total=total+e_ball;
				answer=Integer.toString(total);  
				t1.setText(answer);
				
                //----------------this over----------
				if(no_ball%6==0 && no_ball>0)
				{
					this_over.setText(null);
				}
				String number1=this_over.getText()+b2.getText();
				this_over.setText(number1+" ");
				
				
				//--------------over-------------
				
				t2.setText(null);
				String s1=t2.getText()+b0.getText();
		        no_ball=no_ball+1;
		        String round = String.valueOf(Math.round(no_ball / 6));
		        String mod=String.valueOf(no_ball%6);
		        double numberOfOvers=Double.valueOf(round+"."+mod);
				p_ball=Double.toString(numberOfOvers);
				t2.setText(p_ball);
				bow_ovr.setText(p_ball);
				
				//--------------run rate-------------
				
				t3.setText(null);
				String s2=t3.getText()+b0.getText();
				double d2=Double.valueOf(total);
				r_r=d2/numberOfOvers;
				rr=String.format("%.2f", r_r);
				t3.setText(rr);
				
				//--------------batsman-------------
				
				 if(r1.isSelected())
				 {
					 b1_r=b1_r+e_ball;
					String run=Integer.toString(b1_r);
					 b1_run.setText(run);
					 
					 ball_1=ball_1+1;
					 String ball_b1=Integer.toString(ball_1);
					 b1_balls.setText(ball_b1);
					 
					 double a,b;
			            a=Double.valueOf(b1_r);
			            b=Double.valueOf(ball_1);
			            sr_1=(a/b)*100;
			            String sr1=String.format("%.2f", sr_1);
			            b1_sr.setText(sr1);
				 }
				 else
				 {
					 b2_r=b2_r+e_ball;
					String run1=Integer.toString(b2_r);
					 b2_run.setText(run1);
					 
					 ball_2=ball_2+1;
					 String ball_b2=Integer.toString(ball_2);
					 b2_balls.setText(ball_b2);
					 
					 double a,b;
					 a=Double.valueOf(b2_r);
					 b=Double.valueOf(ball_2);
					 sr_2=(a/b)*100;
					 String sr2=String.format("%.2f", sr_2);
	               	 b2_sr.setText(sr2);
				 }
				 
				//--------------batsman change-------------
				 
					if(no_ball%6==0)
					{
						if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
					}
				
			}
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 18));
		b2.setBackground(new Color(50, 205, 50));
		b2.setBounds(206, 10, 85, 30);
		panel_5.add(b2);
//------------------------------------------------------------------------------------------------------------------------------		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//----------------------extras----------------
				
				if(wide.isSelected()||noball.isSelected()||byes.isSelected()||leg_byes.isSelected())
				{
					t1.setText(null);
					String number=t1.getText()+b0.getText();
				    e_ball=Integer.parseInt(number); 
				  
					total=total+5;
					answer=Integer.toString(total);  
					t1.setText(answer);
					
					ex_total=ex_total+5;
					String ex=Integer.toString(ex_total);
					t5.setText(ex);
				   
					String number1=this_over.getText()+b4.getText();
					
				     if(byes.isSelected())
				     {
				    	 this_over.setText(number1+"_B ");
				     }
				     if(leg_byes.isSelected())
				     {
				    	 this_over.setText(number1+"_LB ");
				     }
				     if(noball.isSelected())
				     {
				    	 this_over.setText(number1+"_NB ");
				     }
				     else
				    	 this_over.setText(number1+"_WD ");
				     
				     wide.setSelected(false);
				     noball.setSelected(false);
				     byes.setSelected(false);
				     leg_byes.setSelected(false);
				     
				}
				else
				{
				t1.setText(null);
				String number=t1.getText()+b4.getText();
			    e_ball=Integer.parseInt(number);  
				total=total+e_ball;
				answer=Integer.toString(total);  
				t1.setText(answer);
				
                 //----------------this over----------
				if(no_ball%6==0 && no_ball>0)
				{
					this_over.setText(null);
				}
				String number1=this_over.getText()+b4.getText();
				this_over.setText(number1+" ");
				
				
				//--------------over-------------
				
				t2.setText(null);
				String s1=t2.getText()+b0.getText();
		        no_ball=no_ball+1;
		        String round = String.valueOf(Math.round(no_ball / 6));
		        String mod=String.valueOf(no_ball%6);
		        double numberOfOvers=Double.valueOf(round+"."+mod);
				p_ball=Double.toString(numberOfOvers);
				t2.setText(p_ball);
				bow_ovr.setText(p_ball);
							
				//--------------run rate-------------
				
				t3.setText(null);
				String s2=t3.getText()+b0.getText();
				double d2=Double.valueOf(total);
				r_r=d2/numberOfOvers;
				rr=String.format("%.2f", r_r);
				t3.setText(rr);
				
				//--------------batsman-------------
			
				 if(r1.isSelected())
				 {
					 b1_r=b1_r+e_ball;
					String run=Integer.toString(b1_r);
					 b1_run.setText(run);
					 
					 ball_1=ball_1+1;				 
					 String ball_b1=Integer.toString(ball_1);
					 b1_balls.setText(ball_b1);
					 
					 four_1=four_1+1;
					 String four1=Integer.toString(four_1);
					 b1_four.setText(four1);
					 
					 double a,b;
			            a=Double.valueOf(b1_r);
			            b=Double.valueOf(ball_1);
			            sr_1=(a/b)*100;
			            String sr1=String.format("%.2f", sr_1);
			            b1_sr.setText(sr1);
				 }
				 else
				 {
					 b2_r=b2_r+e_ball;
					String run1=Integer.toString(b2_r);
					 b2_run.setText(run1);
					 
					 ball_2=ball_2+1;
					 String ball_b2=Integer.toString(ball_2);
					 b2_balls.setText(ball_b2);
					 
					 four_2=four_2+1;
					 String four2=Integer.toString(four_2);
					 b2_four.setText(four2);
					 
					 double a,b;
					 a=Double.valueOf(b2_r);
					 b=Double.valueOf(ball_2);
					 sr_2=(a/b)*100;
					 String sr2=String.format("%.2f", sr_2);
	               	 b2_sr.setText(sr2);
				 }
				 
				//--------------batsman change-------------
				 
					if(no_ball%6==0)
					{
						if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
					}
				
				
			}
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 18));
		b4.setBackground(new Color(50, 205, 50));
		b4.setBounds(108, 50, 85, 30);
		panel_5.add(b4);
	//-----------------------------------------------------------------------------------------------------------------------------------	
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//------------extras------------
				
				if(noball.isSelected())
				{
					t1.setText(null);
					String number=t1.getText()+b0.getText();
				    e_ball=Integer.parseInt(number); 
				  
					total=total+7;
					answer=Integer.toString(total);  
					t1.setText(answer);
					
					ex_total=ex_total+7;
					String ex=Integer.toString(ex_total);
					t5.setText(ex);
				    
					String number1=this_over.getText()+b6.getText();
			
						this_over.setText(number1+"_NB ");
						
						// wide.setSelected(false);
					     noball.setSelected(false);
				}
				else
				{
				t1.setText(null);
				String number=t1.getText()+b6.getText();
			    e_ball=Integer.parseInt(number);  
				total=total+e_ball;
				answer=Integer.toString(total);  
				t1.setText(answer);
                //----------------this over----------
				if(no_ball%6==0 && no_ball>0)
				{
					this_over.setText(null);
				}
				String number1=this_over.getText()+b6.getText();
				this_over.setText(number1+" ");
				
				//--------------over-------------
				
				t2.setText(null);
				String s1=t2.getText()+b0.getText();
		        no_ball=no_ball+1; 
		        String round = String.valueOf(Math.round(no_ball / 6));
		        String mod=String.valueOf(no_ball%6);
		        double numberOfOvers=Double.valueOf(round+"."+mod);
				p_ball=Double.toString(numberOfOvers);
				t2.setText(p_ball);
				bow_ovr.setText(p_ball);
				
				//--------------Run rate-------------
				t3.setText(null);
				String s2=t3.getText()+b0.getText();
				double d2=Double.valueOf(total);
				r_r=d2/numberOfOvers;
				rr=String.format("%.2f", r_r);
				t3.setText(rr);
				
				//--------------batsman-------------
				
				
				 if(r1.isSelected())
				 {
					 b1_r=b1_r+e_ball;
					String run=Integer.toString(b1_r);
					 b1_run.setText(run);
					 
					 ball_1=ball_1+1;
					 String ball_b1=Integer.toString(ball_1);
					 b1_balls.setText(ball_b1);
					 
					 six_1=six_1+1;
					 String six1=Integer.toString(six_1);
					 b1_six.setText(six1);
					 
					 double a,b;
			            a=Double.valueOf(b1_r);
			            b=Double.valueOf(ball_1);
			            sr_1=(a/b)*100;
			            String sr1=String.format("%.2f", sr_1);
			            b1_sr.setText(sr1);
				 }
				 else
				 {
					 b2_r=b2_r+e_ball;
					String run1=Integer.toString(b2_r);
					 b2_run.setText(run1);
					 
					 ball_2=ball_2+1;
					 String ball_b2=Integer.toString(ball_2);
					 b2_balls.setText(ball_b2);
					 
					 six_2=six_2+1;
					 String six2=Integer.toString(six_2);
					 b2_six.setText(six2);
					 
					 double a,b;
					 a=Double.valueOf(b2_r);
					 b=Double.valueOf(ball_2);
					 sr_2=(a/b)*100;
					 String sr2=String.format("%.2f", sr_2);
	               	 b2_sr.setText(sr2);
				 }
				//--------------batsman change-------------
					if(no_ball%6==0)
					{
						if(r1.isSelected())
						{
							r2.setSelected(true);
						}
						else
						{
							r1.setSelected(true);
						}
					}
					
				
			}
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 18));
		b6.setBackground(new Color(50, 205, 50));
		b6.setBounds(206, 50, 85, 30);
		panel_5.add(b6);
//----------------------------------------------------------------------------------------------------------------------------------------		
		JButton end = new JButton("END ");
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t3.setText(null);
			}
		});
		end.setFont(new Font("Tahoma", Font.BOLD, 18));
		end.setBackground(new Color(50, 205, 50));
		end.setBounds(108, 90, 85, 30);
		panel_5.add(end);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(240, 248, 255));
		panel_6.setBounds(530, 446, 471, 140);
		frmRohit.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		wide = new JCheckBox("WIDE");
		wide.setFont(new Font("Tahoma", Font.PLAIN, 16));
		wide.setBounds(27, 6, 108, 47);
		panel_6.add(wide);
		
		noball = new JCheckBox("NO BALL");
		noball.setFont(new Font("Tahoma", Font.PLAIN, 16));
		noball.setBounds(138, 6, 108, 47);
		panel_6.add(noball);
		
		byes = new JCheckBox("BYES");
		byes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		byes.setBounds(248, 6, 108, 47);
		panel_6.add(byes);
		
		leg_byes = new JCheckBox("LEG BYES");
		leg_byes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		leg_byes.setBounds(357, 6, 108, 47);
		panel_6.add(leg_byes);
		
		
		wic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  wicket=wicket+1;
			  String wicket1=Integer.toString(wicket);
			  t4.setText(wicket1);
			}
			
		});
		wic.setFont(new Font("Tahoma", Font.PLAIN, 16));
		wic.setBounds(27, 55, 108, 47);
		panel_6.add(wic);
		
		JButton btnNewButton_4_7_1 = new JButton("SWAP");
		btnNewButton_4_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected())
				{
					r2.setSelected(true);
				}
				else
				{
					r1.setSelected(true);
				}
			}
		});
		btnNewButton_4_7_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_4_7_1.setBackground(new Color(50, 205, 50));
		btnNewButton_4_7_1.setBounds(248, 72, 85, 30);
		panel_6.add(btnNewButton_4_7_1);
		
		JButton btnNewButton_4_7_2 = new JButton("RETIRE");
		btnNewButton_4_7_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4_7_2.setBackground(new Color(50, 205, 50));
		btnNewButton_4_7_2.setBounds(357, 72, 85, 30);
		panel_6.add(btnNewButton_4_7_2);
	}
}
