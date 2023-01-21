public class HenFactory {
    RussianHen russianHen;
    UkraineHen ukraineHen;


    public static void getHen(String country){
        if(country.equals("Russia")){
            RussianHen russianHen1=new RussianHen(1,"Russia");
            russianHen1.getDescription();
        }else if(country.equals("Ukraine")){
            UkraineHen ukraineHen1=new UkraineHen(1,"Ukraine");
            ukraineHen1.getDescription();
            System.out.println(ukraineHen1.getCountOfEggsPerMonth());
        }
    }
}
