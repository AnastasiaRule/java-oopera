import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        //  Делаем актёров и режиссёров
        Actor actor1 = new Actor("Бред", "Питт", Gender.MALE, 180);
        Actor actor2 = new Actor("Джони", "Депп", Gender.MALE, 165);
        Actor actor3 = new Actor("Леонардо", "Дикаприо", Gender.MALE, 175);

        Director director1 = new Director("Ричи", "Гай", Gender.MALE, 10);
        Director director2 = new Director("Зак", "Снайдер", Gender.MALE, 5);

        String musicAuthor = "П. Чайковский";
        String choreographer = "Ю. Посохов ";

        // Делаем спектакли
        Show drama = new Show("Гамлет", 180, director1);

        Opera opera = new Opera("Евгений Онегин", 200, director1,
                musicAuthor, "Либретто оперы...", 40);

        Ballet ballet = new Ballet("Лебединое озеро", 150, director2,
                musicAuthor, "Либретто балета...", choreographer);

        // Распределяем актёров
        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor2);
        ballet.addActor(actor3);

        // Выводим списки актёров
        drama.printActors();
        opera.printActors();
        ballet.printActors();

        // Меняем актёра
        opera.replaceActor(actor2, "Питт"); // заменим Питта на Деппа
        opera.printActors();

        // Пробуем заменить несуществующего актера
        drama.replaceActor(actor3, "Несуществующий");

        //  Либретто
        opera.printLibretto();
        ballet.printLibretto();

        // О режиссёре
        drama.printDirector();
    }
}