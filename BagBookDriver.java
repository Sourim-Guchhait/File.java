// Aggregation example....

class Book {
    String name = "SQL";
    double price = 8000d;
    String author = "promod sir";
}

class Bag {
    Book book;

    public void addBook(Book book) {
        this.book = book;
    }
}

class BagBookDriver {
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.addBook(new Book());

        System.out.println("book name is : " + bag.book.name);
        System.out.println("book price is : " + bag.book.price);
        System.out.println("book author is : " + bag.book.author);
    }
}
