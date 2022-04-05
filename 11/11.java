class Publication {
    double price;
    int noOfPages;
    String publisherName, bookType;

    Publication(double price, int noOfPages, String publisherName, String bookType) {
        this.price = price;
        this.publisherName = publisherName;
        this.noOfPages = noOfPages;
        this.bookType = bookType;
    }

    void printDetails() {
        System.out.println("Publisher : " + this.publisherName + " having " + this.noOfPages + " pages  @"
                + this.price + " [ " + this.bookType + " ]");
    }
}

class Book extends Publication {
    Book(double price, int noOfPages, String publisherName, String bookType) {
        super(price, noOfPages, publisherName, bookType);
    }
}

class Journal extends Publication {
    Journal(double price, int noOfPages, String publisherName, String bookType) {
        super(price, noOfPages, publisherName, bookType);
    }
}

class Library {
    Publication pub[];
    int index;

    Library() {
        pub = new Publication[5];
        this.index = 0;
    }

    void insert(Publication p) {
        pub[index] = p;  index++;
    }

    void show() {
        for (Publication publication : pub) {
            publication.printDetails();
        }
    }
}

class eleven {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book(100.00, 200, "HarperCollins", "Kindle Edition");
        Book b2 = new Book(200.00, 150, "Random House", "Ebook");
        Book b3 = new Book(1500.00, 750, "Scholastic", "Hard Cover");
        Journal j1 = new Journal(50.00, 500, "Penguin Books", "Paperback");
        Journal j2 = new Journal(50.00, 100, "Pearson", "Ebook");

        lib.insert(b1);
        lib.insert(b2);
        lib.insert(b3);
        lib.insert(j1);
        lib.insert(j2);

        lib.show();
    }
}