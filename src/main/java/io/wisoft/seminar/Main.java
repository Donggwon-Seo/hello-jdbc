package io.wisoft.seminar;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        // SELECT AREA
        StudentSelectService selectStudent = new StudentSelectService();
        System.out.println("이름이 홍길동인 학생을 검색합니다.");

        String studentName = "홍길동";
        selectStudent.getStudentByName(studentName);
        System.out.println("");

        System.out.println("생일이 1991-02-28인 학생을 검색합니다.");
        Date studentBirthday = Date.valueOf("1991-02-28");
        selectStudent.getStudentByBirthday(studentBirthday);
        System.out.println();
    }
}