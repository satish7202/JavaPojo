package com.client_details;

public class Fixed_Deposit {

    int Client_Id,Amount;
    String Bank_Name;

    public int getClient_Id() {
      return Client_Id;
    }

    public void setClient_Id(int client_Id) {
      Client_Id = client_Id;
    }

    public int getAmount() {
      return Amount;
    }

    public void setAmount(int amount) {
      Amount = amount;
    }

    public String getBank_Name() {
      return Bank_Name;
    }

    public void setBank_Name(String bank_Name) {
      Bank_Name = bank_Name;
    }

    public Fixed_Deposit(int client_Id, int amount, String bank_Name) {
      Client_Id = client_Id;
      Amount = amount;
      Bank_Name = bank_Name;
    }
}


