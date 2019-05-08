package pl.krzysiekgl;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        if(isOn) {
            System.out.println("This mobile phone had already been powered on");
            return;
        }
        isOn = true;
        System.out.println("Mobile phone powered on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        else System.out.println("Phone is switched off");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering mobile phone");
            isRinging = true;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("*Ring Ring*");
        }
        else isRinging = false;

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
