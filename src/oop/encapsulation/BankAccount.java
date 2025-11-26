package oop.encapsulation;

public class BankAccount {

    private String firstname;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private String accountNumber;
    private String accountType; //saving, current
    private String isActive;
    private long totalAmount;


    public boolean createAccount(){

        return true;
    }

    public boolean login(){

        return true;

    }

    public boolean logout(){


        return true;
    }

    public long makeTransaction(){

        return 0;

    }

    public long checkEligibleToMakeTransaction(){


        return 0;
    }

}
