package com.bl.employeewagecomputation;

public class CheckEmpWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME = 4;

    public void checkAttendanceAndEmpWage() {
        int daily_wage = 0;
        int hours = 0;
        int days = 0;

        while (days < 20 && hours < 100) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case 0:
                    System.out.println("Employee is present");
                    daily_wage = daily_wage + (WAGE_PER_HOUR * FULL_DAY_HOUR);
                    System.out.println("Daily wage is : " + daily_wage);
                    hours = hours + FULL_DAY_HOUR;
                    days++;
                    System.out.println("full time working Hours " + hours);
                    break;
                case 1:
                    System.out.println("Employee is present");
                    daily_wage = daily_wage + (WAGE_PER_HOUR * PART_TIME);
                    System.out.println("part time wage is : " + daily_wage);
                    hours = hours + PART_TIME;
                    days++;
                    System.out.println("part time working hours : " + hours);
                    break;
                case 2:
                    System.out.println("Employee is Absent");
                    break;
            }
        }
    }
}
