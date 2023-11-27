public class HdSeStudent {
	private static int numStudent = 0;
	private String name;
	public HdSeStudent() {
		this.name = "Ghost";
		numStudent++;
	}
	public HdSeStudent(String name) {
		this.name = name;
		numStudent++;
	}
	public String getName() {
		return name;
	}
	public int getNumStudent() {
		return numStudent;
	}
}
