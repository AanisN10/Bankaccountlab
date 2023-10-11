import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount currentAccount;

    @BeforeEach
    public void setup() {
        currentAccount = new BankAccount(
                currentAccount.getFirstName(),
                currentAccount.getLastName(),
                currentAccount.getDateOfBirth(),
                currentAccount.getAccountNumber()
        );
    }

    @BeforeEach

    void setup(){

        deposit = new BankAccountTest();

    }




    @Test
    void whenDeposit() {

        double result = deposit.getBalance();

        double expected = 100.00;

        assertThat(result).isEqualTo(expected);

    }

    void test1() {
        assertThat(1.00).isEqualTo(1.00);

    }


}



