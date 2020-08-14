package Credentials;

import Tools.RandomNumberGenerator;

public class ACHDepositCredentials {
    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    private String routingNumber = "107002312";
    private String accountNumber = randomNumberGenerator.routingNumber() + randomNumberGenerator.routingNumber();
    private String ssn1 = randomNumberGenerator.Email();
    private String ssn2 = randomNumberGenerator.Email();
    private String driverLicense = "D" + randomNumberGenerator.driverLicense();
    private String address = "820 FORTY NINER AVE APT E";
    private String city = "CHARLOTTE";
    private String zipCode = "28262";
    private String ssn = "9118";

    public RandomNumberGenerator getRandomNumberGenerator() {
        return randomNumberGenerator;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getSsn1() {
        return ssn1;
    }

    public String getSsn2() {
        return ssn2;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getSsn() {
        return ssn;
    }
}
