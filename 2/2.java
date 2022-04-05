class Student{
    String name;
    int marks[] = new int[3];
    Student(String n,int a,int b,int c){
        name = n;
        marks[0] = a;
        marks[1] = b;
        marks[2] = c;
    }
    double totalAvg(){
        double sum=0;
        for(int i=0;i<3;i++){
            sum+=marks[i];
        }
        return sum/3.0;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Total Marks : ");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+"th Mark : "+marks[i]);
        }
    }
    public static void main(String args[]){
        Student s = new Student("Naruto Uzumaki", 98, 95, 92);
        System.out.println("Total average : "+s.totalAvg());
        s.display();
    }
}
