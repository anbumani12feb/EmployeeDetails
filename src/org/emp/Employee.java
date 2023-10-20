package org.emp;

public class Employee {
	
public void empId() {
 System.out.println("GT003");
}

public void empName() {
	System.out.println("Rogan");
}

public void empDob() {
	System.out.println("14th Jan 1995");
}

public void empPhone() {
	System.out.println("8056141363");
}

public void empEmail() {
	System.out.println("rogan@gmail.com");
}

public void empAddress() {
	System.out.println("No 16 chrompet chennai-63");
}

public void bloodtype() {
	System.out.println("A-");
	
}
public static void main(String[]args) {
	Employee e= new Employee();
	e.empId();
	e.empName();
	e.empDob();
	e.empPhone();
	e.empEmail();
	e.empAddress();
	e.bloodtype();
}   


}
