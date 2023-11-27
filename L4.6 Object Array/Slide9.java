public class Slide9 {
	public static void main(String[] args) {
		Student [ ] hdse = new Student[4];
		hdse[0] = new Student("Andy", 40);
		hdse[1] = new Student("Brian", 60);
		hdse[2] = new Student("Candy", 75);
		hdse[3] = new Student("David", 82);
		int sum=0;
		for (int i=0; i<hdse.length; i++) {
			System.out.println(hdse[i]);
			sum += hdse[i].getScore();
		}
		System.out.println("Average = " + 
						(double) sum / hdse.length);
	}
}