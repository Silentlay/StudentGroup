package view;

import model.Student;

public class StudentView {

    // реализую метод вывода в консоль
    public void printOnConsole (Student student){
        System.out.println(student.toString());
    }
}