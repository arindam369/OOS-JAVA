class Base1{
    void fun(){
        System.out.println("Base fun1");
    }   
}
class Base2{
    void fun(){
        System.out.println("Base2 ");
    }
}
class Child extends Base1,Base2{     // Java doesn't support multiple inheritance
    public static void main(String args[]){
        Child ob = new Child();
        ob.fun();   // it will result an ambiguous situation regarding which version of the fun() is to be called
    }
}