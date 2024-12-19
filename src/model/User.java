package model;

public abstract class User {

    // добавляю несколько полей
    private String firstName;
    private String lastName;
    private String middleName;

    // а также добавляю конструктор

    public User(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }


    // также после того как добавила поля сразу добавляю геттеры и сеттеры

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}

