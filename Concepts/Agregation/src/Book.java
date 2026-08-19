public class Book {
    int pages;
    String title;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    void displayInfo(){
        System.out.println(this.title+" ("+this.pages+").");
    }
}
