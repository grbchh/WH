package Tools;

import static com.codeborne.selenide.Selenide.*;


public class RandomNumberGenerator {

    public String phoneNumber() {
        int a = 1111111111;
        int b = 999999999;
        int c = a + (int) (Math.random() * b);
        String PhoneNumber =String.valueOf(c);
        return PhoneNumber;
    }

    public String routingNumber() {
        int a = 1111111111;
        int b = 999999999;
        int c = (a + (int) (Math.random() * b))+(a + (int) (Math.random() * b));
        String routingNumbers =String.valueOf(c);
        return routingNumbers;
    }

    public String Email() {
        int a = 0;
        int b = 99999;
        int first = a + (int) (Math.random() * b);
        String randomNumber =String.valueOf(first);
        return randomNumber;

    }
    public String driverLicense() {
        int a = 11111111;
        int b = 99999999;
        int first = a + (int) (Math.random() * b);
        String randomNumber =String.valueOf(first);

        return randomNumber;
}}





