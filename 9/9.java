class Employee{
   String name;
   int id;
   String address;
   float salary;
   Employee(){
      name="";
      id=0;
      address="";
      salary=0;
   }
   Employee(String name,int id,String address,float salary){
      this.name = name;
      this.id = id;
      this.address = address;
      this.salary = salary;
   }
}

class Dept{
   String name;
   String location;
   int capacity;
   int nextIndex;
   Employee employees[];

   Dept(int capacity,String name,String location){
      this.nextIndex = 0;
      this.capacity = capacity;
      this.name = name;
      this.location = location;
      employees = new Employee[capacity];
   }

   void add(Employee emp){
      employees[nextIndex] = emp;
      nextIndex++;
   }
   void remove(int id){
      int i=0;
      while(i<nextIndex){
         if(employees[i].id == id){
            break;
         }
         i++;
      }
      while(i<nextIndex){
         employees[i]=employees[i+1];
         i++;
      }
      employees[i] = new Employee();
      nextIndex--;
   }
   float countExpenditure(){
      float totalExpenditure=0;
      for(int i=0;i<nextIndex;i++){
          totalExpenditure += employees[i].salary*12;
      }
      return totalExpenditure;
   }

   public static void main(String args[]){
      Dept d = new Dept(10,"Information Technology","Salt Lake Sector 3");
      Employee emp1 = new Employee("Arindam Halder",1001,"Kalyani, Nadia",5000);
      Employee emp2 = new Employee("Rajdeep Mallick",1002,"Birpara, Alipurduar",6000);
      Employee emp3 = new Employee("Soumabha Ghosh",1003,"Barasat",7000);
      Employee emp4 = new Employee("Ankush Sil Sarma",1004,"Bandel",8000);
      Employee emp5 = new Employee("Faisal Ahmed",1005,"Murshidabad",9000);

      d.add(emp1);
      d.add(emp2);
      d.add(emp3);
      d.add(emp4);
      d.add(emp5);

      System.out.println("Total Yearly Expenditure from dept '"+d.name+"' : "+d.countExpenditure());
   }
}
