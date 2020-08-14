package Registration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Deposit {
    Main main = new Main();
    Buttons button = new Buttons();
    DepositCredentials creds = new DepositCredentials();



    public void onlineBanking() {
        Selenide.open(main.portal);
        $(button.depositButton).click();

        $(button.depositHeader).shouldBe(visible);
        if ($(button.backToDepositsMethodsButton).isDisplayed()) {
            $(button.backToDepositsMethodsButton).click();
        }
        $(button.onlineBankingButton).click();
        $(button.onlineBankingDemoBankButton).shouldBe(visible).click();
        $(button.onlineBankingWarningConfirm).shouldBe(visible).click();
        $(button.onlineBankingUserField).setValue("ODMEN");
        $(button.onlineBankingPassField).setValue("POROL");
        $(button.onllineBankingContiniueButton1).click();
        $(button.onllineBankingContiniueButton2).shouldBe(visible).click();
        $(button.onllineBankingContiniueButton3).shouldBe(visible).click();
        $(button.onlineBankingFinishHeader).shouldHave(text("Payment Receipt"));

    }
}