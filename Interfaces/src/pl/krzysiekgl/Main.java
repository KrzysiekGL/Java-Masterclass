package pl.krzysiekgl;

public class Main {

    public static void main(String[] args) {
	    ITelephone timsPhone;
	    timsPhone = new DeskPhone(123467);

	    timsPhone.powerOn();
	    timsPhone.callPhone(123467);
	    timsPhone.answer();
    }
}
