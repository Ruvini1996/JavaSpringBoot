public interface Discount {
    // Applies a percentage discount and returns the new discounted amount
    double applyDiscount(double percent);

    // Returns the final amount to be paid after discount
    double finalAmount();
}

