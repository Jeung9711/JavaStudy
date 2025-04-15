package ch13.pub.process;

import ch13.pub.vo.StudentVO;

public class DataProcess {
    void input(int grade, int classNum, String name) {
        StudentVO student = new StudentVO();
        student.grade = grade;
        student.classNum = classNum;
        student.name = name;
    }
}
