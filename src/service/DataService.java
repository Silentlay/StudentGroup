package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;

    // создаю класс DataService
    public class DataService {

        // в DataService мы будем хранить всех наших пользователей
        private List<User> userList;

        public void create(String firstName, String lastName, String middleName, Type type){
            int id = getFreeId(type);
            if (Type.STUDENT == type) {
                Student student = new Student(firstName, lastName, middleName, id);
                userList.add(student);
            }
            if (Type.TEACHER == type) {
                Teacher teacher = new Teacher(firstName, lastName, middleName, id);
                userList.add(teacher);
            }

        }
        // метод на чтение
        public User getUserById(Type type, int id){
            boolean itsStudent = Type.STUDENT == type;
            User currentUser = null;

            for (User user : userList){

                // если наш юзер принадлежит классу Учитель, а также НЕстуденту тогда мы присваиваем значение lastId Teacher+1
                if (user instanceof Teacher && !itsStudent && ((Teacher) user).getTeacherId() == id){
                    currentUser = user;
                }
                if (user instanceof Student && itsStudent && ((Student) user).getStudentId() == id){
                    currentUser = user;
                }
            }
            return currentUser;
        }

        // метод по возвращению полного списка пользователей
        public List<User> getAllUsers(){
            return userList;
        }

        public List<User> getAllStudent() {
            List<User> students = new ArrayList<>();

            // прохожусь циклом по нашим пользователям из наших данных
            for (User user : userList){

                // проверяю если наш текущий пользователь совпадает с классом студента, то добавляю его в список
                if (user instanceof Student) {
                    students.add(user);
                }
            }
            return students;
        }

        // создаю метод по проверке свободного id, сделаем его приватным и возвращать он будет наше число
        private int getFreeId(Type type){
            boolean itsStudent = Type.STUDENT == type;

            int lastId = 1;

            // прохожусь циклом по нашему User-листу
            for (User user : userList){

                // если наш юзер принадлежит классу Учитель а также НЕстуденту тогда мы присваиваем значение lastId Teacher+1
                if (user instanceof Teacher && !itsStudent){
                    lastId = ((Teacher) user).getTeacherId() + 1;
                }
                if (user instanceof Student && itsStudent){
                    lastId = ((Student) user).getStudentId() + 1;
                }
            }
            return lastId;
        }
    }
