package io.wisoft.seminar;

public class Student {
    private String no;
    private String name;
    private String birthday;

    public Student(String no, String name, String birthday) {
        this.no = no;
        this.name = name;
        this.birthday = birthday;
    }
    public Student(){}

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
