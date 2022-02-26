package StepDefinations;

import Pages.HMCPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class HotelMyCampStepDefinations {
    HMCPage hmcPage=new HMCPage();

    @Given("login linkine tıklar")
    public void login_linkine_tıklar() {
        hmcPage.mainPageLogin.click();
         }
    @Then("kullanıcı adı olarak {string} girer")
    public void kullanıcı_adı_olarak_girer(String kullaniciTipi) {
        hmcPage.userNameBox.sendKeys(ConfigReader.getProperty(kullaniciTipi));
          }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTuru) {
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty(passwordTuru));
         }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButonu.click();

       }
    @Then("giris yapıldığını test eder")
    public void giris_yapıldığını_test_eder() {
        Assert.assertTrue(hmcPage.basariliGirisYaziElementi.isDisplayed());
        }

    @And("giris yapılamadığını test eder")
    public void girisYapılamadığınıTestEder() {
        Assert.assertTrue(hmcPage.girisYapilamadiYaziElementi.isDisplayed());
    }


    @Then("senario outline'dan kullanici adi olarak {string} yazar")
    public void senarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hmcPage.userNameBox.sendKeys(username);
    }

    @And("senario outline'dan password olaral {string} yazar")
    public void senarioOutlineDanPasswordOlaralYazar(String password) {
        hmcPage.passwordBox.sendKeys(password);
    }
}
