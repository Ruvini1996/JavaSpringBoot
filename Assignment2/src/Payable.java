public interface Payable {
    //to validate the payment
    boolean validate();
    // get payment reference id
    String getReference();
}
