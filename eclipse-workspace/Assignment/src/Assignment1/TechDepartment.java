package Assignment1;

public class TechDepartment extends SuperDepartment  {

	String departmentName() {
		return " Welcome to Tech Department" ;
		
	}
	
	String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	String getTechStackInformation() {
		return " Core Java";
	}
	
	void display() {
		System.out.println("\n" +departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
		
	}
}
