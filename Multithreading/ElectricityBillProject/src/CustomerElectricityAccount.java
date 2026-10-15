public class CustomerElectricityAccount
        implements ElectricityAccount {

    private long customerId;
    private String customerName;
    private double balance;

    public CustomerElectricityAccount(
            long customerId,
            String customerName,
            double balance) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.balance = balance;
    }

    @Override
    public synchronized void recharge(double amount)
            throws InvalidPaymentException {

        if (amount <= 0) {
            throw new InvalidPaymentException(
                    "Amount cannot be zero or negative");
        }

        this.balance = this.balance + amount;

        System.out.println(
                customerName + " recharged Rs."
                        + amount + " successfully");
    }

    @Override
    public synchronized void payBill(double amount)
            throws InvalidPaymentException,
                   InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidPaymentException(
                    "Amount cannot be zero or negative");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    customerName + " has insufficient balance");
        }

        this.balance = this.balance - amount;

        System.out.println(
                customerName + " paid bill of Rs."
                        + amount + " successfully");
    }

    @Override
    public synchronized void checkBalance() {

        System.out.println(
                "Customer ID: " + customerId
                        + " | Name: " + customerName
                        + " | Balance: Rs." + balance);
    }
}