// Nested Class Inheritance :

class Outer{
    String s="Hello";
    void show(){
        System.out.println("Outer show():");
    }
    class Inner extends Outer{
        void show(){
            System.out.println("Inner Show()");
        }
        public static void main(String args[]){
            Outer o = new Outer();
            Inner i = o.new Inner();
            i.show();
            o=i;
            i.show();
            o.show();   // No runtime polymorphism is achieved
        }
        // To create an instance of the inner class, first we have to create an instance of the outer class.
    }
}