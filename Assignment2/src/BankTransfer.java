public class BankTransfer extends Payment{
    String bankName;
    String accountNumber;


    public BankTransfer(double amount, String currency, String status, String bankName, String accountNumber) {
        super(amount, currency, status);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean validate() {
        if (amount > 0) {
            System.out.println("Your Order Validation successful.");
            return true;
        } else {
            System.out.println("Invalid order amount!");
            return false;
        }
    }

    @Override
    public void processPayment() {
        System.out.println("Processing the payment");
        System.out.println("Bank : " + bankName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Reference ID : "+referenceId);
    }
    @Override
    public void generateReceipt() {
        System.out.println("We will send you a payment receipt via email within 24 hours , after verifying the payment. ");
        System.out.println("Thank you for shopping with us.");
    }
}
