interface Fruit {
   void hasAPeel();
}
interface Vegetable {
   void hasARoot();
}

class Tomato implements Fruit, Vegetable{
   public void hasAPeel(){
      System.out.println("Yeah! I have a Peel");
   }
   public void hasARoot(){
      System.out.println("No, I have not any root");
   }
   public static void main(String args[]){
      Tomato t = new Tomato();
      t.hasAPeel();
      t.hasARoot();
   }
}

