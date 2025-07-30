public class RefundableExpense extends Expense{
    private boolean refunded = false;

    public void Refund(){
        this.refunded = true;
    }
}
