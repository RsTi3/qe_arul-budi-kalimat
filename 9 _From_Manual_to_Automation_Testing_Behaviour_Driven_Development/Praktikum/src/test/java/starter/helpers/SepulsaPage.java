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
    public static Target PULSA_40000 = Target.the("pulsa 40rb button").located(By.id("TRI Rp40.000"));
    public static Target PULSA_50000 = Target.the("pulsa 50rb button").located(By.xpath("//div[@id='TRI Rp50.000']"));
    public static Target PULSA_60000 = Target.the("pulsa 60rb button").located(By.xpath("//div[@id='TRI Rp60.000']"));
    public static Target PULSA_70000 = Target.the("pulsa 70rb button").located(By.xpath("//div[@id='TRI Rp70.000']"));
    public static Target PULSA_80000 = Target.the("pulsa 80rb button").located(By.xpath("//div[@id='TRI Rp80.000']"));
    public static Target PULSA_90000 = Target.the("pulsa 90rb button").located(By.xpath("//div[@id='TRI Rp90.000']"));
    public static Target PULSA_100000 = Target.the("pulsa 100rb button").located(By.xpath("//div[@id='Tri Rp100.000']"));
    public static Target PULSA_200000 = Target.the("pulsa 200rb button").located(By.xpath("//div[@id='Tri Rp200.000']"));
    public static Target PULSA_300000 = Target.the("pulsa 300rb button").located(By.xpath("//div[@id='Tri Rp300.000']"));
    public static Target PULSA_500000 = Target.the("pulsa 500rb button").located(By.xpath("//div[@id='Tri Rp500.000']"));
    public static Target TOTAL_PEMBAYARAN = Target.the("text total checkout").located(By.xpath("//p[@id='total_checkout']"));
    public static Target LAINNYA_BUTTON = Target.the("button lainnya").located(By.xpath("//div[@id='Lainnya']"));
    public static Target INDIHOME = Target.the("button lainnya").located(By.id("product_type_3"));
    public static Target FIELD_INDIHOME = Target.the("fill langganan").located(By.id("'input_id_telkom"));
    public static Target FIELD_INDIHOME_BAYAR = Target.the("chose button bayar").located(By.xpath("//button[@id='submit_id_telkom']"));
    public static Target CHECKOUT_INDIHOME_BAYAR = Target.the("checkout indihome bayar").located(By.id("checkout_telkom"));
}
