package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Classe base que serve de herança para todas as classes de teste
 */
public abstract class BaseTest {
    /**
     * Driver do navegador da página atual
     */

    protected static WebDriver driver;
    /**Caminho base da URL do sistema a ser testado */
    private static final String URL_BASE ="https://www.soc.com.br/blog-de-sst/";

    /**Metodo para iniciar o driver do navegador antes de qualquer classe de teste */
    @BeforeClass
   public static void iniciar(){
        System.setProperty("webdriver.chrome.driver","src/test/java/automatizado/resource/chromedriver-v110.0.5481.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get(URL_BASE);
    }

    /**Metodo que finaliza o driver depois de qualquer classe de teste */

    @AfterClass
    public static void finalizar(){
        driver.quit();
}

}