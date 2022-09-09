	package org.emp;
	
	public class Employee {
	private void empId() {
	System.out.println("employee id 1234");
	}
		private void empName() {
	System.out.println("employee name jack");
		}
		private void empDob() {
	System.out.println("employee dob 16/2/1999");
		}
		private void empPhone() {
	System.out.println("employee phone 123456");
		}
		private void empEmail() {
	System.out.println(
			"emp email jack@1234");
		}
		private void empAddress() {
			System.out.println("employee address chennai");
		}
		public static void main(String[] args) {
			Employee a = new Employee ();
			a.empId();
			a.empName();
			a.empDob();
			a.empEmail();
			a.empPhone();
			a.empAddress();
		
		}
		
	}
