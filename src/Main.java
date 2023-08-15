
public class Main {
    public static void main(String[] args) {
        Pizza p=new Pizza(true);
        p.addExCheese();
        p.addExTopping();
        p.pack();
        p.getBill();

        DeluxPizza dp=new DeluxPizza(true);
        dp.getBill();
    }
}