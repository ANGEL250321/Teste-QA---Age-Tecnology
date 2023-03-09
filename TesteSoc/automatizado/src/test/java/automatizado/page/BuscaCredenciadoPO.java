package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



    public class BuscaCredenciadoPO extends BasePO {
    //#region WebElements
    @FindBy(xpath ="//a[contains(text(),'Funcionalidades')]")
    public WebElement buttonFuncionalidade;

    @FindBy(linkText = "Rede SOCNET")
    public WebElement buttonRedeSoc;

    @FindBy(css = ".elementor-animation-grow .elementor-button-text")
    public WebElement buttonBuscar;

    @FindBy(css = "div>div>span.alteracao")
    public WebElement linkAlterar;

    @FindBy (css = "#btn-distancia-20")
    public WebElement button20;

    @FindBy (css = "#div-filtro-conveniencias > span.expand-filtros")
    public WebElement divConveniencias;

    @FindBy (css = "#div-filtro-conveniencias > section > div:nth-child(16) > label > span.cbx-estilizado")
    public WebElement divDigital;

    @FindBy(css = "#div-filtro-conveniencias > section > div:nth-child(2) > label > span.cbx-estilizado")
    public WebElement divCartao;

    @FindBy(css = "#div-filtro-servicos > span.expand-filtros")
    public WebElement divServicos;

    @FindBy(css = "#div-filtro-servicos > section > div:nth-child(7) > label > span.cbx-estilizado")
    public WebElement divAtendimento;

    @FindBy(id = "ipt-busca-credenciado-2")
    public WebElement inputCep;

    @FindBy(id = "botao-buscar")
    public WebElement buttonBusca;

    @FindBy(css = "#div-resultados-qtdd")
    public WebElement spanResultado;

    @FindBy(css = "#conteudo-resultados > div.estrutura-card > div > div:nth-child(1) > div > section")
    public WebElement divCredenciado;

    @FindBy(css = "#div-header-perfil > div > div.perfil-dados-empresa > div:nth-child(1) > span")
    public WebElement spanCredenciado;

    @FindBy(css = "#conteudo-resultados > div.mapa-resultados > div > div > div > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(3) > div > div > div.infowindow-maps > a > button")
    public WebElement buttonSaibaMais;
    //#endregion WebElements


      public BuscaCredenciadoPO(WebDriver driver) {
        super(driver);
      }

      //#region Métodos
      public void optionFuncionalidade(){
        buttonFuncionalidade.click();
      }

      public void optionRedeSoc(){
        buttonRedeSoc.click();
      }

      public void buscarCredenciado(){
        buttonBuscar.click();
      }

      public void pesquisar(String texto){
        inputCep.sendKeys(texto);
      }

      public void buscaPesquisa(){
      buttonBusca.click();
      }

      public String obterResultadoDaPesquisa(){
      return spanResultado.getText();
      }

      public void paginaCredenciado(){
      buttonFuncionalidade.click();
      buttonRedeSoc.click();
      buttonBuscar.click();
      }

      public void filtrarCredenciado(){
      linkAlterar.click();
      button20.click();
      divConveniencias.click();
      divDigital.click();
      divCartao.click();
      divServicos.click();
      divAtendimento.click();
      }
      public void resultadoCredenciado(){
      divCredenciado.click();
      }

      public void perfilCredenciado(){
      buttonSaibaMais.click();
      } 

      public String obterResultadoPesquisa(){
      return spanCredenciado.getText();
      }

//#endregion Métodos


   
        


      
    
  
}
