public class MusicalShow extends Show { // класс музыкальных постановок
    protected String musicAuthor; // автор музыки
    protected String librettoText; // текст либретто

    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() { // // Печатаем либретто
        System.out.println("Либретто спектакля \"" + title + "\":");
        System.out.println(librettoText);
    }





}
