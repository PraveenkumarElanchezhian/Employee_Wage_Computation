package OOPS_Practice_problem;

public class Employee_wage {
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation");
	Employee_wage rv = new Employee_wage();
	rv.employee_Attendance_check();
  }
     void employee_Attendance_check() {
	int attendance_check = (int)(Math.random()*10)%2;
	if (attendance_check == 1) {
		System.out.println("Employee is Present");
	}
	else {
		System.out.println("Employee is Absent");	
	}
  }
}