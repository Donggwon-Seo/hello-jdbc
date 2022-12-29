package io.wisoft.seminar;

public class Main {
    public static void main(String[] args) {

        // SELECT AREA
        StudentSelectService selectStudent = new StudentSelectService();
        System.out.println("이름이 홍길동인 학생을 검색합니다.");

        String studentName = "홍길동";
        selectStudent.getStudentByName(studentName);
        System.out.println("");
    }
}