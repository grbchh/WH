package Buttons;

public class AchButtons {
    private String depositButton = "button.Button:nth-child(2) > span:nth-child(1)";
    private String backToDepositsMethodsButton = "a.ng-binding";
    private String achPaymentButton = "mwc-cashier-list-item.mwc-cashier-list-pm-thumb-container:nth-child(3)";
    private String routingNumberField = "#RoutingNo";
    private String accountNumber = "#AccountNo";
    private String ssnField1 = "input.numeric-password:nth-child(1)";
    private String ssnField2 = "input.mwc-form-control:nth-child(2)";
    private String driverLicenseField = "#DriverLicense";
    private String depositHeader = ".mwc-header-web";

    public String getAgreementCheckbox() {
        return agreementCheckbox;
    }

    private String agreementCheckbox = "mwc-checkbox.ng-invalid > label:nth-child(1) > i:nth-child(2)";

    public String getDepositButton() {
        return depositButton;
    }

    public String getBackToDepositsMethodsButton() {
        return backToDepositsMethodsButton;
    }

    public String getAchPaymentButton() {
        return achPaymentButton;
    }

    public String getRoutingNumberField() {
        return routingNumberField;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getSsnField1() {
        return ssnField1;
    }

    public String getSsnField2() {
        return ssnField2;
    }

    public String getDriverLicenseField() {
        return driverLicenseField;
    }

    public String getDepositHeader() {
        return depositHeader;
    }
}
