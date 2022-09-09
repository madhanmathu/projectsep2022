package org.emp;

public class Employee2 {
	
	private void empid() {
	System.out.println("empid -1234");

	}
	private void empname() {
System.out.println("emp name madhan");
	}
	private void empdob() {
		System.out.println("emp dob - 16/02/1999");

	}
	private void empphone() {
System.out.println("emp phone - 7904105025");
	}
	private void empemail() {
System.out.println("employee email- maddy@vr46");
	}
	private void empadress() {
System.out.println("emp adress - trichy");
	}
	public static void main(String[] args) {
		Employee2 a = new Employee2();
		a.empid();
		a.empname();
		a.empdob();
		a.empphone();
        a.empemail();
        a.empadress();
        
		
	}


}
