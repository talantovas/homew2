public class Lily extends Flowers{
    private int period;

    public Lily(String name, int cost, int period) {
        super(name, cost);
        this.period = period;
    }
    @Override
    public void print() {
        System.out.println("Имя: " + getName() + " Цена: " + getCost() +  " Срок: " + period + "дней");
    }
}
