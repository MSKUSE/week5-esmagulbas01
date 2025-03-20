public class Circle {

   private point center;
   private int radius;
   public

    public Circle(point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius){
        if (radius < 0) {
            this.radius=0;
            System.out.println("cant be negative");

        }else{
            this.radius=radius;
        }
    }

}
