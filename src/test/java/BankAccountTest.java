import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {



    BankAccount currentAccount = new BankAccount();

    void setup() {
        var currentAccount = new BankAccount(
                currentAccount.getFirstName(),
                currentAccount.getLastName(),
                currentAccount.getDateOfBirth(),
                currentAccount.getAccountNumber()
        );
    }


    @Test

    void test1() {
        assertThat(1.00).isEqualTo(1.00);

    }

    void addDeposit() {

//        then
        double result = currentAccount.getBalance();

//        when

        double expected = 100.00;

        assertThat(result).isEqualTo(expected);

    }




}



