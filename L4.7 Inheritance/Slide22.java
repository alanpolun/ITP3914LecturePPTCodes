public class Slide22 {
	public static void main(String[] args) {
      Cylinder c0 = new Cylinder();
      System.out.println();
      Cylinder c = new Cylinder(1.5, 9.9, 2, 2);

      System.out.println();
      System.out.println("Location: "+c.getX()+", "+c.getY());
      System.out.println("Radius: " + c.getRadius());
      System.out.println("Height: " + c.getHeight());
      System.out.println("Volume: " + c.volume());

      c.setRadius(3.3);
      System.out.println("\nNew radius: " + c.getRadius());
      System.out.println("New Volume: " + c.volume());
      System.out.println("" + c);
	}
}