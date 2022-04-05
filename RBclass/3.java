interface IN1{
    default void fun(){ // default keyword is only used in interface
        System.out.println("IN1 fun()");
    }
}
interface IN2{
    default void fun(){
        System.out.println("IN2 fun()");
    }
}
class Child implements IN1,IN2{
    public void fun(){  // if we don't make it PUBLIC then error: "attempting to assign weaker access privileges"
        System.out.println("Child fun()");
        IN1.super.fun();
        IN2.super.fun();
    }   // we must have to write this fun() to override the parent classes' fun()
    public static void main(String args[]){
        Child ob = new Child();
        ob.fun();
    }
}