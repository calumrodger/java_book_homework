import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Library smallbooks;
    private Book pessoa;
    private Book eliot;
    private Book spark;

    @Before
    public void before(){
        library = new Library("nice books", 3);
        smallbooks = new Library("lovely books", 2);
        pessoa = new Book("Selected Poems", "Fernando Pessoa", "Poetry");
        eliot = new Book("Four Quartets", "T.S. Eliot", "poetry");
        spark = new Book("The Finishing School", "Muriel Spark", "fiction");
    }

    @Test
    public void getTotalBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(pessoa);
        library.addBook(eliot);
        library.addBook(spark);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void cannotAddBookWhenCapacityMet(){
        smallbooks.addBook(pessoa);
        smallbooks.addBook(eliot);
        smallbooks.addBook(spark);
        assertEquals(2, smallbooks.bookCount());
    }
}
