import java.time.LocalDate;

public class Expense {
    private String label;
    private double amount;
    private LocalDate date;
    public Expense(String label, double amount, LocalDate date) {
        this.label = label;
        this.amount = amount;
        this.date = date;
    }

    public Expense() {
        this.label = "pas de dépense";
        this.amount = 0.0;
    }

    public String getLabel() {
        return label;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isLargeExpense() {
        return amount > 100.0;
    }

    @Override
    public String toString() {
        return amount + "dépenser dans" + label;
    };



}
