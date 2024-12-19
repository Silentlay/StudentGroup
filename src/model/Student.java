package model;

public class Student extends User{

    // Добавляю поле для студента
    private int studentId;

    // Добавляю конструктор

    public Student(String firstName, String lastName, String middleName, int studentId) {
        super(firstName, lastName, middleName);
        this.studentId = studentId;
    }

    // Добавляю геттеры и сеттеры

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "ФИО: " + getFirstName() + " " + getLastName() + " " + getMiddleName() +
                ", Id студента: " + studentId;
    }
}
