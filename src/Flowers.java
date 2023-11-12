public abstract class Flowers implements Printable {
    private String name;
    private int cost;

    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }

    public Flowers(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
