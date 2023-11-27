public class Slide8 {
	public static void main(String[] args) {
		StudentScore peter = new StudentScore("s001", "Peter Mak");
		peter.setHomework(0, 59);
		peter.setHomework(1, 83);
		peter.setHomework(2, 64);
		System.out.println("Average = " + peter.homeworkAvg());
	}
}