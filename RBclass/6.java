interface GP{
    void fun(); // we can't make it default...else we have to complete the full function here
}
interface P1 extends GP{
    void show();
}
class Child implements P1{
    public void fun(){  // we have to mandatorily define the full function
        System.out.println("Fun()");
    }
    public void show(){
        System.out.println("Show()");
    }
    public static void main(String args[]){
        Child ob = new Child();
        ob.show();
        ob.fun();
    }
}