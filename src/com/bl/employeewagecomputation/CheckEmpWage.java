package com.bl.employeewagecomputation;

public class CheckEmpWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME = 4;
    static final int TOTAL_WORKING_HOURS = 100;
    static final int EMP_PRESENT = 0;
    static final int EMP_PART_TIME = 1;
    static final int EMP_ABSENT = 2;

    public void checkAttendanceAndEmpWage() {
        int dailyWage = 0;
        int hours = 0;
        int days = 0;

        while (days < WAGE_PER_HOUR && hours < TOTAL_WORKING_HOURS) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case EMP_PRESENT:
                    System.out.println("Employee is present");
                    dailyWage = dailyWage + (WAGE_PER_HOUR * FULL_DAY_HOUR);
                    System.out.println("Daily wage is : " + dailyWage);
                    hours = hours + FULL_DAY_HOUR;
                    days++;
                    System.out.println("full time working Hours " + hours);
                    break;
                case EMP_PART_TIME:
                    System.out.println("Employee is present");
                    dailyWage = dailyWage + (WAGE_PER_HOUR * PART_TIME);
                    System.out.println("part time wage is : " + dailyWage);
                    hours = hours + PART_TIME;
                    days++;
                    System.out.println("part time working hours : " + hours);
                    break;
                case EMP_ABSENT:
                    System.out.println("Employee is Absent");
                    break;
            }
        }
    }
}