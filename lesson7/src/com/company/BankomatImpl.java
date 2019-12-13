package com.company;

public interface BankomatImpl {
    boolean checkPing(String cardID, String pin);
    float getBalance ();
    void getCash(float cash);
    void addCash (float cash);
    void reject ();

}
