class GrandParent{
    void fun(){
        System.out.println("GP fun()");
    }
}
// So fun() has been inherited two times
class Parent1 extends Grandparent{

}
class Parent2 extends Grandparent{

}
class Child extends P1,P2{  // Java does not support hybrid inheritance so here will be an error
    public static void main(String args[]){
        Child ob = new Child();
        ob.fun();   
    }
}