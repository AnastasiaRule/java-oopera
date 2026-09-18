public class Director extends Person { // класс режиссёр
    private int numberOfShows; // количество поставленный спектаклей

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

