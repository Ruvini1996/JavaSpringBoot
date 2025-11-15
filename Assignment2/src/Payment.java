import java.util.UUID;

public abstract class Payment implements Payable {
    double amount;
    String currency;
    String status;
    String referenceId;

    public Payment(double amount, String currency, String status) {
        this.amount = amount;
        this.currency = currency;
        this.status = status;
        this.referenceId = "TXN-" + UUID.randomUUID().toString().substring(0, 8);
    }

    // to process the payment
    public abstract void processPayment();

    //to validate the payment
    public abstract boolean validate();

    public void generateReceipt() {
        System.out.println("PAYMENT RECEIPT FOR REFERENCE ID :" + referenceId);
        System.out.println("Amount: " + amount + " " + currency);
        System.out.println("Status : " + status);
        System.out.println("Thank you for shopping with us.");
    }


    public String getReference() {
        referenceId = UUID.randomUUID().toString();
        System.out.println("Reference ID: " + referenceId);
        return referenceId;
    }


    public void markAsCompleted() {
        status = "Completed";
        System.out.println(status);

    }
}