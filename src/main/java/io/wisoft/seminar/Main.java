package io.wisoft.seminar;

public class Main {
    public static void main(String[] args) {

        // SELECT AREA
        StudentSelectService selectStudent = new StudentSelectService();
        System.out.println("학번 20110101 학생을 검색합니다..");

        String studentNo = "20110101";
        selectStudent.getStudentByNo(studentNo);
        System.out.println("");
    }
}