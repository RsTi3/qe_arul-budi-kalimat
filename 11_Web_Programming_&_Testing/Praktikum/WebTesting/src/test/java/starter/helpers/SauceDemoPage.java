package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class SauceDemoPage extends PageObject {

    public static Target USERNAME_FIELD = Target.the("field username").located(By.xpath("//input[@id='user-name']"));
    public static Target PASSWORD_FIELD = Target.the("field password").located(By.xpath("//input[@id='password']"));
    public static Target LOGIN_BUTTON = Target.the("click login button").located(By.xpath("//input[@id='login-button']"));
    public static Target CART_BACKPACK = Target.the("click cart backpack").located(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
    public static Target CART_BIKE = Target.the("click cart bike").located(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
    public static Target CART_TSHIRT = Target.the("click cart tshirt").located(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
    public static Target CART_JACKET = Target.the("click cart jacket").located(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
    public static Target CART_ONESIE = Target.the("click cart jacket").located(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
    public static Target CART_TSHIRT_RED = Target.the("click cart jacket").located(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
    public static Target CART_BUTTON = Target.the("click cart button").located(By.xpath("//span[contains(text(),'6')]"));
    public static Target CART_BUTTON_ERROR = Target.the("click cart button seems error").located(By.xpath("//span[contains(text(),'3')]"));
    public static Target CHECKOUT_BUTTON = Target.the("click checkout button").located(By.xpath("//button[@id='checkout']"));
    public static Target FIRST_FIELD = Target.the("click checkout button").located(By.xpath("//input[@id='first-name']"));
    public static Target LAST_FIELD = Target.the("click checkout button").located(By.xpath("//input[@id='last-name']"));
    public static Target ZIP_FIELD = Target.the("click checkout button").located(By.xpath("//input[@id='postal-code']"));
    public static Target CONTINUE_BUTTON = Target.the("click continue button").located(By.xpath("//input[@id='continue']"));
    public static Target FINISH_BUTTON = Target.the("click finish button").located(By.xpath("//button[@id='finish']"));
}
