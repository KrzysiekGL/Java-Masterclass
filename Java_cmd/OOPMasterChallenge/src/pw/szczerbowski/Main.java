package pw.szczerbowski;

public class Main {

    public static void main(String[] args) {
        Hamburger myTastyBurger=new DeluxBurger(Hamburger.BreadRollOptions.DARK, Hamburger.MeatOptions.COW,
                DeluxBurger.BeverageOptions.COCA_COLA, Hamburger.Addition.PICKLES, Hamburger.Addition.ONION,
                Hamburger.Addition.LETTUCE);

        myTastyBurger.getTotalPrice();
    }
}
