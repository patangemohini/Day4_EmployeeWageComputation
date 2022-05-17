package employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation!!!!");
        double random = Math.floor(Math.random() * 10) % 2;
        if (random == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent ");
        }
    }
}
