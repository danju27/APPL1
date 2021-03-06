/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semester.pkg4_pengubahan.src.program.atm;

public class Account {
   private int accountNumber; // account number
   private int pin; // PIN for authentication
   private double availableBalance; // funds available for withdrawal
   private double totalBalance; // funds available & pending deposits
   private boolean blocked;

   // Account constructor initializes attributes
   public Account(int theAccountNumber, int thePIN, 
      double theAvailableBalance, double theTotalBalance) {
      accountNumber = theAccountNumber;
      availableBalance = theAvailableBalance;
      totalBalance = theTotalBalance;
      pin = thePIN;
      blocked = false;
   }

   // determines whether a user-specified PIN matches PIN in Accountsss
   public boolean validatePIN(int userPIN) {
      if (userPIN == pin) {
         return true;
      } else {
         return false;
      }
   } 

   // returns available balance
   public double getAvailableBalance() {
      return availableBalance;
   } 

   // returns the total balance
   public double getTotalBalance() {
      return totalBalance;
   }
   
   public void setAvailableBalance(double x){
     availableBalance = x;
   }
   
   public void setTotalBalance(double x){
     availableBalance = x;
   }

   public void credit(double amount) {
     availableBalance -= amount;
     totalBalance -= amount;
   }

   public void debit(double amount) {
     availableBalance += amount;
     totalBalance += amount;
   }

   public int getAccountNumber() {
      return accountNumber;  
   }
   
   public void setPIN(int pinToSet) {
     pin = pinToSet;
   }
   
   public boolean isBlocked() {
     return blocked;
   }
   
   public void setBlocked(boolean value) {
     blocked = value;
   }
} 