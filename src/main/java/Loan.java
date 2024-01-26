public class Loan {
    private int amount;
    private String borrower;
    private Boolean isPaid;
    private double interestRate;

    private String contactNumber;
    static public double maxLoanAmount;

    public static double getMaxLoanAmount() {
        return maxLoanAmount;
    }

    // Command N to automatically create Constructor, then make adjustments accordingly
    public Loan(String borrower, int amount, double interestRate, String contactNumber) {
        this.amount = amount;
        this.borrower = borrower;
        this.isPaid = false;
        this.interestRate = interestRate;
        this.contactNumber = contactNumber;
    }

    // Accessors


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
