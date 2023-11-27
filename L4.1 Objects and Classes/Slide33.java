class Dob {
	private int day;
	private int month;
	private int year;

	public Dob(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return day + "/" + month + "/" + year;
	}

}

public class Slide33 {
    public static void main(String [ ] args) {
		Dob peter = new Dob(12, 1, 1985);
		System.out.println("Peter's birthday: " +   peter   );
	}

}
