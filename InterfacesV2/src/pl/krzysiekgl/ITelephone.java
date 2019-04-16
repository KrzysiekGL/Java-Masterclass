package pl.krzysiekgl;

public interface ITelephone {
    public void powerOn();                  //signatures, whole class is public so "public" behind methods is not required
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

    private void foo() {
        int bar;
    }
}
