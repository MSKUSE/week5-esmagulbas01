public class Rectangle {
   private point topLeft;
   private  int sideA ,sideB;
   public Rectangle(point topLeft,int sideA,int sideB)

    public Rectangle(int sideA, point topLeft, int sideB) {
        this.sideA = sideA;
        this.topLeft = topLeft;
        this.sideB = sideB;
    }

    public Rectangle(point topLeft, int sideA, int sideB) {
        this.topLeft = topLeft;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setTopLeft(point topLeft) {
        this.topLeft = topLeft;
    }

    public void setSideA(int sideA) {
       if (sideA<0){
           this.sideA=0;
           System.out.println("side ");
       }else{

       }
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
       if (sideB<0){
           this.sideB=0;
           System.out.println("side b cant be ");
       }else{
           this.sideB = sideB;
       }

    }
    public int perimeter(){
       return (2*sideA) + (2*sideB );
    }
    public int area(){
       return sideA*sideB;
    }
}
