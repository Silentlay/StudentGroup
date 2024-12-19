import model.Student;
import model.StudentGroup;
import model.Teacher;
import controller.Controller;

import java.util.ArrayList;
import java.util.List;

/*
Домашнее задание
 📌 Создать класс УчебнаяГруппа(StudyGroup) содержащая в себе поля Преподаватель(Teacher) и
список Студентов(student list)
 📌 Создать класс УчебнаяГруппаСервис(StudentGroupService), в котором реализована функция
 (входные параметры - (Teacher, List<Student>)) формирования из Студентов
и Преподавателя УчебнойГруппы и возвращения его
 📌 Создать метод в Контроллере, в котором формируется учебная группа, путем
вызова метода из сервиса
 📌 Все вышеуказанное создать согласно принципам ООП пройдённым на
семинаре
*/
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        // Создаю учителя и студентов
        Teacher teacher = new Teacher("Тереза", "Волхонская", "Иштвановна", 1);

        Student student1 = new Student("Максим", "Бугров", "Дмитриевич", 1);
        Student student2 = new Student("Андрей", "Горбаченко", "Алексеевич", 2);


        // Создаю список студентов
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        StudentGroup studentGroup = controller.formStudentGroup(teacher, studentList);
        controller.printStudentGroup(studentGroup);
    }
}