public class ElectricityBillProject {

    public static void main(String[] args)
            throws InterruptedException {

        // Creating customer accounts
        CustomerElectricityAccount acc1 =
                new CustomerElectricityAccount(
                        4001L, "Mubashshir Khan", 2000);

        CustomerElectricityAccount acc2 =
                new CustomerElectricityAccount(
                        2001L, "Sohel Husain", 3000);

        CustomerElectricityAccount acc3 =
                new CustomerElectricityAccount(
                        3001L, "Sheikh Danish", 22000);

        // Display initial balances
        System.out.println("===== INITIAL BALANCES =====");

        acc1.checkBalance();
        acc2.checkBalance();
        acc3.checkBalance();

        // Creating recharge threads
        RechargeThread rch1 =
                new RechargeThread(acc1, 2000);

        RechargeThread rch2 =
                new RechargeThread(acc2, 1500);

        RechargeThread rch3 =
                new RechargeThread(acc3, 3000);

        // Starting recharge threads
        rch1.start();
        rch2.start();
        rch3.start();

        // Pausing the main thread for 5 seconds
        Thread.sleep(5000);

        // Display balances after recharge
        System.out.println("\n===== AFTER RECHARGE =====");

        acc1.checkBalance();
        acc2.checkBalance();
        acc3.checkBalance();

        // Creating bill payment threads
        BillPaymentThread bp1 =
                new BillPaymentThread(acc1, 1000);

        BillPaymentThread bp2 =
                new BillPaymentThread(acc2, 10000);

        // Starting bill payment threads
        bp1.start();
        bp2.start();

        // Pausing the main thread for 5 seconds
        Thread.sleep(5000);

        // Display final balances
        System.out.println("\n===== FINAL BALANCES =====");

        acc1.checkBalance();
        acc2.checkBalance();
        acc3.checkBalance();
    }
}