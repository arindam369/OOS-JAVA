interface IN1{
    void f1();
}
interface IN2{
    void f2();
}
interface IN3 extends IN1,IN2{
    void f3();
}
class Child implements IN3{
    // Now we have to mandatorily define f1(),f2(),f3() here
    public void f1(){
        System.out.println("f1()");
    }
    public void f2(){
        System.out.println("f2()");
    }
    public void f3(){
        System.out.println("f3()");
    }
    public static void main(String args[]){
        Child ob = new Child();
        ob.f1();
        ob.f2();
        ob.f3();
    }
}