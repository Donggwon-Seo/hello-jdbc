package io.wisoft.homework.week3;

public class Main {
    public static void main(String[] args) {
        EmployeeSelectService employeeSelectService = new EmployeeSelectService();

        System.out.println("전체 직원 검색");
        employeeSelectService.getEmployeeAll();
        System.out.println();

        System.out.println("직원코드가 E101인 직원을 검색");
        String code = "E101";
        employeeSelectService.getEmployeeBycode(code);
        System.out.println();

        System.out.println("이름이 이순신인 직원을 검색");
        String name = "이순신";
        employeeSelectService.getEmployeeByName(name);
        System.out.println();

        System.out.println("매니저가 E101인 직원을 검색");
        String mgt = "E101";
        employeeSelectService.getEmployeeByMgt(mgt);
        System.out.println();

        System.out.println("직책 코드가 R001인 직원을 검색");
        String rcode = "R001";
        employeeSelectService.getEmployeeByRcode(rcode);
        System.out.println();
    }
}
