import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;


public class DictionaryTest {

    private Dictionary dict;


    @Before
    public void initialize () {
        dict = new Dictionary("Example");

    }


    @Test public void testDictionaryName() {
        assertEquals(dict.getName(),"Example");
    }

    @Test public void testDictionaryisEmpty()
    {
            assertTrue(dict.isEmpty());
    }

    @Test public void testOneTranslation() {
        dict.addTranslation("contre", "against");
        assertEquals(dict.getTranslation("contre"),"against");
    }

    @Test public void testOneTranslationSecond() {
        dict.addTranslation("Londres", "London");
        assertEquals(dict.getTranslation("Londres"),"London");
    }






}
