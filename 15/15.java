class Rectangle implements Shape{
    double cx, cy;
    double height, width;

    Rectangle(double x, double y, double h, double w){
        cx = x;
        cy = y;
        height = h;
        width = w;
    }

    public double area(){
        return height * width;
    }

    public void draw(){

    }

    public boolean rotate(){
        return true;
    }

    public void move(double x, double y){
        cx += x;
        cy += y;
    }

    public void print(){
        System.out.println("Reactangle has Area : " + this.area());
        System.out.println("Center :  X co-ordinate : " + cx + " & Y co-ordinate : " + cy);
        System.out.println("---------------------------------------------------------");
    }
}

class Circle implements Shape{
    double rad;
    double cx, cy;

    Circle(double x, double y, double r){
        cx = x;
        cy = y;
        rad = r;
    }

    public double area(){
        return 3.14 * rad * rad;
    }

    public void draw(){

    }
    public boolean rotate(){
        return true;
    }
    public void move(double x, double y){
        cx += x;
        cy += y;
    }

    void print(){
        System.out.println("Circle has Area : " + this.area());
        System.out.println("Circle has radius : " + rad);
        System.out.println("Center :  X co-ordinate : " + cx + " & Y co-ordinate : " + cy);
        System.out.println("---------------------------------------------------------");
    }
}

interface Shape{
    public double area();
    public void draw();
    public boolean rotate();
    public void move(double a, double b);
    public static void main(String args[]){
        Circle c1 = new Circle(3, 4, 5);
        Circle c2 = new Circle(1, 2, 7);

        c1.move(1, 2);
        c2.move(2, 1);

        c1.print();
        c2.print();

        Rectangle r1 = new Rectangle(0, 0, 5, 3);
        Rectangle r2 = new Rectangle(1, 1, 3, 4);
        Rectangle r3 = new Rectangle(2, 2, 5, 4);
        
        r1.move(1, 1);
        r2.move(2, 2);
        r3.move(3, 3);

        r1.print();
        r2.print();
        r3.print();
    }
}