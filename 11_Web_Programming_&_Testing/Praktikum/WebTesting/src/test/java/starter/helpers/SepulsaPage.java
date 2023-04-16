package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://sepulsa.com")
public class SepulsaPage extends PageObject {

    public static Target LOGIN_SUBMIT_BUTTON = Target.the("login submit button").located(By.xpath("//button[@id='submit_login']"));
    public static Target LOGIN_BUTTON = Target.the("login button").located(By.xpath("//button[@id='button_signin_home']"));
    public static Target EMAIL_FIELD = Target.the("field email").located(By.xpath("//input[@id='email']"));
    public static Target PASSWORD_FIELD = Target.the("field password").located(By.xpath("//input[@id='password']"));
    public static Target PULSA_BUTTON = Target.the("pulsa button").located(By.id("Pulsa"));
    public static Target NOMOR_HP_FIELD = Target.the("field nomor handphone").located(By.id("phone_number"));
    public static Target PULSA_5000 = Target.the("pulsa 5rb button").located(By.xpath("//div[@id='Tri Rp5.000']"));
    public static Target PULSA_10000 = Target.the("pulsa 10rb button").located(By.id("Tri Rp10.000"));
    public static Target PULSA_15000 = Target.the("pulsa 15rb button").located(By.xpath("//div[@id='Tri Rp15.000']"));
    public static Target PULSA_20000 = Target.the("pulsa 20rb button").located(By.xpath("//div[@id='Tri Rp20.000']"));
    public static Target PULSA_25000 = Target.the("pulsa 25rb button").located(By.xpath("//div[@id='Tri Rp25.000']"));
    public static Target PULSA_30000 = Target.the("pulsa 30rb button").located(By.xpath("//div[@id='Tri Rp30.000']"));
    public static Target TOTAL_PEMBAYARAN = Target.the("text total checkout").located(By.xpath("//p[@id='total_checkout']"));
}
