package oop.abstracion;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone extends KeypadPhone {



    public void palayVideo(){
      //  List<Video> videoList = new ArrayList<>();
        System.out.println("Playing video:");
    }

    @Override
    public void makeCall(String phone) {
        System.out.println("Making call with Smartphone");
    }

    @Override
    public void playRadio() {
        System.out.println("Playing video with smartphone");
    }

    @Override
    public boolean sendSms(String textMessage) {


        return false;
    }
}
