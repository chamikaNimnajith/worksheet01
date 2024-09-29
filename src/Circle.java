 public class Circle {

     double radius;

     public Circle(double radius) {
         this.radius = radius;
     }

     public double computeArea() {
         return Math.PI * Math.pow(radius, 2);
     }

     public double computeCircumference() {
         return 2 * Math.PI * radius;
     }

    public static void main(String[] args) {

        double ri = 3.0;
        double ro = 5.0;

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double innerArea = innerCircle.computeArea();
        double outerArea = outerCircle.computeArea();


        double shadedRegionArea = outerArea - innerArea;

        System.out.printf("The area of the shaded region is: %.2f%n", shadedRegionArea);
    }




}

