package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebUniversityPage {
    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='section-title'])[2]")
    public WebElement loginPrtal;

    @FindBy (xpath = "//button[@id='login-button']")
    public WebElement ikincilogin;

    @FindBy (xpath = "//input[@placeholder='Username']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement Password;







}
