public class Person { // класс человек
    protected String name; // Имя
    protected String surname; // Фамилия
    protected Gender gender; // пол

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
}