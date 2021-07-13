/**
 * The class creates a GUI for Part-time and Full-Time Staff hiring
 *
 * @author (Rehan Pradhan)
 * @version (0.1)
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;






public class INGNepal implements ActionListener{
	
	// attributes instance variables
	private JFrame frameMain, frameFullTimeStaff, framePartTimeStaff;  
	private JLabel lblMainTitle, lblMidTitle1, lblMidTitle2, lblTopTitle1, lblTopTitle2, lblVacancyNo, lblDesignation, lblJobType, lblSalary, lblWorkingHour, lblStaffName, lblJoiningDate, lblQualification, lblAppointedBy, lblWagesPerHour, lblShift, lblVacancyNoFull, lblVacancyNoPart;
	private JTextField txtVacancyNo, txtDesignation, txtJobType, txtSalary, txtWorkingHour, txtStaffName, txtJoiningDate, txtQualification, txtAppointedBy, txtWagesPerHour, txtVacancyNoFull, txtVacancyNoPart;
	private JButton btnFullTimeStaffHire, btnPartTimeStaffHire, btnDisplay, btnExit, btnExitFullTime, btnExitPartTime, btnAddVacancyFullTime, btnAddVacancyPartTime, btnAppointFullTime, btnAppointPartTime, btnClearFullTime, btnClearPartTime, btnTerminate;
	private JRadioButton rBtnMorning,rBtnNignt;
	private String shift;
	
	ArrayList <StaffHire> list=new ArrayList <StaffHire> (); // Declaring Array List which stores StaffHire objects
	
	public static void main (String []args) // Main method 
	{
		
		INGNepal obj=new INGNepal();
		obj.hireForm(); //Calling Method
		
		
	}
	
	public void hireForm() // Creating an interface for the main menu which contains the buttons to add Part-time and Full-time staff and display
	{	
		
		Color c=new Color (34, 34, 38);
		Color c1=new Color (255,140,0);
		Color c2=new Color (255,255,255);
		
		frameMain=new JFrame ("Welcome");
		frameMain.getContentPane().setBackground(c);
		Font f=new Font ("Calibri",Font.PLAIN,25);
		Font f2=new Font ("Calibri",Font.BOLD,18);
		
		lblMainTitle=new JLabel("ADD VACANCY AND HIRE STAFF FOR FULL-TIME AND PART-TIME STAFF");
		lblMainTitle.setBounds(20, 0, 550, 30);
		lblMainTitle.setForeground(c2);
		lblMainTitle.setFont(f2);
		frameMain.add(lblMainTitle);
		
		
		btnFullTimeStaffHire=new JButton("ADD FULL-TIME STAFF");
		btnFullTimeStaffHire.setBounds(55, 60, 450, 70);
		btnFullTimeStaffHire.addActionListener(this);
		btnFullTimeStaffHire.setBackground(c1);
		btnFullTimeStaffHire.setForeground(c2);
		btnFullTimeStaffHire.setFont(f);
		frameMain.add (btnFullTimeStaffHire);
		
		
		btnPartTimeStaffHire=new JButton("ADD PART-TIME STAFF");
		btnPartTimeStaffHire.setBounds(55, 140, 450, 70);
		btnPartTimeStaffHire.addActionListener(this);
		btnPartTimeStaffHire.setBackground(c1);
		btnPartTimeStaffHire.setForeground(c2);
		btnPartTimeStaffHire.setFont(f);
		frameMain.add (btnPartTimeStaffHire);
		
		btnDisplay=new JButton("DISPLAY");
		btnDisplay.setBounds(55, 220, 450, 70);
		btnDisplay.addActionListener(this);
		btnDisplay.setBackground(c1);
		btnDisplay.setForeground(c2);
		btnDisplay.setFont(f);
		frameMain.add (btnDisplay);
		
		btnExit=new JButton("EXIT");
		btnExit.setBounds(55, 300, 450, 70);
		btnExit.addActionListener(this);
		btnExit.setBackground(c1);
		btnExit.setForeground(c2);
		btnExit.setFont(f);
		frameMain.add(btnExit);
		
		
		frameMain.setSize(580, 500);
		frameMain.setLayout(null);
		frameMain.setResizable(false);
		frameMain.setVisible(true);
		
		
		
	}
	
	
	public void fullTimeHire () //Creating an interface to hire Full-time staff
	{
		Color c1=new Color (255, 255, 255);//white color
		Color c2=new Color (232, 53, 53);// red color
		Color c3=new Color (36, 42, 71); // blue color
		Color c4=new Color(60,179,113); // green color
		Color c5=new Color (255,140,0);//orange blue 
		
		
		frameFullTimeStaff=new JFrame("Hire Full-Time Staff Here!");
		frameFullTimeStaff.getContentPane().setBackground(c3);
		Font f=new Font ("Calibri",Font.BOLD,20);
		
		lblTopTitle1=new JLabel("Add Vacancy For Full-Time Staff");
		lblTopTitle1.setBounds(140, 0, 280, 50);
		lblTopTitle1.setForeground(c1);
		lblTopTitle1.setFont(f);
		frameFullTimeStaff.add(lblTopTitle1);
		
		lblVacancyNo=new JLabel("Vacancy No:");
		lblVacancyNo.setBounds(10, 70, 70, 30);
		lblVacancyNo.setForeground(c1);
		frameFullTimeStaff.add(lblVacancyNo);
		
		txtVacancyNo=new JTextField();
		txtVacancyNo.setBounds(90, 70, 100, 30);
		frameFullTimeStaff.add(txtVacancyNo);
		
		lblDesignation=new JLabel("Designation:");
		lblDesignation.setBounds(280, 70, 100, 30);
		lblDesignation.setForeground(c1);
		frameFullTimeStaff.add(lblDesignation);
		
		txtDesignation=new JTextField();
		txtDesignation.setBounds(360, 70, 145, 30);
		frameFullTimeStaff.add(txtDesignation);
		
		lblJobType=new JLabel("Job-Type:");
		lblJobType.setBounds(10, 110, 80, 30);
		lblJobType.setForeground(c1);
		frameFullTimeStaff.add(lblJobType);
		
		txtJobType=new JTextField();
		txtJobType.setBounds(90, 110, 100, 30);
		frameFullTimeStaff.add(txtJobType);
		
		lblSalary=new JLabel("Salary:");
		lblSalary.setBounds(280, 110, 80, 30);
		lblSalary.setForeground(c1);
		frameFullTimeStaff.add(lblSalary);
		
		txtSalary=new JTextField();
		txtSalary.setBounds(360, 110, 100, 30);
		frameFullTimeStaff.add(txtSalary);
		
		lblWorkingHour=new JLabel("Working Hour:");
		lblWorkingHour.setBounds(10, 150, 90, 30);
		lblWorkingHour.setForeground(c1);
		frameFullTimeStaff.add(lblWorkingHour);
		
		txtWorkingHour=new JTextField();
		txtWorkingHour.setBounds(95, 150, 100, 30);
		frameFullTimeStaff.add(txtWorkingHour);
		
		btnAddVacancyFullTime=new JButton("ADD VACANCY");
		btnAddVacancyFullTime.setBounds(200, 190, 120, 30);
		btnAddVacancyFullTime.addActionListener(this);
		btnAddVacancyFullTime.setBackground(c4);
		frameFullTimeStaff.add(btnAddVacancyFullTime);
		
		lblMidTitle1=new JLabel("Appoint A Full-Time Staff");
		lblMidTitle1.setBounds(160, 260, 280, 30);
		lblMidTitle1.setForeground(c1);
		lblMidTitle1.setFont(f);
		frameFullTimeStaff.add(lblMidTitle1);
		
		lblVacancyNoFull=new JLabel("Vacancy No:");
		lblVacancyNoFull.setBounds(10, 300, 80, 30);
		lblVacancyNoFull.setForeground(c1);
		frameFullTimeStaff.add(lblVacancyNoFull);
		
		txtVacancyNoFull=new JTextField();
		txtVacancyNoFull.setBounds(90, 300, 100, 30);
		frameFullTimeStaff.add(txtVacancyNoFull);
		
		lblStaffName=new JLabel("Staff's Name:");
		lblStaffName.setBounds(10, 340, 80, 30);
		lblStaffName.setForeground(c1);
		frameFullTimeStaff.add(lblStaffName);
		
		txtStaffName=new JTextField();
		txtStaffName.setBounds(90, 340, 125, 30);
		frameFullTimeStaff.add(txtStaffName);
		
		lblJoiningDate=new JLabel("Joining Date:");
		lblJoiningDate.setBounds(280, 340, 80, 30);
		lblJoiningDate.setForeground(c1);
		frameFullTimeStaff.add(lblJoiningDate);
		
		txtJoiningDate=new JTextField();
		txtJoiningDate.setBounds(360, 340, 100, 30);
		frameFullTimeStaff.add(txtJoiningDate);
		
		lblQualification=new JLabel("Qualification:");
		lblQualification.setBounds(10, 380, 80, 30);
		lblQualification.setForeground(c1);
		frameFullTimeStaff.add(lblQualification);
		
		txtQualification=new JTextField();
		txtQualification.setBounds(90, 380, 125, 30);
		frameFullTimeStaff.add(txtQualification);
		
		lblAppointedBy=new JLabel("Appointed By:");
		lblAppointedBy.setBounds(280, 380, 80, 30);
		lblAppointedBy.setForeground(c1);
		frameFullTimeStaff.add(lblAppointedBy);
		
		txtAppointedBy=new JTextField();
		txtAppointedBy.setBounds(360, 380, 125, 30);
		frameFullTimeStaff.add(txtAppointedBy);
		
		btnAppointFullTime=new JButton("APPOINT STAFF");
		btnAppointFullTime.setBounds(200, 440, 130, 30);
		btnAppointFullTime.addActionListener(this);
		btnAppointFullTime.setBackground(c4);
		frameFullTimeStaff.add(btnAppointFullTime);
		
		btnClearFullTime=new JButton("CLEAR");
		btnClearFullTime.setBounds(10, 510, 100, 30);
		btnClearFullTime.addActionListener(this);
		btnClearFullTime.setBackground(c5);
		btnClearFullTime.setForeground(c1);
		frameFullTimeStaff.add(btnClearFullTime);
		
		btnExitFullTime=new JButton("EXIT");
		btnExitFullTime.setBounds(425, 510, 100, 30);
		btnExitFullTime.addActionListener(this);
		btnExitFullTime.setBackground(c2);
		btnExitFullTime.setForeground(c1);
		frameFullTimeStaff.add(btnExitFullTime);
		
		
		frameFullTimeStaff.setSize(550, 600);
		frameFullTimeStaff.setLayout(null);
		frameFullTimeStaff.setVisible(true);
	}
	
	
	
	
	public void partTimeHire() //Creating an interface for hiring Part-time staff
	{
		Color c1=new Color (255, 255, 255);//white color
		Color c2=new Color (232, 53, 53);// red color
		Color c3=new Color (36, 42, 71); // blue color
		Color c4=new Color(60,179,113); // green color
		Color c5=new Color (255,140,0);//orange blue 
		
		Font f=new Font ("Calibri",Font.BOLD,20);
		
		framePartTimeStaff=new JFrame("Hire Part-Time Staff Here!");
		framePartTimeStaff.getContentPane().setBackground(c3);
		
		lblTopTitle2=new JLabel("Add Vacancy For Part-Time Staff");
		lblTopTitle2.setBounds(150, 0, 280, 50);
		lblTopTitle2.setForeground(c1);
		lblTopTitle2.setFont(f);
		framePartTimeStaff.add(lblTopTitle2);
		
		lblVacancyNo=new JLabel("Vacancy No:");
		lblVacancyNo.setBounds(10, 70, 70, 30);
		lblVacancyNo.setForeground(c1);
		framePartTimeStaff.add(lblVacancyNo);
		
		txtVacancyNo=new JTextField();
		txtVacancyNo.setBounds(90, 70, 100, 30);
		framePartTimeStaff.add(txtVacancyNo);
		
		lblDesignation=new JLabel("Designation:");
		lblDesignation.setBounds(280, 70, 100, 30);
		lblDesignation.setForeground(c1);
		framePartTimeStaff.add(lblDesignation);
		
		txtDesignation=new JTextField();
		txtDesignation.setBounds(360, 70, 125, 30);
		framePartTimeStaff.add(txtDesignation);
		
		lblJobType=new JLabel("Job-Type:");
		lblJobType.setBounds(10, 110, 80, 30);
		lblJobType.setForeground(c1);
		framePartTimeStaff.add(lblJobType);
		
		txtJobType=new JTextField();
		txtJobType.setBounds(90, 110, 100, 30);
		framePartTimeStaff.add(txtJobType);
		
		lblWorkingHour=new JLabel("Working Hour:");
		lblWorkingHour.setBounds(280, 110, 100, 30);
		lblWorkingHour.setForeground(c1);
		framePartTimeStaff.add(lblWorkingHour);
		
		txtWorkingHour=new JTextField();
		txtWorkingHour.setBounds(365, 110, 100, 30);
		framePartTimeStaff.add(txtWorkingHour);
		
		lblWagesPerHour=new JLabel("Wages Per Hour:");
		lblWagesPerHour.setBounds(10, 150, 100, 30);
		lblWagesPerHour.setForeground(c1);
		framePartTimeStaff.add(lblWagesPerHour);
		
		txtWagesPerHour=new JTextField();
		txtWagesPerHour.setBounds(110, 150, 100, 30);
		framePartTimeStaff.add(txtWagesPerHour);
		
		lblShift=new JLabel("Shift:");
		lblShift.setBounds(280, 160, 80, 30);
		lblShift.setForeground(c1);
		framePartTimeStaff.add(lblShift);
		
		rBtnMorning=new JRadioButton("Morning");
		rBtnMorning.setBounds(320, 155, 90, 20);
		rBtnMorning.setBackground(c3);
		rBtnMorning.setForeground(c1);
		framePartTimeStaff.add(rBtnMorning);
		
		rBtnNignt=new JRadioButton("Night");
		rBtnNignt.setBounds(320, 175, 90, 20);
		rBtnNignt.setBackground(c3);
		rBtnNignt.setForeground(c1);
		framePartTimeStaff.add(rBtnNignt);
		
		rBtnMorning.setSelected(true);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rBtnMorning);
		bg.add(rBtnNignt);
		
		btnAddVacancyPartTime=new JButton("ADD VACANCY");
		btnAddVacancyPartTime.setBounds(190, 210, 120, 30);
		btnAddVacancyPartTime.addActionListener(this);
		btnAddVacancyPartTime.setBackground(c4);
		framePartTimeStaff.add(btnAddVacancyPartTime);
		
		lblMidTitle2=new JLabel("Appoint A Part-Time Staff");
		lblMidTitle2.setBounds(150, 260, 260, 30);
		lblMidTitle2.setForeground(c1);
		lblMidTitle2.setFont(f);
		framePartTimeStaff.add(lblMidTitle2);
		
		lblVacancyNoPart=new JLabel("Vacancy No");
		lblVacancyNoPart.setBounds(10, 300, 80, 30);
		lblVacancyNoPart.setForeground(c1);
		framePartTimeStaff.add(lblVacancyNoPart);
		
		txtVacancyNoPart=new JTextField();
		txtVacancyNoPart.setBounds(90, 300, 100, 30);
		framePartTimeStaff.add(txtVacancyNoPart);
		
		lblStaffName=new JLabel("Staff's Name:");
		lblStaffName.setBounds(10, 340, 80, 30);
		lblStaffName.setForeground(c1);
		framePartTimeStaff.add(lblStaffName);
		
		txtStaffName=new JTextField();
		txtStaffName.setBounds(90, 340, 125, 30);
		framePartTimeStaff.add(txtStaffName);
		
		lblJoiningDate=new JLabel("Joining Date:");
		lblJoiningDate.setBounds(280, 340, 80, 30);
		lblJoiningDate.setForeground(c1);
		framePartTimeStaff.add(lblJoiningDate);
		
		txtJoiningDate=new JTextField();
		txtJoiningDate.setBounds(360, 340, 100, 30);
		framePartTimeStaff.add(txtJoiningDate);
		
		lblQualification=new JLabel("Qualification:");
		lblQualification.setBounds(10, 380, 80, 30);
		lblQualification.setForeground(c1);
		framePartTimeStaff.add(lblQualification);
		
		txtQualification=new JTextField();
		txtQualification.setBounds(90, 380, 125, 30);
		framePartTimeStaff.add(txtQualification);
		
		lblAppointedBy=new JLabel("Appointed By:");
		lblAppointedBy.setBounds(280, 380, 80, 30);
		lblAppointedBy.setForeground(c1);
		framePartTimeStaff.add(lblAppointedBy);
		
		txtAppointedBy=new JTextField();
		txtAppointedBy.setBounds(360, 380, 125, 30);
		framePartTimeStaff.add(txtAppointedBy);
		
		btnAppointPartTime=new JButton("APPOINT STAFF");
		btnAppointPartTime.setBounds(185, 460, 130, 30);
		btnAppointPartTime.addActionListener(this);
		btnAppointPartTime.setBackground(c4);
		framePartTimeStaff.add(btnAppointPartTime);
		
		btnClearPartTime=new JButton("CLEAR");
		btnClearPartTime.setBounds(10, 550, 100, 30);
		btnClearPartTime.addActionListener(this);
		btnClearPartTime.setBackground(c5);
		btnClearPartTime.setForeground(c1);
		framePartTimeStaff.add(btnClearPartTime);
		
		btnTerminate=new JButton("TERMINATE STAFF");
		btnTerminate.setBounds(185, 550, 140, 30);
		btnTerminate.addActionListener(this);
		btnTerminate.setBackground(c2);
		btnTerminate.setForeground(c1);
		framePartTimeStaff.add(btnTerminate);
		
		
		btnExitPartTime=new JButton("EXIT");
		btnExitPartTime.setBounds(425, 550, 100, 30);
		btnExitPartTime.addActionListener(this);
		btnExitPartTime.setBackground(c2);
		btnExitPartTime.setForeground(c1);
		framePartTimeStaff.add(btnExitPartTime);
		
		framePartTimeStaff.setSize(550, 650);
		framePartTimeStaff.setLayout(null);
		framePartTimeStaff.setVisible(true);
		
	}
	
	
	
	
	@Override
	public void actionPerformed (ActionEvent e) 
	{
		
		
		
		
		if(e.getSource()==btnFullTimeStaffHire) //works when Add Full-Time staff button is clicked
		{
			
			fullTimeHire();
			
		}
		
		
		
		
		
		else if(e.getSource()==btnPartTimeStaffHire) //works when Add Part-Time staff button is clicked
		{
			partTimeHire();
		}
		
		
		
		
		else if (e.getSource()==btnAddVacancyFullTime) //works when Add vacancy button is clicked in Full-Time GUI
		{
			addVacancyFullTime();
		}
		
		
		
		
		else if(e.getSource()==btnAddVacancyPartTime) //works when Add vacancy button is clicked in Part-Time GUI
		{
			addVacancyPartTime();
		}
		
		
		
		
		else if (e.getSource()==btnAppointFullTime) //works when appoint staff button is clicked in Full-Time GUI
		{
			appointFullTime();
		}
		
		
		
		
		
		else if (e.getSource()==btnAppointPartTime) //works when appoint staff button is clicked in Part-Time GUI
		{
			appointPartTime();
		}
		
		
		
		
		
		else if (e.getSource()==btnTerminate) //works when terminate button is clicked in Part-Time GUI
		{
			terminate();
		}
		
		
		
		
		else if (e.getSource()==btnDisplay) //works when display button is clicked
		{
			displayEverything();
		}
		
		
		
		
		
		else if (e.getSource()==btnClearFullTime) //works when clear button is clicked in Full-Time GUI
		{
			clearFullTime();
		}
		
		
		
		
		else if (e.getSource()==btnClearPartTime) //works when clear button is clicked in Part-Time GUI
		{
			clearPartTime();
		}
		
		
		
		else if (e.getSource()==btnExit) //works when exit button is clicked
		{
			System.exit(0);
		}
		
		
		
		
		else if (e.getSource()==btnExitFullTime) //works when exit button is clicked in the Full-Time GUI
		{
			frameFullTimeStaff.dispose();
		}
		
		
		
		
		else if (e.getSource()==btnExitPartTime) //works when exit button is clicked in the Part-Time GUI
		{
			framePartTimeStaff.dispose();
		}
			
		
		
	}
	
	
	
	
	public void addVacancyFullTime()
	{
		try 
		{
			
			if (txtVacancyNo.getText().equals("") || txtDesignation.getText().equals("") || txtJobType.getText().equals("") || txtSalary.getText().equals("") || txtWorkingHour.getText().equals("")) // checking text fields are empty or not
			{
				JOptionPane.showMessageDialog(null, "PLEASE FILL OUT ALL THE INFORMATION ABOUT THE VACANCY!");
			}
			
			else 
			{
				boolean duplicateVacancyNo=false;
				for (StaffHire var:list) // for each loop
				{
					if(var.getvacancyNo()==getVacancyNo())// checking if the vacancy is already in the list or not
					{
						duplicateVacancyNo=true;
						break;
					}
				}
				
				if (duplicateVacancyNo==false) 
				{
					StaffHire obj=new FullTimeStaffHire(getVacancyNo(), getDesignation(), getJobType(), getSalary(), getWorkingHour());
					list.add(obj); // adding the object into the list
					JOptionPane.showMessageDialog(null, "VACANCY FOR FULL-TIME STAFF HAS BEEN ADDED!");
					
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null,"VACANCY NUMBER ALREADY EXISTS!","ERROR!",JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		}
		catch (NumberFormatException expf) // Catches Number Format Exception if any
		{
			JOptionPane.showMessageDialog(null, "INVALID INPUT!", "Error!", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	
	
	
	public void addVacancyPartTime()
	{
		try 
		{
			if (txtVacancyNo.getText().equals("") || txtDesignation.getText().equals("") || txtJobType.getText().equals("") || txtWorkingHour.getText().equals("") || txtWagesPerHour.getText().equals("")) // checking text fields are empty or not
			{
				JOptionPane.showMessageDialog(null, "PLEASE FILL OUT ALL THE INFORMATION ABOUT THE VACANCY!");
			}
			
			else 
			{
				boolean duplicateVacancyNo=false;
				for (StaffHire var:list) // for each loop
				{
					if(var.getvacancyNo()==getVacancyNo()) // checking if the vacancy is already in the list or not
					{
						duplicateVacancyNo=true;
						break;
					}
				}
				
				if (duplicateVacancyNo==false) 
				{
					StaffHire staff=new PartTimeStaffHire (getVacancyNo(), getDesignation(), getJobType(), getWorkingHour(), getWagesPerHour(), getShift());
					list.add(staff); // adding the object into the list
					JOptionPane.showMessageDialog(null, "VACANCY FOR PART-TIME STAFF HAS BEEN ADDED!");
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null,"VACANCY NUMBER ALREADY EXISTS!","ERROR!",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		
		catch (NumberFormatException expf) // Catches Number Format Exception if any
		{
			JOptionPane.showMessageDialog(null, "INVALID INPUT!", "Error!", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	
	
	
	public void appointFullTime() 
	{
		try 
		{
			String C="";
			if (txtStaffName.getText().equals("")|| txtJoiningDate.getText().equals("")|| txtQualification.getText().equals("")|| txtAppointedBy.getText().equals("")) // checking if the staff details are empty
			{
				JOptionPane.showMessageDialog(null, "PLEASE FILL OUT ALL THE INFORMATION ABOUT THE STAFF!");
			}
			
			else 
			{
				for (StaffHire staff:list) //for each loop
				{
					if(staff.getvacancyNo()==getVacancyNoFull()) //Checking if the vacancy is in the list or not
					{
						if (staff instanceof FullTimeStaffHire) // Checking if staff is an instance of FullTimeStaffHire class or not
						{
							FullTimeStaffHire appointStaff1=(FullTimeStaffHire) staff; //Down Casting the object of FullTimeStaffHire class
							if(appointStaff1.getjoined()==false) 
							{
								appointStaff1.fullTimeStaff(getStaffName(), getJoiningDate(), getQualification(), getAppointedBy());
								JOptionPane.showMessageDialog(null, "FULL-TIME STAFF HAS BEEN HIRED!");
								C="1";
							}
							
							else 
							{
								JOptionPane.showMessageDialog(null, "THE STAFF HAS ALREADY BEEN APPOINTED FOR THE POST!");
								C="1";
							}
						}
						else if (staff instanceof PartTimeStaffHire) // Checking if staff is an instance of PartTimeStaffHire class or not 
						{
							JOptionPane.showMessageDialog(null, "THIS VACANCY IS FOR PART-TIME STAFF ONLY!");
							C="1";
						}
					}
					
					
			
				}
				if (C=="") 
				{
					JOptionPane.showMessageDialog(null, "THE VACANCY NUMBER DOES NOT EXIST!");
				}
			}
		}
		catch (NumberFormatException ex) //Catches if there is any kind of Number Format Exception
		{
			if(txtVacancyNoFull.getText().equals("")) 
			{
				JOptionPane.showMessageDialog(null, "THE VACANCY NO. FIELD IS EMPTY!");
			}
			
			else 
			{
				JOptionPane.showMessageDialog(null, "ENTER INTEGER VALUE FOR VACANCY NO.");
			}
		}
	}
	
	
	
	
	
	public void appointPartTime() 
	{
		try 
		{
			String C="";
			if (txtStaffName.getText().equals("")|| txtJoiningDate.getText().equals("")|| txtQualification.getText().equals("")|| txtAppointedBy.getText().equals("")) // checking if the staff details are empty
			{
				JOptionPane.showMessageDialog(null, "PLEASE FILL OUT ALL THE INFORMATION ABOUT THE STAFF!");
			}
			
			else 
			{
				for (StaffHire staff:list) //for each loop
				{
					if (staff.getvacancyNo()==getVacancyNoPart()) //Checking if the vacancy is in the list or not
					{
						if (staff instanceof PartTimeStaffHire) // Checking if staff is an instance of partTimeStaffHire class or not
						{
							PartTimeStaffHire appointStaff2=(PartTimeStaffHire) staff; //Down Casting the object of PartTimeStaffHire class
							if (appointStaff2.getjoined()==false) 
							{
								appointStaff2.HirePartTimeStaff(getStaffName(), getJoiningDate(), getQualification(), getAppointedBy());
								JOptionPane.showMessageDialog(null, "PART-TIME STAFF HAS BEEN HIRED");
								C="1";
							}
							
							else 
							{
								JOptionPane.showMessageDialog(null, "THE STAFF HAS ALREADY BEEN APPOINTED FOR THE POST!");
								C="1";
							}
						}
						
						else if (staff instanceof FullTimeStaffHire) // Checking if staff is an instance of FullTimeStaffHire class or not 
						{
							JOptionPane.showMessageDialog(null, "THIS VACANCY IS FOR FULL-TIME STAFF ONLY!");
							C="1";
						}
					}
				}
				if (C=="") 
				{
					JOptionPane.showMessageDialog(null, "THE VACANCY NUMBER DOES NOT EXIST!");
				}
			}
		}
		catch (NumberFormatException ex) //Catches if there is any Number Format Exception
		{
			if(txtVacancyNoPart.getText().equals("")) 
			{
				JOptionPane.showMessageDialog(null, "THE VACANCY NO. FIELD IS EMPTY!");
			}
			
			else 
			{
				JOptionPane.showMessageDialog(null, "ENTER INTEGER VALUE FOR VACANCY NO.");
			}
		}
	}
	
	
	
	public void terminate() 
	{
		try 
		{
			String find="";
			if(txtVacancyNoPart.getText().equals("")) // checks if the vacancy no text field is empty or not
			{
				JOptionPane.showMessageDialog(null, "THE VACANCY NO. FIELD IS EMPTY!");
			}
			else 
			{
				for (StaffHire staff:list) // for each loop
				{
					
					if (staff instanceof PartTimeStaffHire) //Checking of staff is an instance of PartTimeStaffHire or not
					{
						PartTimeStaffHire staffTerminate=(PartTimeStaffHire)staff; //Down Casting the object of PartTimeStaffHire
						if (staff.getvacancyNo()==getVacancyNoPart()) // Checking if the vacancy exists in the list or not
						{
							if (staffTerminate.getterminated()==false) 
							{
								staffTerminate.terminate();
								JOptionPane.showMessageDialog(null, "THE STAFF HAS BEEN TERMINATED!");
								find="1";
							}
							
							else if (staffTerminate.getterminated()==true) 
							{
								JOptionPane.showMessageDialog(null, "THE STAFF HAS ALREADY BEEN TERMINATED!");
								find="1";
							}
							
							else 
							{
								find="1";
							}
						}
					}
				}
				
				if (find=="") 
				{
					JOptionPane.showMessageDialog(null, "THE STAFF FOR THE ENTERED VACANCY DOES NOT EXIST!");
				}
			}
			
			
		}
		
		catch (NumberFormatException ex) // Catches if there is a Number Format Exception or not
		{
			
			JOptionPane.showMessageDialog(null, "ENTER INTEGER VALUE FOR VACANCY NO.");
			
		}
	}
	
	
	
	public void displayEverything() 
	{
		if(list.size()!=0) 
		{
			for (StaffHire staff:list) 
			{
				if (staff instanceof FullTimeStaffHire) //Checks if staff is an instance of FullTimeStaffHire class or not
				{
					System.out.println("---------------------------------");
					System.out.println("         FULL-TIME STAFF!        ");
					System.out.println("---------------------------------");
					FullTimeStaffHire displayFull=(FullTimeStaffHire) staff; // Down Casting the object of FullTimeStaffHire class to use unique methods 
					displayFull.disinfo();
				}
				
				else if (staff instanceof PartTimeStaffHire) //Checks if staff is an instance of PartTimeStaffHire class or not
				{
					System.out.println("---------------------------------");
					System.out.println("         PART-TIME STAFF!        ");
					System.out.println("---------------------------------");
					PartTimeStaffHire displayPart=(PartTimeStaffHire) staff;// Down Casting the object of PartTimeStaffHire class to use unique methods 
					displayPart.dispinf();
				}
			}
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "THERE IS NOTHING TO DISPLAY HERE!"); // Displays if there is nothing in the Array List
		}
	}
	
	
	
	public void clearFullTime() //Clears all the text fields in the Full Time GUI
	{
		txtVacancyNoFull.setText("");
		txtVacancyNo.setText("");
		txtDesignation.setText("");
		txtJobType.setText("");
		txtSalary.setText("");
		txtWorkingHour.setText("");
		txtStaffName.setText("");
		txtJoiningDate.setText("");
		txtQualification.setText("");
		txtAppointedBy.setText("");
	}
	
	
	
	public void clearPartTime() //Clears all the text fields in the Part Time GUI
	{
		txtVacancyNoPart.setText("");
		txtVacancyNo.setText("");
		txtDesignation.setText("");
		txtJobType.setText("");
		txtWorkingHour.setText("");
		txtWagesPerHour.setText("");
		rBtnMorning.setSelected(true);
		txtStaffName.setText("");
		txtJoiningDate.setText("");
		txtQualification.setText("");
		txtAppointedBy.setText("");
	}
	
	
	
	private int getVacancyNoFull() //This Method Type Casts the text field txtVacancyNoFull and returns the type casted value 
	{
		int vacNoFull=Integer.parseInt(txtVacancyNoFull.getText());
		return vacNoFull;
	}
	
	private int getVacancyNoPart() //This Method Type Casts the text field txtVacancyNoPart and returns the type casted value 
	{
		int vacNoPart=Integer.parseInt(txtVacancyNoPart.getText());
		return vacNoPart;
	}
	
	
	private int getVacancyNo() //This Method Type Casts the text field txtVacancyNo and returns the type casted value 
	{
		int vacNo=Integer.parseInt(txtVacancyNo.getText());
		return vacNo;
	}
	
	private String getDesignation() // This method access the value of the text field and returns the value
	{
		String des=txtDesignation.getText();
		return des;
	}
	
	private int getWorkingHour() //This Method Type Casts the text field txtWorkingHour and returns the type casted value 
	{
		int workHour=Integer.parseInt (txtWorkingHour.getText());
		return workHour;
	}
	
	private String getJobType() // This method access the value of the text field and returns the value
	{
		String job=txtJobType.getText();
		return job;
	}
	
	private int getSalary() //This Method Type Casts the text field txtSalary and returns the type casted value 
	{
		int sal=Integer.parseInt(txtSalary.getText());
		return sal;
	}
	
	private int getWagesPerHour () //This Method Type Casts the text field txtWagesPerHour and returns the type casted value 
	{
		int wage=Integer.parseInt(txtWagesPerHour.getText());
		return wage;
	}
	
	private String getStaffName() // This method access the value of the text field and returns the value
	{
		String name=txtStaffName.getText();
		return name;
	}
	
	private String getJoiningDate() // This method access the value of the text field and returns the value
	{
		String joinDate=txtJoiningDate.getText();
		return joinDate;
	}
	
	private String getQualification() // This method access the value of the text field and returns the value
	{
		String qualification=txtQualification.getText();
		return qualification;
	}
	
	private String getAppointedBy() // This method access the value of the text field and returns the value
	{
		String appointed=txtAppointedBy.getText();
		return appointed;
	}
	
	private String getShift() // This method access the value of the text field and returns the value
	{
		if (rBtnMorning.isSelected()) 
		{
			shift="Morning";
		}
		
		else if (rBtnNignt.isSelected()) 
		{
			shift="Night";
		}
		return shift;
	}
	
	
	
	
}// class closed
