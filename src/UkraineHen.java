public class UkraineHen extends Hen{
    public UkraineHen(int count, String from) {
        super(count, from);
    }

    public UkraineHen() {
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return getCount()*30;
    }

    @Override
    public void getDescription() {

        System.out.println("menin olkom "+getFrom()+" men bir aida ushuncha jumurtka tuuim "+getCountOfEggsPerMonth());
    }
}
