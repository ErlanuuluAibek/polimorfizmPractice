public class RussianHen extends Hen{
    public RussianHen(int count, String from) {
        super(count, from);
    }

    public RussianHen() {
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
