package DepositFlows;

import Buttons.OnlineBankingButtons;
import RunTests.RunTests;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class OnlineBankingDeposit {
    public void onlineBanking() {
        RunTests portal = new RunTests();
        OnlineBankingButtons button = new OnlineBankingButtons();

        Selenide.open(portal.getLink());
        $(button.getDepositButton()).click();

        $(button.getDepositHeader()).shouldBe(visible);
        if ($(button.getBackToDepositsMethodsButton()).isDisplayed()) {
            $(button.getBackToDepositsMethodsButton()).click();
        }
        $(button.getOnlineBankingButton()).click();
        $(button.getDemoBankButton()).shouldBe(visible).click();
        $(button.getWarningConfirm()).shouldBe(visible).click();
        $(button.getUserField()).setValue("ODMEN");
        $(button.getPassField()).setValue("POROL");
        $(button.getContiniueButton1()).click();
        $(button.getContiniueButton2()).shouldBe(visible).click();
        $(button.getContiniueButton3()).shouldBe(visible).click();
        $(button.getFinishHeader()).shouldHave(text("Payment Receipt"));

    }
}
