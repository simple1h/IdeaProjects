package Ch02;

import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.SQLException;
import java.util.List;

/**
 * Unit test for simple Main.
 */
public class BookTest extends TestCase
{
    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static EntityTransaction tx;

    @BeforeClass
    public static void initEntityManager() throws Exception {
        emf = Persistence.createEntityManagerFactory("Ch02");
        em = emf.createEntityManager();
    }
    @AfterClass
    public static void closeEntityManager() throws SQLException {
        em.close();
        emf.close();
    }
    @Before
    public void initTransaction() {
        tx = em.getTransaction();
    }

    @Test
    public void shouldCreateABook() throws Exception {
// Creates an instance of book
        Book book = new Book();
        book.setTitle("The Hitchhiker's Guide to the Galaxy");
        book.setPrice(12.5F);
        book.setDescription("Science fiction comedy book");
        book.setIsbn("1-84023-742-2");
        book.setNbOfPage(354);
        book.setIllustrations(false);
// Persists the book to the database
        tx.begin();
        em.persist(book);
        tx.commit();
        assertNotNull("ID should not be null", book.getId());
// Retrieves all the books from the database
        List<Book> books = em.createNamedQuery("findAllBooks").getResultList();
        assertEquals(1, books.size());
    }
}
