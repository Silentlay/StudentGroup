package model;

// Создаю класс учителя будем наследоваться от нашего Юзера (extends User)
public class Teacher extends User{

    // Добавляю поле для учителя
    private int teacherId;

    // Добавляю конструктор

    public Teacher(String firstName, String lastName, String middleName, int teacherId) {
        super(firstName, lastName, middleName);
        this.teacherId = teacherId;
    }

    // Добавляю геттеры и сеттеры
    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "ФИО: " + getFirstName() + ", " +
                getLastName() + ", " +
                getMiddleName() + ", " +
                "Id Преподавателя: " + teacherId;
    }
}