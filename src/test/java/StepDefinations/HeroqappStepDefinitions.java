package StepDefinations;

import Pages.HeroqappPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HeroqappStepDefinitions {
    HeroqappPage heroqappPage=new HeroqappPage();


    @Given("kullanici HereQappAddEleUri sayfasina gider")
    public void kullaniciHereQappAddEleUriSayfasinaGider() {
        Driver.getDriver().get("http://the-internet.herokuapp.com/add_remove_elements/");
    }

    @When("Add Element butona basar")
    public void addElementButonaBasar() {
        heroqappPage.addButonElement.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {
        ReusableMethods.waitForVisibility(heroqappPage.deleteButonElement,20);
    }
    @Then("Delete butonunun gorundgunu test eder")
    public void delete_butonunun_gorundgunu_test_eder() {
        Assert.assertTrue(heroqappPage.deleteButonElement.isDisplayed());
           }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        heroqappPage.addButonElement.click();
         }

    @And("Delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {
    }



}
