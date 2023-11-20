public class Cylinder extends Circle {
   protected double height;  // height of Cylinder
   public Cylinder() {
         System.out.println("Cylinder's constructor");
         setHeight( 0 );
   }
   public Cylinder( double h, double r, int a, int b ) {
         super( r, a, b );
         System.out.println("Cylinder's constructor");
         setHeight( h );
   }
   public void setHeight( double h ) { height = ( h >= 0 ? h : 0 ); }
   public double getHeight() { return height; }
   public double area() {
         return 2 * super.area() + 2 * Math.PI * radius * height;
   }
   public double volume() { 
         return super.area() * height; 
   }
   public String toString()
   {  
         return super.toString() + "; Height = " + height;
   }
}
