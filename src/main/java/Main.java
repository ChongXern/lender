public class Main {
    static int[] amounts = new int[100];
    static String[] borrowers = new String[100];
    static boolean[] isPaid = new boolean[100];
    static double[] interestRates = new double[100];
    static String[] contactNumbers = new String[100];
    static int loansCount = 0;

    public static void addLoan(String borrower, int amount, double interestRate, String contactNumber) {
        borrowers[loansCount] = borrower;
        amounts[loansCount] = amount;
        interestRates[loansCount] = interestRate;
        contactNumbers[loansCount] = contactNumber;
        loansCount++;
    }

    public static void setAsPaid(String borrower) {
        for (int i = 0; i < loansCount; i++) {
            if (borrowers[i].equals(borrower)) {
                isPaid[i] = true;
            }
        }
    }

    public static void listLoans() {
        for (int i = 0; i < loansCount; i++) {
            if (!isPaid[i]) {
                System.out.println(borrowers[i] + ": " + amounts[i]);
            }
        }
    }

    public static double calculateProfitEarned() {
        double profit = 0;
        for (int i = 0; i < loansCount; i++) {
            // if the loan was repaid, add the interest to profit
            if (isPaid[i]) {
                profit = profit + (amounts[i] * interestRates[i]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        addLoan("Alice Betsy", 100, 0.1, "48201200");
        addLoan("Ben Che", 50, 0.2, "83911182");
        addLoan("Chris Davis", 30, 0.3, "84928466");
        setAsPaid("Ben Che");
        listLoans();
        System.out.println("profit: " + calculateProfitEarned());

        Loan newLoan = new Loan("Alice Betsy", 100, 0.1, "2"); // Java automatically creates constructor

    }
}
