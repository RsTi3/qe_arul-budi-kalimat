package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import starter.helpers.DoAnAction;
import starter.helpers.LinkedInPage;
import starter.helpers.NavigateTo;
import org.openqa.selenium.WebDriver;

public class LinkedInStepDefinitions {

    Dotenv dotenv = Dotenv.load();

    @Managed(driver = "Chrome")
    WebDriver driver;

    @Given("{actor} is on linkedin landing page")
    public void userIsOnLinkedInLandingPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theLinkedInLandingPage());
    }

    @And("{actor} click login")
    public void userClickLogin(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSignInButton());
    }

    @And("{actor} click send post")
    public void userClickSendPost(Actor actor) {
        actor.attemptsTo((DoAnAction.clickPostButton()));
    }

    @Then("{actor} is on home page")
    public void userIsOnHomePage(Actor actor) {

    }


    @And("{actor} input post")
    public void userInputPost(Actor actor) {
        actor.attemptsTo(DoAnAction.clickPost());
    }



    @Then("user see their post in their feed")
    public void userSeeTheirPostInTheirFeed() {
    }

    @And("user click comment button")
    public void userClickCommentButton() {
    }

    @And("user input comment")
    public void userInputComment() {
    }

    @And("user click send comment")
    public void userClickSendComment() {
    }

    @Then("user see their comment on their post")
    public void userSeeTheirCommentOnTheirPost() {
    }

    @And("user click repost")
    public void userClickRepost() {
    }

    @Then("user see their reposted post in their feed")
    public void userSeeTheirRepostedPostInTheirFeed() {
    }

    @And("user input post with photo")
    public void userInputPostWithPhoto() {
    }

    @And("user input post with video")
    public void userInputPostWithVideo() {
    }

    @And("user input post with event")
    public void userInputPostWithEvent() {
    }

    @And("user click like button")
    public void userClickLikeButton() {
    }

    @And("user choose like emoticon")
    public void userChooseLikeEmoticon() {
    }

    @Then("user see their post is liked")
    public void userSeeTheirPostIsLiked() {
    }

    @And("{actor} input incorrect username {string}")
    public void userInputIncorrectUsername(Actor actor, String username) {
        actor.attemptsTo(DoAnAction.fillUsernameFieldWithValue(dotenv.get(username)));
    }

    @And("{actor} input incorrect password {string}")
    public void userInputIncorrectPassword(Actor actor, String password) {
        actor.attemptsTo(DoAnAction.fillPasswordFieldWithValue(dotenv.get(password)));
    }

    @And("{actor} input correct username {string}")
    public void userInputCorrectUsername(Actor actor, String username) {
        actor.attemptsTo(DoAnAction.fillUsernameFieldWithValue(dotenv.get(username)));
    }

    @And("{actor} input correct password {string}")
    public void userInputCorrectPassword(Actor actor, String password) {
        actor.attemptsTo(DoAnAction.fillPasswordFieldWithValue(dotenv.get(password)));
    }

    @Then("{actor} cannot login and still on login page")
    public void userCannotLoginAndStillOnLoginPage(Actor actor) {
        actor.attemptsTo(Ensure.that(LinkedInPage.ERROR_EMAIL_LABEL).hasText("Please enter a valid email address."));
    }

    @Then("{actor} cannot login and still on login page wrong password")
    public void userCannotLoginAndStillOnLoginPageWrongPassword(Actor actor) {
        actor.attemptsTo(Ensure.that(LinkedInPage.ERROR_PASSWORD_LABEL).hasText("Please enter a valid email address."));
    }


    @And("{actor} choose random number {int}")
    public void userChooseRandomNumber(Actor actor, int number) {
        System.out.println("User chose number: " + number);
    }

    @And("{actor} input text post {string}")
    public void userInputTextPost(Actor actor, String postingan) {
        actor.attemptsTo(DoAnAction.fillFieldPost(postingan));
    }

}