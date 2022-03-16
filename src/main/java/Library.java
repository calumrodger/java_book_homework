import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> bookList;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.bookList = new ArrayList<>();
    }

    public int bookCount(){
        return this.bookList.size();
    }

    public void addBook(Book book) {
        if(this.capacity >= 1){
            this.bookList.add(book);
            this.capacity -= 1;
        }
    }

}
