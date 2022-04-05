interface IN1{
    default void fun(){
        System.out.println("IN1 fun()");
    }
}
interface IN2 extends IN1{
    default void fun(){     // if we make it public it will take this method as abstract an give an error
        System.out.println("IN2 fun()");
    }
}
class Child implements IN2{
    public void fun(){
        IN2.super.fun(); // here IN2 will invoke IN1's fun version
        // IN1.super.fun();    // It will create error bcz IN1 is not implemented
        System.out.println("Child fun()");
    }
    public static void main(String args[]){
        Child ob = new Child();
        ob.fun();
    }
}