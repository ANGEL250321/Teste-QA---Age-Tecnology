package automatizado.test;


import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import automatizado.page.BuscaBlogPO;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class BuscaBlogTest extends BaseTest {

    private static BuscaBlogPO blogPage;

    @BeforeClass
    public static void prepararTestes(){
        blogPage = new BuscaBlogPO(driver);
    }

    @Test
    public void TC001_realizarPesquisaBlog(){
     
       blogPage.realizarPesquisa();

       blogPage.pesquisar("Evento");

       String resultado = blogPage.obterResultadoPesquisa();

       assertTrue(resultado, resultado.contains("Você pesquisou por"));
    }

    
}

       

