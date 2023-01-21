public class Main {
    public static void main(String[] args) {
        RussianHen russianHen= new RussianHen(2,"Russia");
        HenFactory.getHen(russianHen.getFrom());
        UkraineHen ukraineHen=new UkraineHen(1,"Ukraine");
        HenFactory.getHen(ukraineHen.getFrom());


    }
}