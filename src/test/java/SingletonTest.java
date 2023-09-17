import junit.framework.TestCase;
import org.example.Singleton;
import org.junit.Test;

public class SingletonTest extends TestCase{
    @Test
    void deveRetornarUrl(){
        Singleton.getInstance().setUrl("jdbc:localhost:8888/bd");
        assertEquals("jdbc:localhost:8888/bd", Singleton.getInstance().getUrl());
    }
}