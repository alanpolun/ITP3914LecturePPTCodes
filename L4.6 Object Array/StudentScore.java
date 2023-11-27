public class StudentScore {
	private String stid;
	private String name;
	private int [ ] homework;
	public StudentScore(String stid, String name) {
		this.stid = stid;
		this.name = name;
		homework = new int[3];  
	}
	public void setHomework(int index, int score) {
		if (index >= 0 && index < homework.length) {
			if (score>=0 && score<=100) 
				homework[index]=score;
		}
	}
	public double homeworkAvg() {
		int sum = 0;
		for (int i=0; i<homework.length; i++) 
			sum += homework[i];
		return (double) sum / homework.length; 
	}
}
