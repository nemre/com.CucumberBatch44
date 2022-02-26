package Pages;

import Utilities.Driver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemoGuruPage {

   public DemoGuruPage(){
       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> baslikWebElementListesi;

   public List<WebElement> sutunListesiGetir(int index){
       String dinamikXPath="//tbody//tr//td["+(index+1)+"]";
       List<WebElement> istenenSutunWebElementi=Driver.getDriver().findElements(By.xpath(dinamikXPath));

       return istenenSutunWebElementi;
   }

    @FindBy(xpath = "//iframe[@class='faktor-iframe-wrapper']")
    public WebElement iframe;

    @FindBy(xpath = "//button[@id='save']")
    public WebElement cookiesKabulEtButonu;

}
