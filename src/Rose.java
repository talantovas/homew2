public class Rose extends Flowers{
    private int length;

    public Rose(String name, int cost, int length) {
        super(name, cost);
        this.length = length;
    }


    @Override
    public void print() {
        System.out.println(" Имя: " + getName() + " Цена: " + getCost() +  " Длина: " + length + "m");
    }
}
