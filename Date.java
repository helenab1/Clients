package Main;
import stdlib.*;

public class Date {
	
	private String month;
	private int day;
	private int year;
	
	public Date(String month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String toString(String month, int day, int year) {	
		//String tst = (month + " " + String.valueOf(day) + " " + String.valueOf(month));
		//StdOut.println(tst);
		return (this.month + " " + String.valueOf(this.day) + " " + String.valueOf(this.month));
	}
	

public static void main(String[] args) {
	
	Date newDate = new Date("Jan", 21, 1969);
	newDate.toString();

	StdOut.println(newDate.toString());
	//StdOut.println(d);

}

}
