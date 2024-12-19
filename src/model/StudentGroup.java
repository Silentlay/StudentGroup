package model;

import java.util.List;

public class StudentGroup{

    // Добавляю поле для учителя
    private Teacher teacher;
    private int teacherId;

    // Добавляю поле список студентов
    private List<Student> studentList;

    // Добавляю поле название группы
    private String groupName;

    // Добавляю поле номер группы
    private int groupNumber;

    public StudentGroup(Teacher teacher, int teacherId, List<Student> studentList, String groupName, int groupNumber) {
        this.teacher = teacher;
        this.teacherId = teacherId;
        this.studentList = studentList;
        this.groupName = groupName;
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        StringBuilder studentsInfo = new StringBuilder();
        for (Student student : studentList) {
            studentsInfo.append(student).append("\n");
        }

        return "Учебная группа:\n====================\n" +
                "Преподаватель:\n" + teacher + "\n" +
                "Список студентов:\n" + studentsInfo +
                "Название группы = " + groupName + "\n" +
                "Номер группы = " + groupNumber;
    }
}