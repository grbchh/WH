package DepositFlows;


import Registration.Main;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CreditCardDeposit {
    Main main = new Main();

    public void CC() {
        $(button.getDepositHeader()).shouldBe(visible);
        if ($(button.backToDepositsMethodsButton).isDisplayed()) {
            $(button.backToDepositsMethodsButton).click();
        }
        Selenide.open(main.portal);
        $("button.Button:nth-child(2) > span:nth-child(1)").shouldBe(enabled).click();
        $("mwc-cashier-list-item.mwc-cashier-list-pm-thumb-container:nth-child(2)")
                .shouldBe(Condition.enabled).click();
        $("#AccountName").setValue("Default Test User");
        $("#AccountNo").setValue("4043883547195057");
    }
}