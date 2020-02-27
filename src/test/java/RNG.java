import static com.codeborne.selenide.Selenide.*;

public class RNG {


        public void PhoneNumber(){
            int a = 1111111; 
            int b = 9999999;
            int PhoneNumber = a + (int) (Math.random() * b);
            $("#cellPhone").setValue("951" + PhoneNumber);
          //
        }

        public void Pn (int random_number1){
            return;
        }

        public void Email() {
            int a = 0;
            int b = 99999;
            String randomNumber;
            int random_number2 = a + (int) (Math.random() * b);

            $("#email").setValue("qa_sasha" + random_number2 + "@ng.ua");
        }
}
