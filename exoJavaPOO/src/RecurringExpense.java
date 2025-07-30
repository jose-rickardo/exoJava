import java.time.LocalDate;

public class RecurringExpense extends Expense {
    valeurRecurrence recurrence;

    public RecurringExpense(String label, double amount, LocalDate date, valeurRecurrence recurrence) {
        super(label, amount, date);
        this.recurrence = recurrence;
    }

    public RecurringExpense(valeurRecurrence recurrence) {
        this.recurrence = recurrence;
    }

    @Override
    public String toString() {
       return this.getAmount() + " pendant " + recurrence;
    }
}
