package controller;

import model.*;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;


import java.util.List;

public class Controller {

    // добавляю поле с сервисом
    private final DataService service = new DataService();

    private final StudentView view = new StudentView();

    private final StudentGroupService studentGroupService;

    public Controller(){
        this.studentGroupService  = new StudentGroupService();
    }

    public StudentGroup formStudentGroup(Teacher teacher, List<Student> studentList) {
        return studentGroupService.createStudentGroup(teacher, studentList);
    }

    public void printStudentGroup(StudentGroup studentGroup) {
        System.out.println(studentGroup.toString());
    }

    //добавляю метод по созданию студента и будем передавать в него 3 поля
    public void createStudent(String firstName, String lastName, String middleName){
        // теперь вызываем наш сервис
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }


    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }
}
