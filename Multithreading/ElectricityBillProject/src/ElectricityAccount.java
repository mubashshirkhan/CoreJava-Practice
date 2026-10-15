public interface ElectricityAccount {

    void recharge(double amount)
            throws InvalidPaymentException;

    void payBill(double amount)
            throws InvalidPaymentException,
                   InsufficientBalanceException;

    void checkBalance();
}