package automatizado.page;
/**
 * Classe base para criação das novas PagesObjects
 * Todas as pages devem ser herdadas dessa classe
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePO {
    /** Driver base que será usado pelas pages  */
    protected WebDriver driver;
/**
 * Construtor base para criação da fábrica de elementos(Page Factory)
 */
    public BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   
    /**Metodo que retorna o titulo da página atual */

    public String obterTituloDaPagina(){
        return driver.getTitle();
     }
 
}
