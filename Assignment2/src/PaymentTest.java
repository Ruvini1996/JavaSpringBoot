public class PaymentTest {
    public static void main(String[] args) {
        Payment payment1 = new CashOnDelivery(1500, "LKR", "Pending", "No. 10, Colombo");
        Payment payment2 = new BankTransfer(5000, "USD", "Completed", "BOC", "123456789");
        Payment payment3 = new CreditCardPayment(10000, "LKR", "Successful", "1111222233334444", "Ruvini", "2026-12-01", 50000);
        Payment payment4 = new DebitCardPayment(8000, "LKR", "Successful", "5555666677778888", "Ruvini", "2027-05-01", 20000);

        System.out.println("01. Testing Cash on Delivery");
        System.out.println();
        payment1.validate();
        System.out.println();
        payment1.processPayment();
        System.out.println();
        payment1.generateReceipt();
        System.out.println();

        System.out.println("02. Testing Bank Transfer");
        System.out.println();
        payment2.validate();
        System.out.println();
        payment2.processPayment();
        System.out.println();
        payment2.generateReceipt();
        System.out.println();
        System.out.println();

        System.out.println("03. Testing Credit Card Payment");
        System.out.println();
        payment3.validate();
        System.out.println();
        payment3.processPayment();
        System.out.println();
        payment3.generateReceipt();
        System.out.println();
        System.out.println();

        System.out.println("04. Testing Debit Card Payment");
        System.out.println();
        payment4.validate();
        System.out.println();
        payment4.processPayment();
        System.out.println();
        payment4.generateReceipt();
        System.out.println();

    }
}

