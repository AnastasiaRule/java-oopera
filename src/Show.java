import java.util.ArrayList;

public class Show { // класс спектакль

    protected  String title; // название
    protected  int duration; // длительность в минутах
    protected  Director director; // режиссёр
    protected  ArrayList<Actor> listOfActors; // список актеров

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printActors() { // Печать списка актёров
        System.out.println("Актёры спектакля \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) { // Добавление актёра с проверкой дубликата
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле.");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String surname) { // Замена актёра по фамилии
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актёр с фамилией " + surname + " не найден.");
    }

    public void printDirector() { // Информация про режиссёре
        System.out.println("Режиссёр: " + director);
    }

}
