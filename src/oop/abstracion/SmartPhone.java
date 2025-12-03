package oop.abstracion;

import annotation.ValidAge;

import java.util.ArrayList;
import java.util.List;

public class SmartPhone extends KeypadPhone {


    private Integer age;

    private Integer ramSize;

    public Integer getRamSize() {
        return ramSize;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void palayVideo(){
      //  List<Video> videoList = new ArrayList<>();
        System.out.println("Playing video:");
    }

    @ValidAge
    @Override
    public void makeCall( String phone) {
        
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

    @Override
    public String toString() {
        return "SmartPhone{" +
                "age=" + age +
                ", ramSize=" + ramSize +
                '}';
    }
}
