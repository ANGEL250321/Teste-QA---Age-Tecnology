package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuscaBlogPO extends BasePO{
//#region WebElements
    @FindBy(css = "i.fas.fa-search")
    public WebElement buttonPesquisar;

    @FindBy(className = "elementor-search-form__input")
    public WebElement inputPesquisar;

    @FindBy(id = "breadcrumbs")
    public WebElement divResultado;
//#endregion WebElements

    public BuscaBlogPO(WebDriver driver) {  
        super(driver);
    }

    //#region Métodos
    public void realizarPesquisa(){
       buttonPesquisar.click();
     }

     public void pesquisar(String texto){
        inputPesquisar.sendKeys(texto + Keys.ENTER);
    }

    public String obterResultadoPesquisa(){
        return divResultado.getText();
    }

    //#endregion Métodos

   

    
}
