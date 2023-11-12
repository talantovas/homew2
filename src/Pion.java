public class Pion extends Flowers{
    private int quantity;

    public Pion(String name, int cost, int quantity) {
        super(name, cost);
        this.quantity = quantity;

    }


    @Override
    public void print() {
        System.out.println(" Имя: " + getName() + " Цена: " + getCost() +  " Количество: " + quantity + "шт");


    }
}
