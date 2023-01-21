public class Hen {
    private int count;
    private String from;

    public Hen(int count, String from) {
        this.count = count;
        this.from = from;
    }

    public Hen() {
    }

    public int getCountOfEggsPerMonth(){
        int summ=count*30;
        return summ;
    }

    public  void getDescription() {

    }



    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
