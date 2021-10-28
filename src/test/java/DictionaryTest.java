import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.*;


public class DictionaryTest {

    private Dictionary dict;
    private Map<String, List<String>> traductions;

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
        assertThat(dict.getMultipleTranslation("contre"),containsInAnyOrder("against"));
    }

    @Test public void testOneTranslationSecond() {
        dict.addTranslation("Londres", "London");
        assertThat(dict.getMultipleTranslation("Londres"),containsInAnyOrder("London"));
    }

    @Test public void testMultipleTranslation() {
        dict.addTranslation("bonjour","hello");
        dict.addTranslation("bonjour","hallo");
        assertThat(dict.getMultipleTranslation("bonjour"), containsInAnyOrder("hello","hallo"));
    }








}
