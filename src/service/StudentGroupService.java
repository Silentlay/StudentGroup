package service;

import model.Student;
import model.StudentGroup;
import model.Teacher;

import java.util.List;

public class StudentGroupService {


    public StudentGroup createStudentGroup(Teacher teacher, List<Student> studentList) {
        int teacherId = teacher.getTeacherId();
        String groupName = "АСОИ";
        int groupNumber = 1;
        return new StudentGroup(teacher, teacherId, studentList, groupName, groupNumber);
    }
}
