package StepDefinations;

import Pages.DemoQaPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class demoQaSpetDefinition {
    DemoQaPage demoQaPage=new DemoQaPage();

    @Then("Will enable {int} seconds butonunun enable olmasini bekleyin")
    public void will_enable_seconds_butonunun_enable_olmasini_bekleyin(Integer int1) {
        ReusableMethods.waitForClickablility(demoQaPage.enable5SecondsButton,15);
    }
    @Then("Will enable {int} seconds butonunun enable oldugunu test edin")
    public void will_enable_seconds_butonunun_enable_oldugunu_test_edin(Integer int1) {
        Assert.assertTrue(demoQaPage.enable5SecondsButton.isEnabled());
    }


}
