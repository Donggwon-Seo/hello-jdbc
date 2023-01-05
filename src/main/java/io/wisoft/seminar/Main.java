package io.wisoft.seminar;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Student[] students = new Student[8];
        StudentInsertService insertService = new StudentInsertService();

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
//         SELECT AREA

//         selectTest()

//         INSERT AREA

//         insertTest(student, insertService);
//         insertMultiTest(students, insertService);
//         insertMultiBatchTest(students, insertService);

//         UPDATE AREA
        StudentUpdateService studentUpdateService = new StudentUpdateService();

        studentUpdateService.updateStudentBirthday("20110401", "1990-03-21");
        System.out.println();
    }

    private static void insertMultiBatchTest(Student[] students, StudentInsertService insertService) {
        students[0].setNo("20110901");
        students[0].setName("이상훈");

        students[1].setNo("20111001");
        students[1].setName("강동희");

        students[2].setNo("20111101");
        students[2].setName("김호성");

        students[3].setNo("20111201");
        students[3].setName("김정준");

        insertService.insertStudentMultiBatch(students);
        System.out.println();
    }

    private static void insertTest(Student student, StudentInsertService insertService) {
        System.out.println("학번이 20110401이고, 이름이 이순신인 학생을 추가합니다.");
        student.setNo("20110401");
        student.setName("이순신");
        insertService.insertStudent(student);

        System.out.println();
    }

    private static void insertMultiTest(Student[] students, StudentInsertService insertService) {
        students[0].setNo("20110501");
        students[0].setName("이율곡");

        students[1].setNo("20110601");
        students[1].setName("이수일");

        students[2].setNo("20110701");
        students[2].setName("심순애");

        students[3].setNo("20110801");
        students[3].setName("임꺽정");

        insertService.insertStudentMulti(students);
        System.out.println();
    }

    private static void selectTest() {
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