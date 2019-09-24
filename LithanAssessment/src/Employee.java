import java.util.ArrayList;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private ArrayList<Expense> expenses;

    Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    private ArrayList<Expense> getExpenses() {
        return expenses;
    }

    void setExpenses(ArrayList<Expense> expenses) {
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName())
                .append(Constants.TAB)
                .append(Constants.TAB)
                .append(Constants.TAB)
                .append(this.getDepartment())
                .append(Constants.TAB)
                .append(this.getSalary());
        int count = Constants.INITIAL_VALUE;
        double sum = Constants.INITIAL_VALUE;
        for (Expense expense: this.getExpenses()){
            sb.append(Constants.NEW_LINE)
                    .append(Constants.TAB)
                    .append(expense.getCategory())
                    .append(Constants.TAB)
                    .append(Constants.TAB)
                    .append(expense.getBudget())
                    .append(Constants.TAB)
                    .append(expense.getExpenseAmount());
            if (expense.getBudget() < expense.getExpenseAmount()){
                sb.append(Constants.ABOVE);
                ++count;
            } else {
                sb.append(Constants.BELOW);
            }
            sum += expense.getExpenseAmount();
        }
        if(count > Constants.INITIAL_VALUE){
            sb.append(Constants.NEW_LINE)
                    .append(Constants.NEW_LINE)
                    .append(Constants.ABOVE_BUDGET)
                    .append(count).append(Constants.CATEGORIES);
        }
        if ((this.getExpenses().size() - count) > Constants.INITIAL_VALUE){
            sb.append(Constants.NEW_LINE)
                    .append(Constants.BELOW_BUDGET)
                    .append((this.getExpenses().size() - count))
                    .append(Constants.CATEGORIES);
        }
        return sb.append(Constants.NEW_LINE)
                .append(Constants.SAVINGS)
                .append(this.getSalary() - sum)
                .append(Constants.NEW_LINE)
                .append(Constants.DASHES)
                .toString();
    }
}
