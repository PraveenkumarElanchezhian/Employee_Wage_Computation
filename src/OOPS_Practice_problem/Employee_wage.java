package OOPS_Practice_problem;

public class Employee_wage {
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation");
	Employee_wage rv = new Employee_wage();
	rv.employee_Attendance_check();
  }
     void employee_Attendance_check() {
	int attendance_check = (int)(Math.random()*10)%3;
	switch (attendance_check) {
	case 1:
		System.out.println("Employee is Present - Full time");
		employee_daily_wage();
		break;
	case 2:
		System.out.println("Employee is Present - Part time");
	    employee_part_time_wage();
		break;
	default:
		System.out.println("Employee is Absent");
		break;
	}
	
  }
     static void employee_daily_wage() {
    	 int total_working_days_per_month = 20;
    	 int wage_per_hrs = 20;
    	 int working_hrs = 8;
    	 System.out.println("Employee daily wages is "+wage_per_hrs*working_hrs*total_working_days_per_month);
     }
     static void employee_part_time_wage() {
    	 int total_working_days_per_month = 20;
    	 int wage_per_hrs = 20;
    	 int working_hrs = 4;
    	 System.out.println("Employee part time wages is "+wage_per_hrs*working_hrs*total_working_days_per_month);
     }
   

}