public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;



    public Account() {
        this("56789",
            2.50,
            "Default Name",
            "Default Address",
            "Default Phone");
        System.out.println("Empty constructor called.");
    }

    public Account(String accountNumber, double balance, String name, String email, String phone) {
        System.out.println("Account constructor has been called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Account(String name, String email, String phone) {
        this("99999", 100.55, name, email, phone);
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount <= 0) {
            System.out.println(("Only $" + balance + " available. Withdrawal failed"));
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal $" + withdrawalAmount + " processed. In account, $" + balance + " amount is left");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}