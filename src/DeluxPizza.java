public class DeluxPizza extends Pizza {


    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExCheese();
        super.addExTopping();
    }
}
