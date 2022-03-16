import org.junit.Before;

public class BookTest {

    private Book book;
    private Library library;

    @Before
    public void before(){
//        pessoa = new Book("Selected Poems", "Fernando Pessoa", "Poetry");
//        eliot = new Book("Four Quartets", "T.S. Eliot", "poetry");
//        spark = new Book("The Finishing School", "Muriel Spark", "fiction");
        library = new Library("nice books", 3);
    }
}
