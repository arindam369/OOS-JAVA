class Box{
    int height,width,breadth;
    Box(int h,int w,int b){
        height=h;
        width=w;
        breadth=b;
    }
    int getArea(){
        return width*breadth;
    }
    int getVolume(){
        return height*width*breadth;
    }
    public static void main(String args[]){
        Box b1 = new Box(3,4,5);    Box b2 = new Box(6,7,8);
        System.out.print("B1's Area : "+b1.getArea());
        System.out.println("\t\t B1's Volume : "+b1.getVolume());

        System.out.print("B2's Area : "+b2.getArea());
        System.out.println("\t\t B2's Volume : "+b2.getVolume());
    }
}
