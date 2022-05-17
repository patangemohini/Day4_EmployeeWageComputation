package employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation program");

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == 1) {
            System.out.println("Employee is present");
            int daily_wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Daily wage is : " + daily_wage);
        } else if (empCheck == 2) {
            System.out.println("Employee is present ");
            int daily_wage = WAGE_PER_HOUR * PART_TIME;
            System.out.println("Daily wage is : " + daily_wage);
        } else {
            System.out.println("Employee is absent ");
        }
    }
}
