package employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program");
        double random = Math.floor(Math.random() * 10) % 2;
        if (random == 1) {
            System.out.println("Employee is present");
            int daily_wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Daily wage is : " + daily_wage);
        } else {
            System.out.println("Employee is absent ");
        }
    }
}
