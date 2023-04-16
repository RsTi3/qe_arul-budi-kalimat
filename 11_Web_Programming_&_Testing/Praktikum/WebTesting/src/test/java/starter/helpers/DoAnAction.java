package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoAnAction {
    //DIBAWAH DO AN ACTION SauceDemo//

    public static Performable fillUsernameSauceDemoFieldWithValue(String username) {
        return Task.where("{0} fill username field with " + username,
                Enter.theValue(username)
                        .into(SauceDemoPage.USERNAME_FIELD)
        );
    }

    public static Performable fillPasswordSauceDemoFieldWithValue(String username) {
        return Task.where("{0} fill username field with " + username,
                Enter.theValue(username)
                        .into(SauceDemoPage.PASSWORD_FIELD)
        );
    }

    public static Performable clickLoginButtonSauceDemo () {
        return Task.where("{0} click login saucedemo button",
                Click.on(SauceDemoPage.LOGIN_BUTTON)
        );
    }

    public static Performable clickCartBackpack () {
        return Task.where("{0} click cart backpack",
                Click.on(SauceDemoPage.CART_BACKPACK)
        );
    }

    public static Performable clickCartBikeLight () {
        return Task.where("{0} click cart bikelight",
                Click.on(SauceDemoPage.CART_BIKE)
        );
    }

    public static Performable clickCartTshirt () {
        return Task.where("{0} click cart tshirt",
                Click.on(SauceDemoPage.CART_TSHIRT)
        );
    }

    public static Performable clickCartFleeceJacket () {
        return Task.where("{0} click cart fleece jacket",
                Click.on(SauceDemoPage.CART_JACKET)
        );
    }

    public static Performable clickCartOnesie () {
        return Task.where("{0} click cart onesie",
                Click.on(SauceDemoPage.CART_ONESIE)
        );
    }

    public static Performable clickCartTshirtRed () {
        return Task.where("{0} click cart tshirt red",
                Click.on(SauceDemoPage.CART_TSHIRT_RED)
        );
    }

    public static Performable clickCartButton() {
        return Task.where("{0} click cart button",
                Click.on(SauceDemoPage.CART_BUTTON)
        );
    }

    public static Performable clickCartButtonError() {
        return Task.where("{0} click cart button seems error",
                Click.on(SauceDemoPage.CART_BUTTON_ERROR)
        );
    }

    public static Performable clickCheckoutButton() {
        return Task.where("{0} click checkout button",
                Click.on(SauceDemoPage.CHECKOUT_BUTTON)
        );
    }

    public static Performable fillFirstNameSauceDemoFieldWithValue(String username) {
        return Task.where("{0} fill firstname field with " + username,
                Enter.theValue(username)
                        .into(SauceDemoPage.FIRST_FIELD)
        );
    }

    public static Performable fillLastNameSauceDemoFieldWithValue(String username) {
        return Task.where("{0} fill lastname field with " + username,
                Enter.theValue(username)
                        .into(SauceDemoPage.LAST_FIELD)
        );
    }

    public static Performable fillZipSauceDemoFieldWithValue(String username) {
        return Task.where("{0} fill zip field with " + username,
                Enter.theValue(username)
                        .into(SauceDemoPage.ZIP_FIELD)
        );
    }

    public static Performable clickContinueButton() {
        return Task.where("{0} click continue button",
                Click.on(SauceDemoPage.CONTINUE_BUTTON)
        );
    }

    public static Performable clickFinishButton() {
        return Task.where("{0} click finish button",
                Click.on(SauceDemoPage.FINISH_BUTTON)
        );
    }

    //DIBAWAH DO AN ACTION SEPULSA//

    public static Performable clickLoginButtonSepulsa () {
        return Task.where("{0} click beli pulsa button",
                Click.on(SepulsaPage.LOGIN_BUTTON)
        );
    }

    public static Performable fillEmailFieldWithValue(String email) {
        return Task.where("{0} fill email field with " + email,
                Enter.theValue(email)
                        .into(SepulsaPage.EMAIL_FIELD)
        );
    }

    public static Performable fillPasswordSepulsaFieldWithValue(String passwordsepulsa) {
        return Task.where("{0} fill password field with " + passwordsepulsa,
                Enter.theValue(passwordsepulsa)
                        .into(SepulsaPage.PASSWORD_FIELD)
        );
    }

    public static Performable clickSubmitLoginButton() {
        return Task.where("{0} click Submit Login button",
                Click.on(SepulsaPage.LOGIN_SUBMIT_BUTTON)
        );
    }

    public static Performable clickPulsaButton() {
        return Task.where("{0} click beli pulsa button",
                Click.on(SepulsaPage.PULSA_BUTTON)
        );
    }

    public static Performable fillNomorHPWithValue(String nomorHp) {
        return Task.where("{0} fill nominal pulsa with " + nomorHp,
                Enter.theValue(nomorHp)
                        .into(SepulsaPage.NOMOR_HP_FIELD)
        );
    }


    public static Performable choosePulsa5rb() {
        return Task.where("{0} choose pulsa 5rb",
                Click.on(SepulsaPage.PULSA_5000)
        );
    }

    public static Performable choosePulsa10rb() {
        return Task.where("{0} choose pulsa 10rb",
                Click.on(SepulsaPage.PULSA_10000)
        );
    }

    public static Performable choosePulsa15rb() {
        return Task.where("{0} choose pulsa 15rb",
                Click.on(SepulsaPage.PULSA_15000)
        );
    }

    public static Performable choosePulsa20rb() {
        return Task.where("{0} choose pulsa 20rb",
                Click.on(SepulsaPage.PULSA_20000)
        );
    }

    public static Performable choosePulsa25rb() {
        return Task.where("{0} choose pulsa 25rb",
                Click.on(SepulsaPage.PULSA_25000)
        );
    }

    public static Performable choosePulsa30rb() {
        return Task.where("{0} choose pulsa 30rb",
                Click.on(SepulsaPage.PULSA_30000)
        );
    }

}
