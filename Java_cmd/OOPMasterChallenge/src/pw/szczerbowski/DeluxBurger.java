package pw.szczerbowski;

public class DeluxBurger extends Hamburger {
    protected String beverage;

    protected enum BeverageOptions {
        COCA_COLA, FANTA, SPRITE, WATER, SPARKLING_WATER
    }

    public DeluxBurger(BreadRollOptions breadRollType, MeatOptions meatType, BeverageOptions beverage){
        super(breadRollType, meatType);

        switch (beverage){
            case COCA_COLA:
                this.beverage="Coca-Cola";
                break;
            case FANTA:
                this.beverage="Fanta";
                break;
            case SPRITE:
                this.beverage="Sprite";
                break;
            case WATER:
                this.beverage="Water";
                break;
            case SPARKLING_WATER:
                this.beverage="Sparkling Water";
        }

        this.total+=6;
    }

    public DeluxBurger(BreadRollOptions breadRollType, MeatOptions meatType, BeverageOptions beverage,
                       Addition addition1Choose){
        this(breadRollType, meatType, beverage);
        addAdditionToBurger(addition1Choose, 1);
    }

    public DeluxBurger(BreadRollOptions breadRollType, MeatOptions meatType, BeverageOptions beverage,
                       Addition addition1Choose, Addition addition2Choose){
        this(breadRollType, meatType, beverage, addition1Choose);
        addAdditionToBurger(addition2Choose, 2);
    }

    public DeluxBurger(BreadRollOptions breadRollType, MeatOptions meatType, BeverageOptions beverage,
                       Addition addition1Choose, Addition addition2Choose, Addition addition3Choose){
        this(breadRollType, meatType, beverage, addition1Choose, addition2Choose);
        addAdditionToBurger(addition3Choose, 3);
    }

    public DeluxBurger(BreadRollOptions breadRollType, MeatOptions meatType, BeverageOptions beverage,
                       Addition addition1Choose, Addition addition2Choose, Addition addition3Choose,
                       Addition addition4Choose){
        this(breadRollType, meatType, beverage, addition1Choose, addition2Choose, addition3Choose);
        addAdditionToBurger(addition4Choose, 4);
    }

    @Override
    public void getTotalPrice() {
        super.getTotalPrice();
        System.out.println("Also you have fries and " + beverage + " as an extra.");
    }
}