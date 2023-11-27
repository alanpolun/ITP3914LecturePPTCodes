import java.text.DecimalFormat;
class MyTime {
	protected int hour;
	private int minute;
	private int second;
	public MyTime() {
		setTime (0, 0, 0);
	}
	public MyTime(int h, int m, int s) {
		setTime(h, m, s);
	}
	public void setTime(int h, int m, int s) {
		if (h>=0 && h<=23) hour = h;
		if (m>=0 && m<=59) minute = m;
		if (s>=0 && s<=59)	second = s;
	}
	public String toString() {
		DecimalFormat twoDigits = new DecimalFormat("00");
		return ( (hour==12 || hour==0) ? 12 : hour % 12 ) + ":" + twoDigits.format(minute) +
			":" + twoDigits.format(second) + ( hour < 12 ? " AM" : " PM" );
	}
}


public class Slide34 {
    public static void main(String [] args) {
		MyTime mt = new MyTime(15, 77, 37);
		mt.hour = 27;
		System.out.println("The time is " + mt);
	}
    
}
