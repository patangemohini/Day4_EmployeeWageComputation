package com.bl.employeewagecomputation;

public class CheckEmpWage {
    int FULL_DAY_HOUR = 8;
    int PART_TIME = 4;
    int daily_wage = 0;
    int hours = 0;
    int days = 0;
    int totalWorkHours = 0;

    public int totalWorkingHours(int hour, int numWorkingHours) {
        totalWorkHours += hour;
        if (totalWorkHours > numWorkingHours) {
            totalWorkHours -= hour;
        }
        return totalWorkHours;
    }

    public void checkAttendanceAndWage(String companyName, int wagePerHr, int numOfWorkingDays, int numWorkingHours) {

        while (days < numOfWorkingDays && hours < numWorkingHours) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case 0:
                    System.out.println("Employee is present ");
                    daily_wage = daily_wage + (wagePerHr * FULL_DAY_HOUR);
                    System.out.println("Daily wage is : " + daily_wage);
                    hours = totalWorkingHours(FULL_DAY_HOUR, numWorkingHours);
                    System.out.println("Full time working hours : " + hours);
                    days++;
                    break;
                case 1:
                    System.out.println("Employee is present ");
                    daily_wage = daily_wage + (wagePerHr * PART_TIME);
                    System.out.println("Part time wage is : " + daily_wage);
                    hours = totalWorkingHours(PART_TIME, numWorkingHours);
                    System.out.println("Part time working hours : " + hours);
                    days++;
                    break;
                case 2:
                    System.out.println("Employee is absent");
                    break;
            }
        }
        System.out.println("Total employee wage of the " + companyName + " is :" + daily_wage);
    }
}