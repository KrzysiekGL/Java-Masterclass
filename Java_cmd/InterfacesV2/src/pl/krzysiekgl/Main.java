package pl.krzysiekgl;

import java.util.function.IntPredicate;

public class Main {
	public static void main(String[] args) {
    ITelephone timsPhone = new DeskPhone(1234567);
	  DeskPhone timsPhone2 = new DeskPhone(12345678); //also valid
	  timsPhone.powerOn();
    timsPhone.callPhone(1234567);
    timsPhone.answer();

    System.out.println("\n\n\n");
    ITelephone chrisPhone = new MobilePhone(12345678);
	  chrisPhone.powerOn();
    chrisPhone.callPhone(12345678);
    chrisPhone.answer();

    //Because timsPhone is object of ITelephone
    timsPhone = new MobilePhone(1234); //this is possible
    //but
    // ---- timsPhone2 = new MobilePhone(12345); --- //is not possible
  }
}
