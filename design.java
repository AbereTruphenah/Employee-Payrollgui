package desiugn;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;

public class design {

	private JFrame frmGeorgetownCleaningServices;
	private JTextField monday2;
	private JTextField tuesday2;
	private JTextField wednesday2;
	private JTextField thursday2;
	private JTextField friday2;
	private JTextField saturday2;
	private JTextField sunday2;
	private JTextField monday1;
	private JTextField tuesday1;
	private JTextField wednesday1;
	private JTextField thursday1;
	private JTextField friday1;
	private JTextField saturday1;
	private JTextField sunday1;
	private JTextField nameField;
	private JTextField salaryField;
	private JTextField overtimeHours;
	private JTextField hoursR;
	private JTextField overtimeAmount;
	private JTextField amountR;
	private JTextField netpayField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					design window = new design();
					window.frmGeorgetownCleaningServices.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public design() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetownCleaningServices = new JFrame();
		frmGeorgetownCleaningServices.getContentPane().setBackground(new Color(226, 222, 173));
		frmGeorgetownCleaningServices.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 11));
		frmGeorgetownCleaningServices.setForeground(new Color(86, 106, 203));
		frmGeorgetownCleaningServices.setBackground(new Color(86, 106, 203));
		frmGeorgetownCleaningServices.setFont(new Font("Dialog", Font.BOLD, 11));
		frmGeorgetownCleaningServices.setTitle("Georgetown Cleaning Services - Employee Payroll");
		frmGeorgetownCleaningServices.setBounds(100, 100, 735, 456);
		frmGeorgetownCleaningServices.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorgetownCleaningServices.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(226, 222, 173));
		panel.setBorder(new TitledBorder(null, "Employee Identintification", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 692, 101);
		frmGeorgetownCleaningServices.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel.setBounds(30, 44, 129, 14);
		panel.add(lblNewLabel);
		
		nameField = new JTextField();
		nameField.setBounds(120, 42, 249, 20);
		panel.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Hourly Salary:");
		lblNewLabel_10.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(379, 45, 145, 14);
		panel.add(lblNewLabel_10);
		
		salaryField = new JTextField();
		salaryField.setBounds(463, 42, 86, 20);
		panel.add(salaryField);
		salaryField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(226, 222, 173));
		panel_1.setBorder(new TitledBorder(null, "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 123, 692, 137);
		frmGeorgetownCleaningServices.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel firstWeekHours = new JLabel("First Week:");
		firstWeekHours.setFont(new Font("Dialog", Font.PLAIN, 11));
		firstWeekHours.setBounds(24, 54, 83, 14);
		panel_1.add(firstWeekHours);
		
		JLabel secondWeekHours = new JLabel("Second Week:");
		secondWeekHours.setFont(new Font("Dialog", Font.PLAIN, 11));
		secondWeekHours.setBounds(24, 91, 83, 14);
		panel_1.add(secondWeekHours);
		
		monday2 = new JTextField();
		monday2.setBounds(104, 89, 56, 20);
		panel_1.add(monday2);
		monday2.setColumns(10);
		
		tuesday2 = new JTextField();
		tuesday2.setBounds(168, 89, 56, 20);
		panel_1.add(tuesday2);
		tuesday2.setColumns(10);
		
		wednesday2 = new JTextField();
		wednesday2.setBounds(232, 89, 56, 20);
		panel_1.add(wednesday2);
		wednesday2.setColumns(10);
		
		thursday2 = new JTextField();
		thursday2.setBounds(296, 89, 56, 20);
		panel_1.add(thursday2);
		thursday2.setColumns(10);
		
		friday2 = new JTextField();
		friday2.setBounds(360, 89, 56, 20);
		panel_1.add(friday2);
		friday2.setColumns(10);
		
		saturday2 = new JTextField();
		saturday2.setBounds(423, 89, 56, 20);
		panel_1.add(saturday2);
		saturday2.setColumns(10);
		
		sunday2 = new JTextField();
		sunday2.setBounds(487, 89, 56, 20);
		panel_1.add(sunday2);
		sunday2.setColumns(10);
		
		monday1 = new JTextField();
		monday1.setBounds(104, 52, 56, 20);
		panel_1.add(monday1);
		monday1.setColumns(10);
		
		tuesday1 = new JTextField();
		tuesday1.setBounds(168, 52, 56, 20);
		panel_1.add(tuesday1);
		tuesday1.setColumns(10);
		
		wednesday1 = new JTextField();
		wednesday1.setBounds(232, 52, 56, 20);
		panel_1.add(wednesday1);
		wednesday1.setColumns(10);
		
		thursday1 = new JTextField();
		thursday1.setBounds(296, 52, 56, 20);
		panel_1.add(thursday1);
		thursday1.setColumns(10);
		
		friday1 = new JTextField();
		friday1.setBounds(360, 52, 56, 20);
		panel_1.add(friday1);
		friday1.setColumns(10);
		
		saturday1 = new JTextField();
		saturday1.setBounds(423, 52, 56, 20);
		panel_1.add(saturday1);
		saturday1.setColumns(10);
		
		sunday1 = new JTextField();
		sunday1.setBounds(487, 52, 56, 20);
		panel_1.add(sunday1);
		sunday1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Monday");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(104, 27, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tuesday");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(178, 28, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Wednesday");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(232, 27, 64, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Thursday");
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(306, 27, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Friday");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(370, 28, 46, 14);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Saturday");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(433, 28, 46, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Sunday");
		lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(497, 28, 46, 14);
		panel_1.add(lblNewLabel_9);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(226, 222, 173));
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 278, 692, 121);
		frmGeorgetownCleaningServices.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Regular:");
		lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(119, 49, 46, 14);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Overtime:");
		lblNewLabel_12.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_12.setBounds(119, 76, 46, 14);
		panel_2.add(lblNewLabel_12);
		
		overtimeHours = new JTextField();
		overtimeHours.setBounds(169, 74, 59, 20);
		panel_2.add(overtimeHours);
		overtimeHours.setColumns(10);
		
		hoursR = new JTextField();
		hoursR.setBounds(169, 47, 59, 20);
		panel_2.add(hoursR);
		hoursR.setColumns(10);
		
		overtimeAmount = new JTextField();
		overtimeAmount.setBounds(235, 75, 59, 20);
		panel_2.add(overtimeAmount);
		overtimeAmount.setColumns(10);
		
		amountR = new JTextField();
		amountR.setBounds(235, 47, 59, 20);
		panel_2.add(amountR);
		amountR.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Hours");
		lblNewLabel_13.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_13.setBounds(182, 22, 46, 14);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Amount");
		lblNewLabel_14.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_14.setBounds(237, 22, 46, 14);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Net Pay:");
		lblNewLabel_15.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_15.setBounds(362, 61, 65, 14);
		panel_2.add(lblNewLabel_15);
		
		netpayField = new JTextField();
		netpayField.setBounds(421, 59, 59, 20);
		panel_2.add(netpayField);
		netpayField.setColumns(10);
		
		JButton btnNewButton = new JButton("Process It");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double salary=Double.valueOf(salaryField.getText());
				double MON1hrs=Double.valueOf(monday1.getText());
				double TUE1hrs=Double.valueOf(tuesday1.getText());
				double WED1hrs=Double.valueOf(wednesday1.getText());
				double THUr1hrs=Double.valueOf(thursday1.getText());
				double FRI1hrs=Double.valueOf(friday1.getText());
				double SAT1hrs=Double.valueOf(saturday1.getText());
				double SUN1hrs=Double.valueOf(sunday1.getText());
				double MON2hrs=Double.valueOf(monday2.getText());
				double TUE2hrs=Double.valueOf(tuesday2.getText());
				double WED2hrs=Double.valueOf(wednesday2.getText());
				double THUr2hrs=Double.valueOf(thursday2.getText());
				double FRI2hrs=Double.valueOf(friday2.getText());
				double SAT2hrs=Double.valueOf(saturday2.getText());
				double SUN2hrs=Double.valueOf(sunday2.getText());
				double week1Overtime=0;
				double week2Overtime=0;
				double week2RegularHours=0;
				double week1RegularHours=0;
				double week1hrs[]= {MON1hrs,TUE1hrs,WED1hrs,THUr1hrs,FRI1hrs,SAT1hrs,SUN1hrs};
				for(double hours:week1hrs) {
					if(hours<=8) {
						week1RegularHours+=hours;
					}
					else {
						week1RegularHours+=8;
						week1Overtime+=hours-8;
					}
				}
				double week2hrs[]= {MON2hrs,TUE2hrs,WED2hrs,THUr2hrs,FRI2hrs,SAT2hrs,SUN2hrs};
				for(double hours:week2hrs) {
					if(hours<=8) {
						week2RegularHours+=hours;
					}
					else {
						week2RegularHours+=8;
						week2Overtime+=hours-8;
					}
				}
				double totalOvertime=week1Overtime+week2Overtime;
				double totalRegularHours=week1RegularHours+week2RegularHours;
				hoursR.setText(String.valueOf(totalRegularHours));
				overtimeHours.setText(String.valueOf(totalOvertime));
				double regularAmount=(double)totalRegularHours*salary;
				double overtimeAmnt=(double)totalOvertime*salary*1.5;
				amountR.setText(String.valueOf(regularAmount));
				overtimeAmount.setText(String.valueOf(overtimeAmnt));
				double netPay=(double)overtimeAmnt+regularAmount;
				netpayField.setText(String.valueOf(netPay));
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(226, 222, 173));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 11));
		btnNewButton.setBounds(20, 34, 87, 61);
		panel_2.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(226, 222, 173), new Color(0, 0, 0), new Color(255, 255, 255), new Color(226, 222, 173)));
		panel_3.setBackground(new Color(226, 222, 173));
		panel_3.setBounds(588, 29, 71, 65);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Close");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(15, 21, 46, 14);
		panel_3.add(lblNewLabel_1);
	}
}
