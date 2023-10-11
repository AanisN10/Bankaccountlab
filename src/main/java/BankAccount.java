import java.rmi.registry.LocateRegistry;
import java.time.LocalDate;

public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountNumber;

    private double balance;
    private LocalDate dateOfBirth;


        public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber= accountNumber;
        this.balance = 0.00;
    }



    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;}

    public void setBalance(double balance) {
    this.balance = balance;
    }


    // deposit & withdraw

    public void addDeposit(double amount){
        this.balance+=amount;
    }

    public void withdrawMoney(double amount){
        this.balance-=amount;
    }

}






