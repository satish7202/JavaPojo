package com.client_details;

public class Insurance {

    int Client_Id,Policy_Id;
    String Policy_Name;

    public int getClient_Id() {
      return Client_Id;
    }

    public void setClient_Id(int client_Id) {
      Client_Id = client_Id;
    }

    public int getPolicy_Id() {
      return Policy_Id;
    }

    public void setPolicy_Id(int policy_Id) {
      Policy_Id = policy_Id;
    }

    public String getPolicy_Name() {
      return Policy_Name;
    }

    public void setPolicy_Name(String policy_Name) {
      Policy_Name = policy_Name;
    }

    public Insurance(int client_Id, int policy_Id, String policy_Name) {
      Client_Id = client_Id;
      Policy_Id = policy_Id;
      Policy_Name = policy_Name;
    }
}


