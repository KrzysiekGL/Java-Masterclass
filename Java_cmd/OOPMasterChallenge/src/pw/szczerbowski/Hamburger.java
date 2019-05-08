package pw.szczerbowski;

import java.lang.invoke.SwitchPoint;

public class Hamburger {
    protected String breadRoll;
    protected String meat;

    protected enum BreadRollOptions {
        WHITE, DARK
    }

    protected enum MeatOptions {
        COW, BULL, CHICKEN
    }

    //additions
    protected String addition1=null;
    protected String addition2=null;
    protected String addition3=null;
    protected String addition4=null;

    protected enum Addition{
        LETTUCE, TOMATO, CUCUMBER, PICKLES, CARROT, GARLIC, AVOCADO, ONION, CHEESE
    }

    //total price of hamburger
    protected double total=0;

    protected String signToAdditionNumber;

    protected void addAdditionToBurger(Addition additionChosen, int additionFlag){
        switch (additionChosen){
            case LETTUCE:
                signToAdditionNumber="Lettuce";
                break;
            case TOMATO:
                signToAdditionNumber="Tomato";
                break;
            case CUCUMBER:
                signToAdditionNumber="Cucumber";
                break;
            case PICKLES:
                signToAdditionNumber="Pickles";
                break;
            case CARROT:
                signToAdditionNumber="Carrot";
                break;
            case GARLIC:
                signToAdditionNumber="Garlic";
                break;
            case AVOCADO:
                signToAdditionNumber="Avocado";
                break;
            case ONION:
                signToAdditionNumber="Onion";
                break;
            case CHEESE:
                signToAdditionNumber="Cheese";
                break;
            default:
                signToAdditionNumber="";
        }

        if(additionFlag==1) addition1=signToAdditionNumber;
        else if(additionFlag==2) addition2=signToAdditionNumber;
        else if(additionFlag==3) addition3=signToAdditionNumber;
        else if(additionFlag==4) addition4=signToAdditionNumber;

        this.total+=0.50;
    }

    public Hamburger(BreadRollOptions breadRollType, MeatOptions meatType){
        switch (breadRollType){
            case WHITE:
                this.breadRoll="White Bun";
                break;
            case DARK:
                this.breadRoll="Dark Bun";
                break;
        }

        switch (meatType){
            case COW:
                this.meat="Cow";
                break;
            case BULL:
                this.meat="Bull";
                break;
            case CHICKEN:
                this.meat="Chicken";
                break;
        }

        this.total+=10.99;
    }

    public Hamburger(BreadRollOptions breadRollType, MeatOptions meatType, Addition addition1Choose){
        this(breadRollType, meatType);
        addAdditionToBurger(addition1Choose, 1);
    }

    public Hamburger(BreadRollOptions breadRollType, MeatOptions meatType,
                     Addition addition1Choose, Addition addition2Choose){
        this(breadRollType, meatType, addition1Choose);
        addAdditionToBurger(addition2Choose, 2);
    }

    public Hamburger(BreadRollOptions breadRollType, MeatOptions meatType,
                     Addition addition1Choose, Addition addition2Choose, Addition addition3Choose){
        this(breadRollType, meatType, addition1Choose, addition2Choose);
        addAdditionToBurger(addition3Choose, 3);
    }

    public Hamburger(BreadRollOptions breadRollType, MeatOptions meatType, Addition addition1Choose,
                     Addition addition2Choose, Addition addition3Choose, Addition addition4Choose){
        this(breadRollType, meatType, addition1Choose, addition2Choose, addition3Choose);
        addAdditionToBurger(addition4Choose, 4);
    }

    public void getTotalPrice(){
        System.out.println("Total price of burger is " + total);
        System.out.println("Burger is made from: \n" + breadRoll + '\n' + meat);
        if(addition1!=null) System.out.println(addition1);
        if(addition2!=null) System.out.println(addition2);
        if(addition3!=null) System.out.println(addition3);
        if(addition4!=null) System.out.println(addition4);
    }
}
