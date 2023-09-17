import junit.framework.TestCase;
import org.junit.Test;

public class SingletonTest extends TestCase{
    @Test
    public void testSetUrl(){
        Singleton.getInstance().setUrl();
        assertEquals("jdbc:localhost:8888/bd", Singleton.getInstance().getUrl());
    }
}