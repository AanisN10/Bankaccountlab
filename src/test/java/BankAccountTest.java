import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {


    @BeforeEach
    public void setUp(){
        BankAccount currentAccount = new BankAccount(
                "Aanis",
                "Nuur",
                LocalDate.of(29,8,29),
                30000000);

    }





    // practice test to check whether it works
    @Test
    void test1(){
        assertThat("actual").isEqualTo("expected");
    }

    // worked

    @Test

    public void testGandS(){
        //Given this
        BankAccount currentAccount = new BankAccount(
                "Aanis",
                "Nuur",
                LocalDate.of(29,8,29),
                30000000);

        //when

        String result = currentAccount.getFirstName();
        String result2 = currentAccount.getLastName();
        LocalDate result3 = currentAccount.getDateOfBirth();
        int result4 = currentAccount.getAccountNumber();
        Double result5 = currentAccount.getBalance();




        //then
        String expected =currentAccount.setFirstName("Aanis");
        currentAccount.setLastName("Nuur");
        currentAccount.setDateOfBirth(LocalDate.of(26,8,29));
        currentAccount.setAccountNumber(1000000);
        currentAccount.setBalance(100.00);


        assertThat().isEqualTo();
        assertThat(currentAccount.getLastName()).isEqualTo("Nuur");
        assertThat(currentAccount.getDateOfBirth()).isEqualTo(LocalDate.of(26,8,29));
        assertThat(currentAccount.getAccountNumber()).isEqualTo("1000000");
        assertThat(currentAccount.getBalance()).isEqualTo("100.00");



    }

    // worked!

    // deposit test
    @Test
    public void depositTest(){

        //Given
        BankAccount currentAccount = new BankAccount(
                "Aanis",
                "Nuur",
                LocalDate.of(29, 8, 29),
                30000000);

        //when

        currentAccount.addDeposit(100.00);
        double result = currentAccount.getBalance();

        //then

        Double expected = 100.00;
        assertThat(result).isEqualTo(expected);

    }

// withdraw test
    @Test

    public void withdrawTest(){

        //Given

        BankAccount currentAccount = new BankAccount(
                "Aanis",
                "Nuur",
                LocalDate.of(29, 8, 29),
                30000000);


        //when
        currentAccount.addDeposit(1000);
        currentAccount.withdrawMoney(20);
        Double result = currentAccount.getBalance();

        //then

        Double expected =  980.00;
        assertThat(result).isEqualTo(expected);


    }


    @Test

    public void testPayInterest(){

        //Given

        BankAccount currentAccount = new BankAccount(
                "Aanis",
                "Nuur",
                LocalDate.of(29, 8, 29),
                30000000);

        //when

        currentAccount.addDeposit(1000.00);
        currentAccount.payInterest(0.05);
        Double result = currentAccount.getBalance();

        //then

        Double expected = 1050.00;
        assertThat(result).isEqualTo(expected);

    }







}



