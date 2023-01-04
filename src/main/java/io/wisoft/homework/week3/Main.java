package io.wisoft.homework.week3;

public class Main {
    public static void main(String[] args) {
        EmployeeSelectService employeeSelectService = new EmployeeSelectService();

        System.out.println("전체 직원을 검색");
        employeeSelectService.getEmployeeAll();
        System.out.println();

    }
}
