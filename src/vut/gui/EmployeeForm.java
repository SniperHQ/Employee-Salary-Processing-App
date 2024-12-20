//////////////////////////////////////////////////////////////////////////////////////////////////
//222084308																						//
//MH Ntshangase																				   //
//February 2024																			      //
///////////////////////////////////////////////////////////////////////////////////////////////



package vut.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import vut.Employee;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JMenu;

public class EmployeeForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtCell;
	private JTextField txtAnnual;
	private JTextField txtWeeklyBonus;
	private JTextField txtHoursWorked;
	private JTextField txtHourlyWage;
	
	DecimalFormat moneyFormat= new DecimalFormat("'R'###,##0.00");
	private Employee objEmp=null;
	private ArrayList<Employee> employeeList=new ArrayList<Employee>();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
///////////////////////////////////////////////////////////////////////////////////////
//								Clear the Form                                      //
/////////////////////////////////////////////////////////////////////////////////////
public void clearForm() {
	
txtName.setText("");
txtName.requestFocus();
txtCell.setText("");
txtAnnual.setText("");
txtWeeklyBonus.setText("");
txtHoursWorked.setText("");
txtHourlyWage.setText("");



}

	/**
	 * Create the frame.
	 */
	public EmployeeForm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\eclipse-workspace\\Sniper_University\\src\\sniper_University\\Icons & Pics\\Elite 128x128.png"));
		setTitle("Employee Salary Processing Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 557);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JLabel lblNewLabel = new JLabel("Employee Name:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setBounds(50, 78, 105, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCellphoneNumber = new JLabel("Cellphone Number:");
		lblCellphoneNumber.setForeground(new Color(255, 255, 255));
		lblCellphoneNumber.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCellphoneNumber.setBounds(29, 103, 126, 14);
		contentPane.add(lblCellphoneNumber);
		
		JLabel lblAnnualSalary = new JLabel("Annual Salary:");
		lblAnnualSalary.setForeground(new Color(255, 255, 255));
		lblAnnualSalary.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnnualSalary.setBounds(62, 128, 93, 14);
		contentPane.add(lblAnnualSalary);
		
		JLabel lblWeeklyBonus = new JLabel("Weekly Bonus:");
		lblWeeklyBonus.setForeground(new Color(255, 255, 255));
		lblWeeklyBonus.setHorizontalAlignment(SwingConstants.TRAILING);
		lblWeeklyBonus.setBounds(62, 153, 93, 14);
		contentPane.add(lblWeeklyBonus);
		
		JLabel lblHoursworked = new JLabel("Hours Worked:");
		lblHoursworked.setForeground(new Color(255, 255, 255));
		lblHoursworked.setHorizontalAlignment(SwingConstants.TRAILING);
		lblHoursworked.setBounds(50, 178, 105, 14);
		contentPane.add(lblHoursworked);
		
		JLabel lblHourlyWage = new JLabel("Hourly Wage:");
		lblHourlyWage.setForeground(new Color(255, 255, 255));
		lblHourlyWage.setHorizontalAlignment(SwingConstants.TRAILING);
		lblHourlyWage.setBounds(62, 203, 93, 14);
		contentPane.add(lblHourlyWage);
		
		txtName = new JTextField();
		txtName.setBounds(165, 75, 242, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtCell = new JTextField();
		txtCell.setColumns(10);
		txtCell.setBounds(165, 100, 242, 20);
		contentPane.add(txtCell);
		
		txtAnnual = new JTextField();
		txtAnnual.setColumns(10);
		txtAnnual.setBounds(165, 125, 242, 20);
		contentPane.add(txtAnnual);
		
		txtWeeklyBonus = new JTextField();
		txtWeeklyBonus.setColumns(10);
		txtWeeklyBonus.setBounds(165, 150, 242, 20);
		contentPane.add(txtWeeklyBonus);
		
		txtHoursWorked = new JTextField();
		txtHoursWorked.setColumns(10);
		txtHoursWorked.setBounds(165, 175, 242, 20);
		contentPane.add(txtHoursWorked);
		
		txtHourlyWage = new JTextField();
		txtHourlyWage.setColumns(10);
		txtHourlyWage.setBounds(165, 200, 242, 20);
		contentPane.add(txtHourlyWage);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 228, 521, 223);
		contentPane.add(scrollPane);
		
		JTextArea textAreaDispayEmployee = new JTextArea();
		textAreaDispayEmployee.setBackground(new Color(135, 206, 235));
		textAreaDispayEmployee.setEditable(false);
		scrollPane.setViewportView(textAreaDispayEmployee);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Employee Type", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBounds(438, 78, 133, 106);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JRadioButton radSalaried = new JRadioButton("Salaried");
		radSalaried.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(radSalaried.isSelected()) {
					clearForm();
					txtWeeklyBonus.hide();
					txtHourlyWage.hide();
					txtName.requestFocus();
					txtAnnual.setVisible(true);
				}
			}

		});
		radSalaried.setForeground(new Color(255, 255, 255));
		radSalaried.setBackground(new Color(100, 149, 237));
		buttonGroup.add(radSalaried);
		radSalaried.setBounds(6, 18, 111, 23);
		panel.add(radSalaried);
	
		JRadioButton radManager = new JRadioButton("Manager");
		radManager.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(radManager.isSelected()) {
					clearForm();
					txtWeeklyBonus.setVisible(true);
					txtHourlyWage.hide();
					txtName.requestFocus();
					txtAnnual.setVisible(true);
				}
			}
		});
		radManager.setForeground(new Color(255, 255, 255));
		radManager.setBackground(new Color(100, 149, 237));
		buttonGroup.add(radManager);
		radManager.setBounds(6, 44, 111, 23);
		panel.add(radManager);
		
		JRadioButton radHourly = new JRadioButton("Hourly");
		radHourly.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(radHourly.isSelected()) {
					clearForm();
					txtName.requestFocus();
					txtAnnual.hide();
					txtWeeklyBonus.hide();
					txtHourlyWage.setVisible(true);
				}
			}
		});
		
		radHourly.setForeground(new Color(255, 255, 255));
		radHourly.setBackground(new Color(100, 149, 237));
		buttonGroup.add(radHourly);
		radHourly.setBounds(6, 70, 111, 23);
		panel.add(radHourly);
		
		JButton btnViewSalaried = new JButton("View Salaried Employee");
		btnViewSalaried.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    textAreaDispayEmployee.setText(""); // Clear the text area first
			    
			    // Iterate through the employee list
			    for (int i = 0; i < employeeList.size(); i++) {
			        // Get the current employee object
			        Employee objEmp = employeeList.get(i);
			        
			        // Check if the employee type is "Salaried" or "Manager"
			        if (objEmp.getEmpType().equals("Salaried") || objEmp.getEmpType().equals("Manager")) {
			            // Append the employee details to the text area
			            textAreaDispayEmployee.append("Employee Name: " + objEmp.getEmpName() + "\n");
			            textAreaDispayEmployee.append("Employee Type: " + objEmp.getEmpType().toUpperCase() + "\n");
			            textAreaDispayEmployee.append("Cellphone: " + objEmp.getCellNumber() + "\n");
			            textAreaDispayEmployee.append("Annual Salary: " + moneyFormat.format(objEmp.getAnnualsalary()) + "\n");
			            textAreaDispayEmployee.append("Weekly Bonus: " + moneyFormat.format(objEmp.getWeeklyBonus()) + "\n");
			            textAreaDispayEmployee.append("Hourly Wage: " + moneyFormat.format(objEmp.getHourlyWage()) + "\n");
			            textAreaDispayEmployee.append("Weekly Pay: " + moneyFormat.format(objEmp.calculatePay(40)) + "\n");  // Assuming 40 hours worked per week for salaried employees
			            textAreaDispayEmployee.append("-----------------------------------------------\n");
			        }
			    }
			    
			    // If no salaried or manager employees are found, display a message
			    if (textAreaDispayEmployee.getText().isEmpty()) {
			        textAreaDispayEmployee.setText("No Salaried or Manager employees found.");
			    }
			}

		});
		btnViewSalaried.setBounds(50, 471, 179, 23);
		contentPane.add(btnViewSalaried);
		
		JButton btnViewHourly = new JButton("View Hourly Employee");
		btnViewHourly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				    // Clear the text area before displaying new data
				    textAreaDispayEmployee.setText("");
				    
				    // Iterate through the employee list
				    for (int i = 0; i < employeeList.size(); i++) {
				        Employee emp = employeeList.get(i);
				        
				        // Check if the employee type is "Hourly"
				        if (emp.getEmpType().equals("Hourly")) {
				            // Display the details of the hourly employee
				            textAreaDispayEmployee.append("Employee Name: " + emp.getEmpName() + "\n");
				            textAreaDispayEmployee.append("Employee Type: " + emp.getEmpType().toUpperCase() + "\n");
				            textAreaDispayEmployee.append("Cellphone: " + emp.getCellNumber() + "\n");
				            textAreaDispayEmployee.append("Annual Salary: " + moneyFormat.format(emp.getAnnualsalary()) + "\n");
				            textAreaDispayEmployee.append("Weekly Bonus: " + moneyFormat.format(emp.getWeeklyBonus()) + "\n");
				            textAreaDispayEmployee.append("Hourly Wage: " + moneyFormat.format(emp.getHourlyWage()) + "\n");
				            textAreaDispayEmployee.append("Weekly Pay: " + moneyFormat.format(emp.calculatePay(40)) + "\n");  // Assuming 40 hours worked per week for hourly employees
				            textAreaDispayEmployee.append("-----------------------------------------------\n");
				        }
				    }
				    
				    // If no hourly employees were found, display a message
				    if (textAreaDispayEmployee.getText().isEmpty()) {
				        textAreaDispayEmployee.setText("No Hourly employees found.");
				    }
				}

			}
		);
		btnViewHourly.setBounds(392, 471, 179, 23);
		contentPane.add(btnViewHourly);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				String name = null,cellNumber = null,empType = null;
				double annual = 0,weeklyBonus = 0,hourlyWage = 0;
				int hoursWorked = 0;
			
				try 
				{
					
					if(radSalaried.isSelected())
					{
						
						name=txtName.getText();
						cellNumber=txtCell.getText();
						empType="Salaried";
						annual=Double.parseDouble(txtAnnual.getText());	
						hoursWorked=Integer.parseInt(txtHoursWorked.getText());
	
						objEmp = new Employee(name,cellNumber,empType,annual,weeklyBonus,hourlyWage);
							employeeList.add(objEmp);
					
						double weeklyPay=objEmp.calculatePay(hoursWorked); // Calculate the employee's weekly pay
						
						clearForm();

						textAreaDispayEmployee.setText("Employee Name: "+objEmp.getEmpName()+"\nEmployee Type: "+objEmp.getEmpType().toUpperCase()+"\nCellphone: "
								+objEmp.getCellNumber()+"\nAnnual Salary: "+moneyFormat.format(objEmp.getAnnualsalary())
								+"\nWeekly Bonus: "+moneyFormat.format(objEmp.getWeeklyBonus())+"\nHourly Wage: "+moneyFormat.format(objEmp.getHourlyWage())+"\nWeekly Pay: "+moneyFormat.format(weeklyPay));
						JOptionPane.showMessageDialog(null, "Employee: "+objEmp.getEmpName()+" is Added Succesfully as "+objEmp.getEmpType().toUpperCase()+" employee");

					}else if(radHourly.isSelected()) 
					{
						
						name=txtName.getText();
						cellNumber=txtCell.getText();
						empType="Hourly";
						hourlyWage=Double.parseDouble(txtHourlyWage.getText());	
						hoursWorked=Integer.parseInt(txtHoursWorked.getText());
					
						objEmp = new Employee(name,cellNumber,empType,annual,weeklyBonus,hourlyWage);
						
						employeeList.add(objEmp);
												
						double weeklyPay=objEmp.calculatePay(hoursWorked);
						
						clearForm();

						textAreaDispayEmployee.setText("Employee Name: "+objEmp.getEmpName()+"\nEmployee Type: "+objEmp.getEmpType().toUpperCase()+"\nCellphone: "
								+objEmp.getCellNumber()+"\nAnnual Salary: "+moneyFormat.format(objEmp.getAnnualsalary())
								+"\nWeekly Bonus: "+moneyFormat.format(objEmp.getWeeklyBonus())+"\nHourly Wage: "+moneyFormat.format(objEmp.getHourlyWage())+"\nWeekly Pay: "+moneyFormat.format(weeklyPay));
						JOptionPane.showMessageDialog(null, "Employee: "+objEmp.getEmpName()+" is Added Succesfully as "+objEmp.getEmpType().toUpperCase()+" employee");
					
					}else if(radManager.isSelected()){
						
						name=txtName.getText();
						cellNumber=txtCell.getText();
						empType="Manager";
						weeklyBonus=Double.parseDouble(txtWeeklyBonus.getText());	
						hoursWorked=Integer.parseInt(txtHoursWorked.getText());
						annual=Double.parseDouble(txtAnnual.getText());	

						objEmp = new Employee(name,cellNumber,empType,annual,weeklyBonus,hourlyWage);
						
						for(int i=0;i<employeeList.size();i++) {
							
							employeeList.add(objEmp);
							
						}
											
						double weeklyPay=objEmp.calculatePay(hoursWorked);
						
						clearForm();

						textAreaDispayEmployee.setText("Employee Name: "+objEmp.getEmpName()+"\nEmployee Type: "+objEmp.getEmpType().toUpperCase()+"\nCellphone: "
								+objEmp.getCellNumber()+"\nAnnual Salary: "+moneyFormat.format(objEmp.getAnnualsalary())
								+"\nWeekly Bonus: "+moneyFormat.format(objEmp.getWeeklyBonus())+"\nHourly Wage: "+moneyFormat.format(objEmp.getHourlyWage())+"\nWeekly Pay: "+moneyFormat.format(weeklyPay));
						JOptionPane.showMessageDialog(null, "Employee: "+objEmp.getEmpName()+" is Added Succesfully as "+objEmp.getEmpType().toUpperCase()+" employee");
						
					}else 
					{
						JOptionPane.showMessageDialog(null, "Select an Employee Type!");
						clearForm();

					}
					
				}catch(NumberFormatException ex) 
				{
						
						JOptionPane.showMessageDialog(null, "ERROR invalid numeric value: "+ex.getMessage());
						txtAnnual.requestFocus();
						txtHourlyWage.requestFocus();
						txtHoursWorked.requestFocus();
				}catch(IllegalArgumentException ex) 
				{
					
					JOptionPane.showMessageDialog(null, "ERROR employee data invalid: "+ex.getMessage());
					clearForm();
					txtName.requestFocus();

				}
				
			}

		});
		btnAddEmployee.setForeground(new Color(255, 255, 255));
		btnAddEmployee.setBackground(new Color(60, 179, 113));
		btnAddEmployee.setBounds(438, 199, 133, 23);
		contentPane.add(btnAddEmployee);
		
		JLabel lblEmployeeSalaryProcessing = new JLabel("Employee Salary Processing System");
		lblEmployeeSalaryProcessing.setForeground(new Color(255, 255, 255));
		lblEmployeeSalaryProcessing.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmployeeSalaryProcessing.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmployeeSalaryProcessing.setBounds(147, 40, 297, 24);
		contentPane.add(lblEmployeeSalaryProcessing);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(255, 255, 255));
		menuBar.setBackground(new Color(0, 0, 128));
		menuBar.setBounds(0, 0, 614, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File ");
		mnNewMenu.setForeground(new Color(255, 255, 255));
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Do you want to EXIT?","Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				
			}
		});
		mnNewMenu.add(btnNewButton);
		
		JMenu mnNewMenu_1 = new JMenu("Project Information");
		mnNewMenu_1.setForeground(new Color(255, 255, 255));
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_1);
		
		JButton btnNewButton_1 = new JButton("About Me");
		btnNewButton_1.setBackground(new Color(46, 139, 87));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About_Me me=new About_Me();
				me.setVisible(true);
				
			}
		});
		mnNewMenu_1.add(btnNewButton_1);
	}
}
