package Pages;

import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPractisePage {
   public AutomationPractisePage(){
      PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@class='login']")
    public WebElement singinLinki;

    @FindBy(xpath = "(//input[@class='is_required validate account_input form-control'])[1]")
    public WebElement emailKutusuTextBox;

    @FindBy(xpath = "//li[text()='Invalid email address.']")
    public WebElement invalitEmailYazisiElement;
}


