package StepDefinations;

import Pages.AutomationPractisePage;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class AutomationPractiseStepDefinition {
    AutomationPractisePage automationPractisePage= new AutomationPractisePage();
    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String string) {

        Driver.getDriver().get(ConfigReader.getProperty(string));
         }
    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
    automationPractisePage.singinLinki.click();
        }
    @Given("email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar")
    public void email_kutusuna_isareti_olmayan_email_adresi_yazar_ve_enter_a_tiklar() {
        automationPractisePage.emailKutusuTextBox.sendKeys(ConfigReader.getProperty("AutPractiseyanlisEmail"+ Keys.ENTER));
        }
    @Then("error mesajinin “Invalid email address”  oldugunu dogrulayin")
    public void error_mesajinin_ınvalid_email_address_oldugunu_dogrulayin() {
       String acthataYzisi= automationPractisePage.invalitEmailYazisiElement.getText();
       String exphataYzisi=ConfigReader.getProperty("AutPractiseHataYazisi");
        Assert.assertEquals(exphataYzisi,acthataYzisi);
        }


}
