package employeewage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME = 4;

    public static void main(String[] args) {
        int daily_wage = 0;

        System.out.println("Welcome to employee wage computation program");

        for (int i = 0; i <= 20; i++) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case 0:
                    System.out.println("Employee is present");
                    daily_wage = daily_wage + (WAGE_PER_HOUR * FULL_DAY_HOUR);
                    System.out.println("Daily wage is : " + daily_wage);
                    break;
                case 1:
                    System.out.println("Employee is present");
                    daily_wage = daily_wage + (WAGE_PER_HOUR * PART_TIME);
                    System.out.println("part time wage is : " + daily_wage);
                    break;
                default:
                    System.out.println("Employee is absent ");
            }
        }
    }
}
