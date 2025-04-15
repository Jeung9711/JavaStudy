package ch13.pri;

public class StudentVO {
    private int grade;
    private int classNum;
    private String name;

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 캡슐화
    public int getGrade() {
        if(grade >90) grade=0;
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
