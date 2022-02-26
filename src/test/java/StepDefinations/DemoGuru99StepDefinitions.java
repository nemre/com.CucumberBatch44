package StepDefinations;

import Pages.DemoGuruPage;
import Utilities.Driver;
import Utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DemoGuru99StepDefinitions {

    DemoGuruPage demoGuruPage= new DemoGuruPage();


    @Given("kullanıcı {string} sayfasina gider")
    public void kullanıcıSayfasinaGider() {

    }

    @Given("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenBaslikStr) {

        //demoGuruPage.cookiesKabulEtButonu.click();

        //Driver.getDriver().switchTo().frame(demoGuruPage.iframe);

        List<WebElement> baslikWebElementListesi= demoGuruPage.baslikWebElementListesi;

        List<String> baslikStringListesi= ReusableMethods.getElementsText(baslikWebElementListesi);

        int istenenSutunIndexi=baslikStringListesi.indexOf(istenenBaslikStr);

        List<WebElement> istenenSutunWebElementListesi=demoGuruPage.sutunListesiGetir(istenenSutunIndexi);

        List<String> istenenSutunStr=ReusableMethods.getElementsText(istenenSutunWebElementListesi);

        System.out.println(istenenBaslikStr+"sutundaki elementler\n"+istenenSutunStr);
        }


}
