package pw.szczerbowski;

public class HealthyBurger extends Hamburger {
    protected String addition5=null;
    protected String addition6=null;

    public HealthyBurger(BreadRollOptions breadRollType, MeatOptions meatType){
        super(breadRollType, meatType);

        this.total+=2.50;
    }

    public HealthyBurger(BreadRollOptions breadRollType, MeatOptions meatType, Addition addition1Choose){
        super(breadRollType, meatType, addition1Choose);

        this.total+=2.50;
    }

    public HealthyBurger(BreadRollOptions breadRollType, MeatOptions meatType, Addition addition1Choose,
                         Addition addition2Choose){
        super(breadRollType, meatType, addition1Choose, addition2Choose);

        this.total+=2.50;
    }

    public HealthyBurger(BreadRollOptions breadRollType, MeatOptions meatType, Addition addition1Choose,
                         Addition addition2Choose, Addition addition3Choose){
        super(breadRollType, meatType, addition1Choose, addition2Choose, addition3Choose);

        this.total+=2.50;
    }

    public HealthyBurger(BreadRollOptions breadRollType, MeatOptions meatType, Addition addition1Choose,
                         Addition addition2Choose, Addition addition3Choose, Addition addition4Choose){
        super(breadRollType, meatType, addition1Choose, addition2Choose, addition3Choose, addition4Choose);

        this.total+=2.50;
    }

    public HealthyBurger(BreadRollOptions breadRollType, MeatOptions meatType, Addition addition1Choose,
                         Addition addition2Choose, Addition addition3Choose, Addition addition4Choose,
                         Addition addition5Choose){
        super(breadRollType, meatType, addition1Choose, addition2Choose, addition3Choose, addition4Choose);
        addAdditionToBurger(addition5Choose, 5);

        this.total+=2.50;
    }

    public HealthyBurger(BreadRollOptions breadRollType, MeatOptions meatType, Addition addition1Choose,
                         Addition addition2Choose, Addition addition3Choose, Addition addition4Choose,
                         Addition addition5Choose, Addition addition6Choose){
        this(breadRollType, meatType, addition1Choose, addition2Choose, addition3Choose,
                addition4Choose, addition5Choose);
        addAdditionToBurger(addition6Choose, 6);
    }

    @Override
    protected void addAdditionToBurger(Addition additionChosen, int additionFlag) {
        super.addAdditionToBurger(additionChosen, additionFlag);

        if(additionFlag==5) addition5=signToAdditionNumber;
        else if(additionFlag==6) addition6=signToAdditionNumber;
    }

    @Override
    public void getTotalPrice() {
        super.getTotalPrice();
        if(addition5!=null) System.out.println(addition5);
        if(addition6!=null) System.out.println(addition6);
    }
}
