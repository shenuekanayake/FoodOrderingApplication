
public class Main {
    public static void main(String[] args) {
       Pizza p=new Pizza(false);
       p.addExCheese();
       p.addExTopping();
       p.pack();
       p.getBill();       //670
    }
}