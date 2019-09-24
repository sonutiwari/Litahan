import java.util.ArrayList;
import java.util.Scanner;

public class EmployeesExpense {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Constants.DASHES);
        System.out.println(Constants.NO_OF_CATEGORIES);
        int numOfCategories = input.nextInt();
        input.nextLine();
        ArrayList<Expense> expenses = new ArrayList<>();
        for (int i = 0; i < numOfCategories; i++) {
            System.out.println(Constants.ENTER_CATEGORY_PROMPT + (i+1));
            System.out.println(Constants.CATEGORY);
            String category = input.nextLine();
            System.out.println(Constants.BUDGET);
            double budget = input.nextDouble();
            input.nextLine();
            expenses.add(new Expense(category, budget));
            System.out.println(Constants.DASHES);
        }
        System.out.println(Constants.DASHES);
        System.out.println(Constants.NO_OF_EMPLOYEES);
        int numOfEmployees = input.nextInt();
        input.nextLine();
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = Constants.INITIAL_VALUE; i < numOfEmployees; i++) {
            System.out.println(Constants.NO_OF_EMPLOYEES_PROMPT + (i+1));
            System.out.println(Constants.NAME);
            String name = input.nextLine();
            System.out.println(Constants.DEPARTMENT);
            String department = input.nextLine();
            System.out.println(Constants.SALARY);
            double salary = input.nextDouble();
            input.nextLine();
            Employee employee = new Employee(name, department);
            employee.setSalary(salary);
            for (Expense expense: expenses){
                System.out.println(Constants.EXPENSE_AMOUNT_TEXT + expense.getCategory() + Constants.DASH);
                expense.setExpenseAmount(input.nextDouble());
                input.nextLine();
                System.out.println(Constants.DASHES);
            }
            employee.setExpenses(expenses);
            employees.add(employee);
        }
        for (Employee employee: employees){
            System.out.println(employee.toString());
        }
    }
}
