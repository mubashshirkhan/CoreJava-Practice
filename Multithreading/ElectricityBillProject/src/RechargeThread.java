public class RechargeThread extends Thread {

    private ElectricityAccount acc;
    private double amount;

    public RechargeThread(
            ElectricityAccount acc,
            double amount) {

        this.acc = acc;
        this.amount = amount;
    }

    @Override
    public void run() {

        try {
            acc.recharge(amount);
        }
        catch (InvalidPaymentException e) {
            System.out.println(e.getMessage());
        }
    }
}