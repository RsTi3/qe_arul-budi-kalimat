package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoAnAction {

    //------------------------------------------DIBAWAH DO AN ACTION SEPULSA------------------------------------------//

    public static Performable fillUsernameFieldWithValue(String username) {
        return Task.where("{0} fill username field with " + username,
                Enter.theValue(username)
                        .into(LinkedInPage.USERNAME_FIELD)
        );
    }

    public static Performable fillPasswordFieldWithValue(String password) {
        return Task.where("{0} fill password field with " + password,
                Enter.theValue(password)
                        .into(LinkedInPage.PASSWORD_FIELD)
        );
    }



    public static Performable fillFieldPost (String post) {
        return Task.where("{0} fill post field with" + post,
                Enter.theValue(post)
                        .into(LinkedInPage.POST_FIELD)
        );
    }

    public static Performable clickSignInButton() {
        return Task.where("{0} click sign in button",
                Click.on(LinkedInPage.SIGN_IN_BUTTON)
        );
    }

    public static Performable clickPostButton() {
        return Task.where("{0} click Post button",
                Click.on(LinkedInPage.POST_BUTTON)
        );
    }

    public static Performable clickPost() {
        return Task.where("{0} click Post",
                Click.on(LinkedInPage.Post)
        );
    }

    //------------------------------------------DIBAWAH DO AN ACTION SEPULSA------------------------------------------//

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

    public static Performable choosePulsa40rb() {
        return Task.where("{0} choose pulsa 40rb",
                Click.on(SepulsaPage.PULSA_40000)
        );
    }

    public static Performable choosePulsa50rb() {
        return Task.where("{0} choose pulsa 50rb",
                Click.on(SepulsaPage.PULSA_50000)
        );
    }

    public static Performable choosePulsa60rb() {
        return Task.where("{0} choose pulsa 60rb",
                Click.on(SepulsaPage.PULSA_60000)
        );
    }

    public static Performable choosePulsa70rb() {
        return Task.where("{0} choose pulsa 70rb",
                Click.on(SepulsaPage.PULSA_70000)
        );
    }

    public static Performable choosePulsa80rb() {
        return Task.where("{0} choose pulsa 80rb",
                Click.on(SepulsaPage.PULSA_80000)
        );
    }

    public static Performable choosePulsa90rb() {
        return Task.where("{0} choose pulsa 90rb",
                Click.on(SepulsaPage.PULSA_90000)
        );
    }

    public static Performable choosePulsa100rb() {
        return Task.where("{0} choose pulsa 100rb",
                Click.on(SepulsaPage.PULSA_100000)
        );
    }

    public static Performable choosePulsa200rb() {
        return Task.where("{0} choose pulsa 200rb",
                Click.on(SepulsaPage.PULSA_200000)
        );
    }

    public static Performable choosePulsa300rb() {
        return Task.where("{0} choose pulsa 300rb",
                Click.on(SepulsaPage.PULSA_300000)
        );
    }

    public static Performable choosePulsa500rb() {
        return Task.where("{0} choose pulsa 500rb",
                Click.on(SepulsaPage.PULSA_500000)
        );
    }
    public static Performable chooseButtonLainnya() {
        return Task.where("{0} choose button lainnya",
                Click.on(SepulsaPage.LAINNYA_BUTTON)
        );
    }
    public static Performable userIndihomeButton() {
        return Task.where("{0} choose button indihome",
                Click.on(SepulsaPage.INDIHOME)
        );
    }
    public static Performable fillLanggananFieldWithValue(String nomor) {
        return Task.where("{0} fill Langganan " + nomor,
                Click.on(SepulsaPage.FIELD_INDIHOME)
        );
    }
    public static Performable choseIndihomeBayarButton() {
        return Task.where("{0} Choose button bayar ",
                Click.on(SepulsaPage.FIELD_INDIHOME_BAYAR)
        );
    }
    public static Performable userIndihomeCheckoutButton() {
        return Task.where("{0} Choose button bayar checkout ",
                Click.on(SepulsaPage.CHECKOUT_INDIHOME_BAYAR)
        );
    }

}
