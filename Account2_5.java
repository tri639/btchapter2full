public class Account2_5 {
    private int id;
    private Customer2_5 customer;
    private double balance = 0.0;

    public Account2_5(int id, Customer2_5 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account2_5(int id, Customer2_5 customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }
    public Customer2_5 getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return customer.toString() + "balance = $" + String.format("%.2f", balance);
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public Account2_5 deposit(double amount) {
        balance += amount;
        return this;
    }
    public Account2_5 withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("amount withdraw exceeds the current balance!");
        }
        return this;
    }
}
class testAccount {
    public static void main(String[] args) {
        Customer2_5 customer = new Customer2_5(112,"NguyenDucTri", 'm');
        Account2_5 account = new Account2_5(112,customer, 100.0);
        System.out.println(account);

        account.deposit(100);
        System.out.println("Deposit is: " + account);

        account.withdraw(50);
        System.out.println("Withdraw is: " + account);

        account.withdraw(200);
    }
}
