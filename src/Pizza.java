public class Pizza {
    private int price;
    private Boolean veg;
    private int extcheesePrice =100; 
    private int exttoppinPrice =150;
    private int packPrice =20;
    private int baseprice;
    private boolean isExtraCheeseAdded =false;
    private boolean isExtraToppingsAdded =false;
    private boolean isTakeAway =false;



    public Pizza(Boolean veg) {
        this.veg = veg;

        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        baseprice=this.price;
    }

    public void addExCheese(){
        isExtraCheeseAdded = true;
        this.price+=extcheesePrice;
    }
    public void addExTopping(){
        isExtraToppingsAdded = true;
        this.price+=exttoppinPrice;
    }
    public void pack(){
        isExtraCheeseAdded = true;
        this.price+=packPrice;
    }
    public void getBill(){
        String bill = "";
        System.out.println("pizza: "+baseprice);
        if (isExtraCheeseAdded){
            bill += "extra cheese added: "+extcheesePrice+ "\n";
        }
        if (isExtraToppingsAdded){
            bill += "extra toppings added: "+exttoppinPrice+ "\n";
        }
        if (isTakeAway){
            bill += "Take Away: "+packPrice+ "\n";
        }
        bill+= "Bill: "+this.price+"\n";
        System.out.println(bill);
    }

    /*
    * pizza:
    * extra cheese added:
    * extra toppings added:
    * Take Away:
    * */










}
