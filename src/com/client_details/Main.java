package com.client_details;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      int j=0;
      List<Object> Client = new ArrayList<Object>();
      HashMap<Integer,Object> hmClient=new HashMap<Integer,Object>();
     Mutual_Fund[] mfobj = new Mutual_Fund[3];
     Insurance[] insobj = new Insurance[3];
     Fixed_Deposit[] fdobj = new Fixed_Deposit[3];
      mfobj[0] = new Mutual_Fund(1,101,10,"Satish");
      mfobj[1] = new Mutual_Fund(1,102,11,"Ratan");
      mfobj[2] = new Mutual_Fund(1,103,12,"Pravin");
      insobj[0]= new Insurance(1,10,"LIC");
      insobj[1]= new Insurance(1,11,"Bike Insurance");
      insobj[2]= new Insurance(1,12,"Car Insurance");
      fdobj[0] = new Fixed_Deposit(1,1000,"SBI");
      fdobj[1] = new Fixed_Deposit(1,1200,"BOB");
      fdobj[2] = new Fixed_Deposit(1,1300,"PNB");
      Client.add(mfobj[0]);
      Client.add(mfobj[1]);
      Client.add(mfobj[2]);
      Client.add(insobj[0]);
      Client.add(insobj[1]);
      Client.add(insobj[2]);
      Client.add(fdobj[0]);
      Client.add(fdobj[1]);
      Client.add(fdobj[2]);
      hmClient.put(1,Client);
      /*for ( int i= 0 ;i< 3 ; i++) {

        j++;

      }
      for (int i=0 ; i<3 ; i++)
      {
        hmClient.put(j, insobj[i]);
        j++;
      }
      for (int i=0 ; i<3 ; i++)
      {
        hmClient.put(j, insobj[i]);
        j++;
      }*/

      System.out.println("Data Added to List Successfully.....");
      System.out.println(hmClient);

      /*for (int i=0;i<1;i++)
      {
        System.out.println("Mutual_Fund....Details");
        for (int j=0;j<3;j++)
        {
          System.out.println("Name:-"+mfobj[j].getClient_Name() + " Client_Id:-" + mfobj[j].getClient_Id() + " Mutual_Fund_Id:-" + mfobj[j].getMutual_Fund_Id() + " Mutual_Fund_Unit:- " + mfobj[j].getMutual_Fund_Units());
        }
        System.out.println("Insurance....Details");
        for (int j=0;j<3;j++)
        {
          System.out.println("Policy_Name:-"+insobj[j].getPolicy_Name() + " Client_Id:-" + insobj[j].getClient_Id() + " Policy_Id:-" + insobj[j].getPolicy_Id());

        }
        System.out.println("Fixed Deposit....Details");
        for (int j=0;j<3;j++)
        {
          System.out.println("Bank_Name:-"+fdobj[j].getBank_Name() + " Client_Id:-" + fdobj[j].getClient_Id() + " Amount:-" + fdobj[j].getAmount());
        }
      }*/

    }
}


