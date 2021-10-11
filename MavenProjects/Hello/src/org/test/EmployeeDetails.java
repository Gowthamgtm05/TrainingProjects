package org.test;

public class EmployeeDetails {
	
	//Non Parameterized Constructor
	
	int Employee_code;
	String Employee_Name;
	long Employee_Mob_Num;

	
	EmployeeDetails(int code,String Name,long Mob_Num){
		Employee_code = code;
		Employee_Name = Name;
		Employee_Mob_Num = Mob_Num;
	}

	public void EmployeeDetail() {
		
		System.out.println("Employee Details are" );
		System.out.println("Employee Code is "+Employee_code +
				"\nEmployee Name is " +Employee_Name + 
			"\nEmployee Mobile Number is "+Employee_Mob_Num);
	
	}
	public static void main(String[] args) {
		EmployeeDetails ep1 = new EmployeeDetails(123, "Arun", 98736266462l);
		ep1.EmployeeDetail();
		System.out.println("_______________________________");
		EmployeeDetails ep2 = new EmployeeDetails(1432, "Ram", 896376436845l);
		ep2.EmployeeDetail();
	}

}
