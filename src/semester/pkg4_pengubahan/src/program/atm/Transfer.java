/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semester.pkg4_pengubahan.src.program.atm;

class Transfer {
  private final int numFrom;
  private final int numTo;
  private final double value;
  private BankDatabase bankDatabase;
  
  Transfer(BankDatabase bankDatabase, int numFrom, int numTo, double value) {
    this.bankDatabase = bankDatabase;
    this.numFrom = numFrom;
    this.numTo = numTo;
    this.value = value;
  }
  
  public void execute() {
    assert(numFrom != numTo);
    Account accFrom = bankDatabase.getAccount(numFrom);
    Account accTo = bankDatabase.getAccount(numTo);
    assert(accFrom != null);
    assert(accTo != null);
    accFrom.setAvailableBalance(accFrom.getAvailableBalance() - value);
    accFrom.setTotalBalance(accFrom.getTotalBalance() - value);
    accTo.setTotalBalance(accTo.getTotalBalance() + value);
  }
}
