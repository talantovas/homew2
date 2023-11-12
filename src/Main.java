
public class Main {
    public static Printable createObject(String className) {
        switch (className) {
            case "Rose":
                return new Rose("Red Rose", 2000, 5);
            case "Pion":
                return new Pion("Pink Pion", 15000, 10);
            case "Lily":
                return new Lily("White Lily", 1200, 7);
            default:
                return  null;
        }
    }
    public static void main(String[] args) {

        Printable rose = createObject("Rose");
        Printable pion = createObject("Pion");
        Printable lily = createObject("Lily");

        Printable[] flowers = {rose, pion, lily};

        // Вывод информации о созданных объектах с использованием цикла
        for (Printable flower : flowers) {
            flower.print();
        }

    }
}