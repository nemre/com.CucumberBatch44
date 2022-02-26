package StepDefinations;

import Pages.WebUniversityPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class WebUniversityStepDefinision {

    WebUniversityPage webUniversityPage=new WebUniversityPage();

    @Given("webuniversity WebUniversityUrl adresine gider")
    public void webuniversityWebUniversityUrlAdresineGider() {
        Driver.getDriver().get("https://webdriveruniversity.com");
    }

    @Then("Login Portal'a  kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        }
    @Then("Login Portal'a tiklar")
    public void login_portal_a_tiklar() {
        webUniversityPage.loginPrtal.click();
        }
    @Then("Diger window'a gecer")
    public void diger_window_a_gecer() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
        }
    @And("{string} ve  {string} kutularina deger yazdirar")
    public void veKutularinaDegerYazdirar(String username, String password) {
        webUniversityPage.username.sendKeys(username);
        webUniversityPage.Password.sendKeys(password);
    }
    @Then("sayfada login butonuna basar")
    public void sayfada_login_butonuna_basar() {
        webUniversityPage.ikincilogin.click();
         }
    @Then("Popup'ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String Popyazisi) {
       String alert= Driver.getDriver().switchTo().alert().getText();
        Assert.assertTrue(Popyazisi.equals(alert));
          }
    @Then("Ok diyerek Popup'i kapatır")
    public void ok_diyerek_popup_i_kapatır() {
        Driver.getDriver().switchTo().alert().accept();
         }
    @Then("Ilk sayfaya geri doner")
    public void ılk_sayfaya_geri_doner() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
       }
    @Then("Ilk sayfaya donuldugunu test eder")
    public void ılk_sayfaya_donuldugunu_test_eder() {
       String actTitle= Driver.getDriver().getTitle();
       String expTitle="WebDriver | Login Portal";
       Assert.assertEquals(expTitle,actTitle);
        }



}
