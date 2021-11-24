package Assignment1;

public class HrDepartment extends SuperDepartment {

	String departmentName() {
		return " Welcome to HR Department";
		
	}
	
	String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	String doActivity() {
		return "team Lunch";
	}
	
	void display() {
		System.out.println("\n" + departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		
	}
}
