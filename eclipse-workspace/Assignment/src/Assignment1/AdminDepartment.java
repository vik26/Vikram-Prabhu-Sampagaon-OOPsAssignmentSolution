package Assignment1;

public class AdminDepartment extends SuperDepartment {

	String departmentName() {
		return " Welcome to Admin Department";
		
	}
	
	String getTodaysWork() {
		return "Complete your documents Submission";
				
	}
	
	String getWorkDeadline() {
		return "Complete by EOD" ;
		
	}
	
	void display() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		
	}
}
