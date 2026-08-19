public class Library {
    int year;
    String name;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The "+this.year+" "+this.name);
        System.out.println("The books available: ");
        for(Book book : books){
            book.displayInfo();
        }
    }

}
