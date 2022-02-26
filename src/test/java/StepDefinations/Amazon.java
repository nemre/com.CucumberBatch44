package StepDefinations;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class Amazon {

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
       Driver.getDriver().get("http://amazon.com");
    }
    @Given("iPhone icin arama yapar")
    public void i_phone_icin_arama_yapar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("sonuclarin iPhone icerdigini test eder")
    public void sonuclarin_i_phone_icerdigini_test_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("tea pot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("sonuclarin tea pot icerdigini test eder")
    public void sonuclarin_tea_pot_icerdigini_test_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarin_flower_icerdigini_test_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
