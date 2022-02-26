package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeroqappPage {
   public HeroqappPage(){
        PageFactory.initElements(Driver.getDriver(),this);
   }

    @FindBy(css = "[onclick=\"addElement()\"]")
    public WebElement addButonElement;

    @FindBy(css = "[onclick=\"deleteElement()\"]")
    public WebElement deleteButonElement;
}






