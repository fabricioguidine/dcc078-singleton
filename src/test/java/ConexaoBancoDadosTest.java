import junit.framework.TestCase;
import org.example.ConexaoBancoDados;
import org.junit.Test;

public class ConexaoBancoDadosTest extends TestCase{
    @Test
    void deveRetornarUrl(){
        ConexaoBancoDados.getInstance().setUrl("jdbc:localhost:8888/bd");
        assertEquals("jdbc:localhost:8888/bd", ConexaoBancoDados.getInstance().getUrl());
    }
    @Test
    public void testSetUser() {
        ConexaoBancoDados.getInstance().setUser("fabricio");
        assertEquals("fabricio", ConexaoBancoDados.getInstance().getUser());
    }

    @Test
    public void testSetSenha() {
        ConexaoBancoDados.getInstance().setSenha("123");
        assertEquals("123", ConexaoBancoDados.getInstance().getSenha());
    }
}