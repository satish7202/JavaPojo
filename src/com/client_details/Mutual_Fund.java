package com.client_details;

public class Mutual_Fund {
    int Client_Id,Mutual_Fund_Id,Mutual_Fund_Units;
    String Client_Name;

    public int getClient_Id() {
      return Client_Id;
    }

    public void setClient_Id(int client_Id) {
      Client_Id = client_Id;
    }

    public int getMutual_Fund_Id() {
      return Mutual_Fund_Id;
    }

    public void setMutual_Fund_Id(int mutual_Fund_Id) {
      Mutual_Fund_Id = mutual_Fund_Id;
    }

    public int getMutual_Fund_Units() {
      return Mutual_Fund_Units;
    }

    public void setMutual_Fund_Units(int mutual_Fund_Units) {
      Mutual_Fund_Units = mutual_Fund_Units;
    }

    public String getClient_Name() {
      return Client_Name;
    }

    public void setClient_Name(String client_Name) {
      Client_Name = client_Name;
    }

    public Mutual_Fund(int client_Id, int mutual_Fund_Id, int mutual_Fund_Units, String client_Name) {
      Client_Id = client_Id;
      Mutual_Fund_Id = mutual_Fund_Id;
      Mutual_Fund_Units = mutual_Fund_Units;
      Client_Name = client_Name;
    }
  }

