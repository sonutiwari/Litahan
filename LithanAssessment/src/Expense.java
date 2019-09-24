public class Expense {
    private String category;
    private double budgetAmount;
    private double expenseAmount;

    Expense(String category, double budgetAmount){
        this.category = category;
        this.budgetAmount = budgetAmount;
    }

    String getCategory() {
        return category;
    }

    double getBudget() {
        return budgetAmount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBudget(double budget) {
        this.budgetAmount = budget;
    }

    double getExpenseAmount() {
        return expenseAmount;
    }

    void setExpenseAmount(double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }
}
