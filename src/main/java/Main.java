
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        BankAccount currentAccount = new BankAccount("Aanis","Nuur",LocalDate.of(29,8,29), 30000000);

        String accountFirstName = currentAccount.getFirstName();
        System.out.println("First name "+ accountFirstName);

        String accountLastname= currentAccount.getLastName();
        System.out.println("Last name :  " + accountLastname);

        LocalDate accountDOB = currentAccount.getDateOfBirth();
        System.out.println("DOB :  " + accountDOB);

        int accoundID = currentAccount.getAccountNumber();
        System.out.println("account number : " + accoundID);

        //when you deposit

        currentAccount.addDeposit(1);
        double currentBalance = currentAccount.getBalance();
        System.out.println("This is your current balance in your account after you have deposited : £" + currentBalance);


        //when you withdraw

        currentAccount.withdrawMoney(1111);
        System.out.println("This is your current balance in your account after you have widthdrawn : £" + currentBalance);


    }
}
