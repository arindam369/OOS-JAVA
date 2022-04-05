class Book{
   String title;
   String authors[];
   int noOfPages;
   float price;
   String publisher;
   
   Book(String t, String auth[],int pages,float p,String pub){
      authors = new String[auth.length];
      title=t;
      for(int i=0;i<auth.length;i++){
         authors[i] = auth[i];
      }
      noOfPages=pages;
      price=p;
      publisher=pub;
   }
}

class Library{
   int capacity;
   int nextIndex;
   Book books[];
  
   Library(int capac){
      capacity=capac;
      nextIndex=0;
      books = new Book[capacity];
   }
   
   void add(Book b){
      if(nextIndex<capacity){
         books[nextIndex] = b;
         nextIndex++;
      }
   }
   void remove(String t){
        int i=0;
        while(i<nextIndex){
            if(books[i].title == t){
                break;
            }
            i++;
        }
        while(i<nextIndex){
            books[i]=books[i+1];
            i++;
        }
        books[i].title="";
        books[i].price=0;
        books[i].noOfPages=0;
        books[i].publisher="";
   }

   float getTotalPrice(){
      float sum=0;
      for(int i=0;i<nextIndex;i++){
          sum+=books[i].price;
      }
      return sum;
   }   

   public static void main(String args[]){
      Library l = new Library(10);
      
      String auth1[]={"Arindam Halder,Soumabha Ghosh"};
      String auth2[]={"Rajdeep Mallick","Souvik Naskar"};
      String auth3[]={"Dibyabrata Panja","Manas Pratim Biswas"};
      String auth4[]={"Isika Samanta","Nidhi Shah"};
      String auth5[]={"Sanghita Gharami","Ananya Pal"};

      Book b1 = new Book("book1",auth1,340,499,"Arindam Halder");
      Book b2 = new Book("book2",auth2,330,599,"Soumabha Ghosh");
      Book b3 = new Book("book3",auth3,320,699,"Nobita Nobi");
      Book b4 = new Book("book4",auth4,310,799,"Naruto Uzumaki");
      Book b5 = new Book("book5",auth5,300,899,"Faisal Ahmed");

      l.add(b1);
      l.add(b2);
      l.add(b3);
      l.add(b4);
      l.add(b5);
      
      System.out.println("Total Price of all books : "+l.getTotalPrice());

   }


}
