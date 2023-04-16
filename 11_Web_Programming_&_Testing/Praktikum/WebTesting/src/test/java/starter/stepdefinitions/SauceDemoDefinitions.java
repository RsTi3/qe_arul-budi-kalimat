package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;
import starter.helpers.SepulsaPage;


public class SauceDemoDefinitions {

    Dotenv dotenv = Dotenv.load();


    @Given("{actor} is on saucedemo login page")
    public void userIsOnSauceDemoLoginPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSaucedemoLandingPage());
    }

    @And("{actor} input username saucedemo {string}")
    public void userInputUsernameSauceDemo (Actor actor, String username) {
        actor.attemptsTo(DoAnAction.fillUsernameSauceDemoFieldWithValue(dotenv.get(username)));
    }

    @And("{actor} input password saucedemo {string}")
    public void userInputPasswordSauceDemo (Actor actor, String password) {
        actor.attemptsTo(DoAnAction.fillPasswordSauceDemoFieldWithValue(dotenv.get(password)));
    }

    @And("{actor} click submit login saucedemo")
    public void userClickSubmitLogin (Actor actor) {
        actor.attemptsTo(DoAnAction.clickLoginButtonSauceDemo());
    }

    @Then("{actor} is on home page saucedemo")
    public void userIsOnHomePageSauceDemo(Actor actor) {

    }
    @Then("{actor} still on login page")
    public void userIsOnLoginPagePageSauceDemo(Actor actor) {

    }
    @And("{actor} click add to cart sauce labs backpack")
    public void  userClickCartBackpack (Actor actor) {
        actor.attemptsTo((DoAnAction.clickCartBackpack()));
    }
    @And("{actor} click add to cart sauce labs bike light")
    public void  userClickCartBikeLight (Actor actor) {
        actor.attemptsTo((DoAnAction.clickCartBikeLight()));
    }
    @And("{actor} click add to cart sauce labs bolt tshirt")
    public void  userClickCartTshirt (Actor actor) {
        actor.attemptsTo((DoAnAction.clickCartTshirt()));
    }
    @And("{actor} click add to cart sauce labs fleece jacket")
    public void  userClickCartJacket (Actor actor) {
        actor.attemptsTo((DoAnAction.clickCartFleeceJacket()));
    }
    @And("{actor} click add to cart sauce labs onesie")
    public void  userClickCartOnesie (Actor actor) {
        actor.attemptsTo((DoAnAction.clickCartOnesie()));
    }
    @And("{actor} click add to cart sauce labs tshirt red")
    public void  userClickCartTshirtRed (Actor actor) {
        actor.attemptsTo((DoAnAction.clickCartTshirtRed()));
    }

    @Then("{actor} click cart")
    public void userClickCartButton (Actor actor) {
        actor.attemptsTo((DoAnAction.clickCartButton()));
    }

    @Then("{actor} click cart seems error")
    public void userClickCartButtonError (Actor actor) {
        actor.attemptsTo((DoAnAction.clickCartButtonError()));
    }

    @Then("{actor} on your cart")
    public void userIsOnYourCart (Actor actor) {
    }

    @And("{actor} click checkout")
    public void userClickCheckoutButton (Actor actor) {
        actor.attemptsTo((DoAnAction.clickCheckoutButton()));
    }

    @Then("{actor} on checkout information")
    public void userIsOnCheckoutInformation (Actor actor) {
    }

    @And("{actor} input first name {string}")
    public void userInputFirstNameSauceDemo (Actor actor, String username) {
        actor.attemptsTo(DoAnAction.fillFirstNameSauceDemoFieldWithValue(dotenv.get(username)));
    }

    @And("{actor} input last name {string}")
    public void userInputLastNameSauceDemo (Actor actor, String username) {
        actor.attemptsTo(DoAnAction.fillLastNameSauceDemoFieldWithValue(dotenv.get(username)));
    }

    @And("{actor} input zip or postal code {string}")
    public void userInputZipSauceDemo (Actor actor, String username) {
        actor.attemptsTo(DoAnAction.fillZipSauceDemoFieldWithValue(dotenv.get(username)));
    }

    @And("{actor} click continue")
    public void userClickContinueButton (Actor actor) {
        actor.attemptsTo((DoAnAction.clickContinueButton()));
    }

    @Then("{actor} on checkout overview")
    public void userIsOnCheckoutOverview (Actor actor) {
    }

    @Then("{actor} still on checkout information because error input")
    public void userIsOnCheckoutOverviewError (Actor actor) {
    }

    @And("{actor} click finish button")
    public void userClickFinishButton (Actor actor) {
        actor.attemptsTo((DoAnAction.clickFinishButton()));
    }

    @Then("{actor} will receive message checkout complete")
    public void userIsOnCheckoutComplete (Actor actor) {
    }
}


