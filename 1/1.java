class Room{
    int height,width,breadth;
    
    Room(int h,int w,int b){
        height=h;
        width=w;
        breadth=b;
    }
    
    int volume(){
        return height*width*breadth;
    }
}
class RoomDemo{
    public static void main(String args[]){
        Room r = new Room(10,20,30);
        System.out.println("Volume : "+ r.volume());
    }   
}
