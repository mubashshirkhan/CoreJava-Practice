public class BillPaymentThread extends Thread {

    private ElectricityAccount acc;
    private double amount;

    public BillPaymentThread(
            ElectricityAccount acc,
            double amount) {

        this.acc = acc;
        this.amount = amount;
    }

    @Override
    public void run() {

        try {
            acc.payBill(amount);
        }
        catch (InvalidPaymentException |
               InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}