package DepositFlows;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import Buttons.AchButtons;
import Credentials.ACHDepositCredentials;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class ACHDeposit {
    AchButtons button = new AchButtons();


    public void ACH() {
        ACHDepositCredentials creds = new ACHDepositCredentials();

        Selenide.open(main.portal);
        $(button.getDepositButton()).click();

        $(button.getDepositHeader()).shouldBe(visible);
        if ($(button.getBackToDepositsMethodsButton()).isDisplayed()) {
            $(button.getBackToDepositsMethodsButton()).click();
        }
        $(button.getAchPaymentButton())
                .shouldBe(Condition.enabled).click();
        $(button.getRoutingNumberField()).shouldBe(Condition.enabled).setValue(creds.getRoutingNumber());
        $(button.getAccountNumber()).setValue(creds.getAccountNumber()); // Account Number
        $(button.getSsnField1()).setValue(creds.getSsn1()); // SSN
        $(button.getSsnField2()).setValue(creds.getSsn2());
        $(button.getDriverLicenseField()).setValue(creds.getDriverLicense());  //Driver License
        $("#DocumentIssuePlace").click();
        $("#DocumentIssuePlace > option:nth-child(47)").click(); // State (VA)
        $(button.getAgreementCheckbox()).click(); // checkbox
        $("#submitDepositForm").click(); // Click on "Continiue"
        $("#summarySubmitDepositForm").shouldBe(Condition.enabled).click(); // And finally, submit
        sleep(10000);
        $(".mwc-section-title--header-web").shouldBe(Condition.visible).shouldHave(Condition.text("Confirmed"));
    }

}
