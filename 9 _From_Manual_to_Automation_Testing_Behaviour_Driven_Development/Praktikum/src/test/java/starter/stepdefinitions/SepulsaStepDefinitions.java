package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;
import starter.helpers.SepulsaPage;
import io.github.cdimascio.dotenv.Dotenv;


public class SepulsaStepDefinitions {

    Dotenv dotenv = Dotenv.load();

    @And("{actor} click button login sepulsa")
    public void clickLoginButtonSepulsa(Actor actor) { actor.wasAbleTo(DoAnAction.clickLoginButtonSepulsa());}

    @And("{actor} input email {string}")
    public void userInputEmail (Actor actor, String email) {
        actor.attemptsTo(DoAnAction.fillEmailFieldWithValue(dotenv.get(email)));
    }

    @And("{actor} input password {string}")
    public void userInputPasswordSepulsa (Actor actor, String passwordsepulsa) {
        actor.attemptsTo(DoAnAction.fillPasswordSepulsaFieldWithValue(dotenv.get(passwordsepulsa)));
    }

    @Given("{actor} is on sepulsa home page")
    public void userIsOnSepulsaHomePage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSepulsaHomePage());
    }

    @And("{actor} click submit login")
    public void userClickSubmitLogin (Actor actor) {
        actor.attemptsTo(DoAnAction.clickSubmitLoginButton());
    }

    @And("{actor} click beli pulsa")
    public void userClickBeliPulsa(Actor actor) {
        actor.attemptsTo(DoAnAction.clickPulsaButton());
    }


    @And("{actor} input nomor handphone {string}")
    public void userInputNomorHandphone(Actor actor, String nomorHp) {
        actor.attemptsTo(DoAnAction.fillNomorHPWithValue(nomorHp));
    }

    @And("{actor} choose pulsa 5 ribu")
    public void userChoosePulsa5Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa5rb());
    }

    @And("{actor} choose pulsa 10 ribu")
    public void userChoosePulsa10Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa10rb());
    }

    @And("{actor} choose pulsa 15 ribu")
    public void userChoosePulsa15Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa15rb());
    }
    @And("{actor} choose pulsa 20 ribu")
    public void userChoosePulsa20Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa20rb());
    }

    @And("{actor} choose pulsa 25 ribu")
    public void userChoosePulsa25Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa25rb());
    }

    @And("{actor} choose pulsa 30 ribu")
    public void userChoosePulsa30Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa30rb());
    }

    @And("{actor} choose pulsa 40 ribu")
    public void userChoosePulsa40Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa40rb());
    }

    @And("{actor} choose pulsa 50 ribu")
    public void userChoosePulsa50Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa50rb());
    }

    @And("{actor} choose pulsa 60 ribu")
    public void userChoosePulsa60Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa60rb());
    }

    @And("{actor} choose pulsa 70 ribu")
    public void userChoosePulsa70Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa70rb());
    }

    @And("{actor} choose pulsa 80 ribu")
    public void userChoosePulsa80Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa80rb());
    }

    @And("{actor} choose pulsa 90 ribu")
    public void userChoosePulsa90Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa90rb());
    }

    @And("{actor} choose pulsa 100 ribu")
    public void userChoosePulsa100Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa100rb());
    }

    @And("{actor} choose pulsa 200 ribu")
    public void userChoosePulsa200Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa200rb());
    }

    @And("{actor} choose pulsa 300 ribu")
    public void userChoosePulsa300Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa300rb());
    }

    @And("{actor} choose pulsa 500 ribu")
    public void userChoosePulsa500Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa500rb());
    }

    @Then("{actor} see {string} checkout page")
    public void userSeeCheckoutPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SepulsaPage.TOTAL_PEMBAYARAN).hasText(text));
    }
    @And("{actor} click lainnya")
    public void userClickLainnya(Actor actor) {
        actor.attemptsTo(DoAnAction.chooseButtonLainnya());
    }
    @Then("{actor} choice indihome")
    public void userChoiseIndihome(Actor actor) {
        actor.attemptsTo(DoAnAction.userIndihomeButton());
    }
    @And("{actor} input nomor Langganan {string}")
    public void userInputNomorLangganan (Actor actor, String nomor) {
        actor.attemptsTo(DoAnAction.fillLanggananFieldWithValue(nomor));
    }
    @And("{actor} choose button bayar indihome")
    public void userChooseButtonBayarIndihome(Actor actor) {
        actor.attemptsTo(DoAnAction.choseIndihomeBayarButton());
    }
    @And("{actor} choose button Checkout bayar indihome")
    public void userChooseButtonCheckoutBayarIndihome(Actor actor) {
        actor.attemptsTo(DoAnAction.userIndihomeCheckoutButton());
    }
}
