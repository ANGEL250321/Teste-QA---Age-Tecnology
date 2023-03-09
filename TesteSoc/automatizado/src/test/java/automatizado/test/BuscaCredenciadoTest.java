package automatizado.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


import automatizado.page.BuscaCredenciadoPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class BuscaCredenciadoTest extends BaseTest {

    private static BuscaCredenciadoPO buscaCredenciadoPage;

    @BeforeClass
    public static void prepararTestes(){
       buscaCredenciadoPage = new BuscaCredenciadoPO(driver);
    }

    @Test
    public void TC001_deveAbrirPerfilCredenciado() {

        buscaCredenciadoPage.optionFuncionalidade();
        buscaCredenciadoPage.optionRedeSoc();
        buscaCredenciadoPage.buscarCredenciado();

        assertEquals(buscaCredenciadoPage.obterTituloDaPagina(), "Rede Credenciada SOC");

        buscaCredenciadoPage.pesquisar("11335060");
        buscaCredenciadoPage.buscaPesquisa();
        buscaCredenciadoPage.filtrarCredenciado();
        buscaCredenciadoPage.resultadoCredenciado();
        buscaCredenciadoPage.perfilCredenciado();

        String resultado = buscaCredenciadoPage.obterResultadoPesquisa();

        assertTrue(resultado, resultado.contains("TNK CONSULTORIA EM SST E ENGENHARIA"));

    }



    
}
