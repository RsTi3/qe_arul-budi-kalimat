package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.NamedUrl;

public class NavigateTo {

    public static Performable theLinkedInLandingPage() {
        return Task.where("{0} opens the LinkedIn landing page",
                Open.browserOn().the(LinkedInPage.class));
    }

    public static Performable theSepulsaHomePage() {
        return Task.where("{0} opens the Sepulsa home page",
                Open.browserOn().the(SepulsaPage.class));
    }

//    public static Performable theSepulsaLoginPage() {
//        return Task.where("{0} opens the Sepulsa Login page",
//                Open.browserOn().the("https://www.sepulsa.com/signin"));
}