import org.junit.Test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.*;

public class Registration_NJ_GPT {
RNG rng = new RNG();
Links linkTo = new Links();

    @Test
    public void Registration() {
        open(linkTo.NjGPT);
        sleep(5000);
        $(".neoGamesRegister").shouldBe(enabled).click();
        $("#firstname").setValue("JENNIFER");
        $("#lastName").setValue("SPOTTS");
        rng.Email();
        $("#birthdayMonth > option:nth-child(7)").click();
        $("#birthdayDay > option:nth-child(18)").click();
        $("#birthdayYear > option:nth-child(50)").click();
        rng.PhoneNumber();
        System.out.println($("#email").getValue());
        $("button.mwc-primary-button:nth-child(1)").click();

        $("#password").setValue("test1234");

        $("div.mwc-security-questions-row:nth-child(1) > div:nth-child(1) > select:nth-child(1) > option:nth-child(6)").click();
        $("#answerSecurityQs0").setValue("Volvo 262 Coupe");

        $("select.ng-empty > option:nth-child(8)").click();
        $("#answerSecurityQs1").setValue("Institut Le Rosey");

        $("div.mwc-reg-form-field:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)").setValue("9118");

        $("#address").setValue("820 FORTY NINER AVE APT E");
        $("#city").setValue("CHARLOTTE");
        $("#zipCode").setValue("28262");
        $("mwc-reg-terms-wh.mwc-reg-info > mwc-checkbox:nth-child(1) > label:nth-child(1) > i:nth-child(2)").click();
        $("mwc-reg-personal-info.mwc-reg-info > mwc-checkbox:nth-child(1) > label:nth-child(1) > i:nth-child(2)").click();
        $("mwc-min-age-wh.mwc-reg-info > mwc-checkbox:nth-child(1) > label:nth-child(1) > i:nth-child(2)").click();
        $("mwc-privacy-policy-wh.mwc-reg-info > mwc-checkbox:nth-child(1) > label:nth-child(1) > i:nth-child(2)").click();
        $("button.mwc-primary-button:nth-child(1)").click();
        sleep(5000);
        $(".mwc-reg-step3-footer-web > mwc-reg-step3-footer-area-wh:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)").click();
        $(".mwc-btn-close-widget > span:nth-child(1)").shouldBe(enabled).click();

    }
}
