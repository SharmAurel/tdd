import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;



public class DictionaryTest {

    private Dictionary dict;


    @Before
    public void initialize () {
        dict = new Dictionary();
    }


    @Test public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }


}
