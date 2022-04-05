class Book{
    String author;
    String title;
    String publisher;
    int cost;
    int stock;
    Book(){

    }
    Book(String author, String publisher, String title, int cost, int stock)
    {
        this.author = author;
        this.publisher = publisher;
        this.title = title;
        this.cost = cost;
        this.stock = stock;
    }
    void details(){
        System.out.println("======= Book details =======");
        System.out.println("Title of the book : "+title);
        System.out.println("Author of the book : "+ author);
        System.out.println("Publisher name : "+publisher);
        System.out.println("Price of the book : "+cost);
        System.out.println("Current Stock of the book : "+ stock);
    }
}
class BookShop{
    Book ob[] = new Book[2];
    BookShop()
    {
        ob[0] = new Book("Arindam","Penguin Schools", "The Boy with a Broken Heart", 300, 5);
        ob[1] = new Book("Rajdeep","Pearson","Wish I Could Tell You",1000, 10);
    }
    void add(String title, String publisher, String author , int cost, int stock)
    {
        Book added = new Book(author, publisher, title, cost, stock);
        int i = 0, n = ob.length;
        Book np[] = new Book[n + 1];

        for (i = 0; i < n; i++)
            np[i] = ob[i];

        np[n] = added;

        ob = np;
    }
    void buy(String title , String author, int total){
        for(int i=0; i<ob.length; i++){
            if(title.equalsIgnoreCase(ob[i].title) && author.equalsIgnoreCase(ob[i].author)) {
                ob[i].details();
                if(ob[i].stock < total){
                    System.out.println("The book is currently not available");
                    return;
                }
                else{
                    ob[i].stock -= total;
                    System.out.println("The total price is "+ob[i].cost * total);
                    return;
                }

            }
        }
        System.out.println("The book is not found");
    }
}
class Question16 {
    public static void main(String[] args) {
        BookShop ob = new BookShop();
        ob.buy("The Boy with a Broken Heart","Arindam", 4); System.out.println("");
        BookShop ob2 = new BookShop();
        ob2.add("The Touch of Eternity","Random House", "Sanghita",2000,20 );
        ob2.buy("The Touch of Eternity", "Sanghita", 10);
    }
}
