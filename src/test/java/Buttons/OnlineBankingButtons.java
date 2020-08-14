package Buttons;

public class OnlineBankingButtons {
    private String depositHeader = ".mwc-header-web";
    private String backToDepositsMethodsButton = "a.ng-binding";
    private String depositButton = "button.Button:nth-child(2) > span:nth-child(1)";
    private String onlineBankingButton = "mwc-cashier-list-item.mwc-cashier-list-pm-thumb-container:nth-child(1) > div:nth-child(2)";
    private String WarningConfirm = "#slider-button";
    private String DemoBankButton = "#lbx-listBank-select200005501 > div:nth-child(1) > div:nth-child(1)";
    private String UserField = "#lbx-formAuthenticate-inputusername";
    private String PassField = "#lbx-formAuthenticate-inputpassword";
    private String ContiniueButton1 = "#lbx-formLogin-submit";
    private String ContiniueButton2 = "#lbx-accountList-submit";
    private String ContiniueButton3 = "#submitDepositForm";
    private String FinishHeader = ".mwc-cashier-success-receipt-panel-title";

    public String getDepositHeader() {
        return depositHeader;
    }

    public String getOnlineBankingButton() {
        return onlineBankingButton;
    }

    public String getWarningConfirm() {
        return WarningConfirm;
    }

    public String getDemoBankButton() {
        return DemoBankButton;
    }

    public String getUserField() {
        return UserField;
    }

    public String getPassField() {
        return PassField;
    }

    public String getContiniueButton1() {
        return ContiniueButton1;
    }

    public String getContiniueButton2() {
        return ContiniueButton2;
    }

    public String getContiniueButton3() {
        return ContiniueButton3;
    }

    public String getFinishHeader() {
        return FinishHeader;
    }

    public String getBackToDepositsMethodsButton() {
        return backToDepositsMethodsButton;
    }

    public String getDepositButton() {
        return depositButton;
    }
}
