public class Main {
    public static void main(String[] args) {
        RussianHen russianHen = new RussianHen(1, "Russian");
        UkraineHen ukraineHen = new UkraineHen(1, "Ukraine");
        russianHen.getDescription();
        ukraineHen.getDescription();
        HenFactory.getHen("Russia");
    }
}