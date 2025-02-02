package StepDefinitions;

import Pages.CatchyPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CatchyStepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
    CatchyPages catchyPages = new CatchyPages(driver);

    @Given("Catchylabs uygulamasına gidilir")
    public void catchylabsUygulamasınaGidilir() {
        CatchyPages.AnaSayfa();
    }

    @When("Username girilir")
    public void usernameGirilir() {
        CatchyPages.userNamePlaceholder();

    }
    @When("Password girilir.")
    public void passwordGirilir() {
        CatchyPages.passwordPlaceholder();
    }

    @When("Login Butona tiklanir")
    public void loginButonaTiklanir() {
        CatchyPages.loginButon();

    }

    @When("Open Money Transfer butonuna tiklanir")
    public void openMoneyTransferButonunaTiklanir() {
        CatchyPages.openMoneyTransferButon();
    }

    @When("Transfer Money butonuna tiklanir")
    public void transferMoneyButonunaTiklanir() {
        CatchyPages.transferMoneyButon();
    }

    @When("Sender Account merveeaksoy seçilir")
    public void senderAccountMerveeaksoySeçilir() {
        CatchyPages.senderAccount();
    }

    @When("Receiver Account Testinium{int} seçilir.")
    public void receiverAccountTestiniumSeçilir(int arg0) {
        CatchyPages.receiverAccount();
    }

    @When("Amount degeri {int} girilir")
    public void amountDegeriGirilir(int arg0) {
        CatchyPages.amount();
    }

    @When("Send butonuna tıklanir")
    public void sendButonunaTıklanir() {
        CatchyPages.sendButon();
    }

    @Then("Gonderilen Amount degeri dogrulanir")
    public void gonderilenAmountDegeriDogrulanir() {
        CatchyPages.gonderilenAmount();
    }

    @When("Edit Account butonuna tiklanir")
    public void editAccountButonunaTiklanir() {
        CatchyPages.editAccountButonu();
    }

    @When("Yeni Account name girilir")
    public void yeniAccountNameGirilir() {
        CatchyPages.yeniAccountAd();
    }

    @When("Update Butona tıklanir")
    public void updateButonaTıklanir() {
        CatchyPages.updateButonu();
    }

    @Then("Update edilen account dogrulanir")
    public void updateEdilenAccountDogrulanir() {
        CatchyPages.checkYeniAd();
    }

    @When("Add Money butona tiklanir")
    public void addMoneyButonaTiklanir() {
        CatchyPages.addMoneyButonu();
    }

    @When("Add Butona tiklanir.")
    public void addButonaTiklanir() {
        CatchyPages.addButonu();
    }

    @Then("Check {string} hatayı kontrol et")
    public void checkHatayıKontrolEt(String cardHolder ) {
        CatchyPages.checkMessage(cardHolder);
    }
}
