package DepositFlows;

import Buttons.CreditCardButtons;
import RunTests.RunTests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CreditCardDeposit {
    RunTests portal = new RunTests();
    CreditCardButtons button = new CreditCardButtons();

    public void CC() {
        $(button.getDepositHeader()).shouldBe(visible);
        if ($(button.getBackToDepositsMethodsButton()).isDisplayed()) {
            $(button.getBackToDepositsMethodsButton()).click();
        }
        Selenide.open(portal.getLink());
        $("button.Button:nth-child(2) > span:nth-child(1)").shouldBe(enabled).click();
        $("mwc-cashier-list-item.mwc-cashier-list-pm-thumb-container:nth-child(2)")
                .shouldBe(Condition.enabled).click();
        $("#AccountName").setValue("Default Test User");
        $("#AccountNo").setValue("4043883547195057");
    }
}