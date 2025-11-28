package oop.abstracion;


public class KeypadPhone implements Mobile {

    @Override
    public void makeCall(String phone) {
        System.out.println("Calling... ");
    }

    @Override
    public void playRadio() {
        System.out.println("playing radio: ");
    }

    @Override
    public boolean sendSms(String textMessage) {
        System.out.println("sms sending..");


        return true;
    }
}
