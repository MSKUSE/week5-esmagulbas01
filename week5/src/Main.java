public class Main {
    public static void main(String[] args) {
        point p1 = new point();
        String s1 = new String("ali");
        System.out.println(p1.xcoord);
        System.out.println(p1.ycoord);

        point p2 = new point(3,4);
        System.out.println(p2.xcoord);
        System.out.println(p2.ycoord);
        point p3 = new point(5);
        System.out.println(p3.xcoord);
        System.out.println(p3.ycoord);

        point tLeft = point(3,4);
        Rectangle r1 = new Rectangle(new point(3,4)tLeft,3,4);
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft().xcoord);
        System.out.println(r1.getTopLeft().ycoord);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Circle cl = new Circle(
                new point(3,4),
                5
        );
        System.out.println(cl.getRadius());
        cl.setRadius(-21);



    }
}