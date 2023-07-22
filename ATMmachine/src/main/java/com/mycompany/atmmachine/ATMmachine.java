
package com.mycompany.atmmachine;

import java.util.Scanner;

class ATM{
float Balance;
int PIN=1234;

public void checkpin(){
System.out.print("Please enter your PIN: ");
Scanner sc = new Scanner(System.in);
int enterpin=sc.nextInt();
if(enterpin==PIN){
menu();
}
else{
System.out.print("Enter a Valid PIN: ");
}
}
   
public void menu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        
       Scanner sc = new Scanner(System.in);
       int opt=sc.nextInt();
       
       if(opt==1){
       cheackBalance();
       }
      else if(opt==2){
       withdrawMoney();
       }
        else if(opt==3){
       depositMoney();
       }
       else if(opt==4){
      return;
       }
       else{
           System.out.println("Enter a valid Choice");
       }
    }

public void cheackBalance(){
  System.out.println("Banlance:" +Balance);
  menu();  
}

   public void withdrawMoney(){
  System.out.println("Enter Amount to withdraw:");
  Scanner sc = new Scanner(System.in);
       float amount=sc.nextFloat();
       if(amount>Balance){
       System.out.println("Insufficient Banlance:");
       }
       else{
       Balance=Balance-amount;
        System.out.println("Money Withdraw Successful");
       }
        menu();  
   }  
   
   public void depositMoney(){
  System.out.println("Enter Amount to Deposit:");
  Scanner sc = new Scanner(System.in);
       float amount=sc.nextFloat();
     Balance=Balance+amount;
        System.out.println("Money Deposit Successfully");
         menu(); 
       }
        
   }  
   
public class ATMmachine {

    public static void main(String[] args) {
  ATM obj =new ATM();
  obj.checkpin();
  
    }
}
