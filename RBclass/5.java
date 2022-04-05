interface GrandParent{
    default void fun(){
        System.out.println("GP fun()");
    }
}
interface Parent1 extends GrandParent{

}
interface Parent2 extends GrandParent{

}
class Child implements Parent1,Parent2{
    public void fun(){
        System.out.println("Child fun()");
        Parent1.super.fun();
        Parent2.super.fun();
    }    
    public static void main(String args[]){
        Child ob = new Child();
        ob.fun();
    }
}