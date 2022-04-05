// Overloading with Inheritance :

class Base{
    public int add(int i){
        System.out.println("Base:add:int");
        return (i+5);
    }
}
class Child extends Base{
    public double add(double d){
        System.out.println("Child:add:double");
        return (d+5.5);
    }
}
class Main{
    public static void main(String args[]){
        Child ob = new Child();
        System.out.println(ob.add(5));
        System.out.println(ob.add(5.6));
    }
}

// Note : During compile time, Java compiler determines which version of the overloaded method is to be invoked based on the type of argument used to call the method.