public class Pizza {
    private int price;
    private Boolean veg;
    private int extcheesePrice =100; 
    private int exttoppinPrice =150;
    private int packPrice =20;

    public Pizza(Boolean veg) {
        this.veg = veg;

        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
    }

    public void addExCheese(){
        System.out.println("added extra cheese");
        this.price+=extcheesePrice;
    }
    public void addExTopping(){
        System.out.println("added extra topping");
        this.price+=exttoppinPrice;
    }
    public void pack(){
        System.out.println("take away");
        this.price+=packPrice;
    }
    public void getBill(){
        System.out.println(this.price);
    }










}
