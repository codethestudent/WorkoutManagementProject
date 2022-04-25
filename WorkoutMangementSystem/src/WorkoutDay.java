public class WorkoutDay {
	
	String Day;
	String type;
	int set;
	int numbers;
	int date;
	
	public WorkoutDay() {
		
	}
	
	public WorkoutDay(String day, String type) {
		this.Day = day;
		this.type = type;
	}
	
	public WorkoutDay(String day, String type, int set, int numbers, int date) {
		this.Day = day;
		this.type = type;
		this.set = set;
		this.date = date;
	}
	
	public void printInfo() {
		System.out.println("day : " + Day + " type : " + type + " set : " + set + " numbers : " + numbers + " date : " + date);
	}

}
