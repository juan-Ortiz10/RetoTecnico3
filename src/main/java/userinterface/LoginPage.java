package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USER_INPUT = Target.the("input to write the username").located(By.id("Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I"));
    public static final Target PASS_INPUT = Target.the("input to write the password").located(By.id("Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I"));
    public static final Target ENTER_BUTTON = Target.the("button to log in").located(By.xpath("//a[@class='dx dxalink']"));
}
