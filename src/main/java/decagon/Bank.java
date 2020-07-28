package decagon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
  private Map<Integer, List<Transaction>> transactions;
  private List<Customer> customers;

  // public Bank() {
  //   this.transactions = new HashMap<Integer, List<Transaction>>();
  //   this.customers = new ArrayList<Customer>();
  // }

  public void AddCustomer(Customer customer) {
    if (this.customers == null) {
      this.customers = new ArrayList<Customer>();
    }
    this.customers.add(customer);
  }

  public void AddTransaction(Integer cusID, Transaction transaction) {
    if (this.transactions == null) {
      this.transactions = new HashMap<Integer, List<Transaction>>();
    }
    List<Transaction> ts;
    if (!this.transactions.containsKey(cusID)) {
      ts = new ArrayList<>();
    } else {
      ts = this.transactions.get(cusID);
    }
    ts.add(transaction);
    this.transactions.put(cusID, ts);
  }

  public List<Transaction> getCustomerTransactions(Integer cusID) {
    return this.transactions.get(cusID);
  }

  public Integer getCustomerBalance(Integer cusID) {
    Integer balance = 0;
    List<Transaction> ts = this.getCustomerTransactions(cusID);
    for (int i = 0; i < ts.size(); i++) {
      Transaction t = ts.get(i);
      Integer amount = t.getAmount();
      if (t.getType().equals("deposit")) {
        balance += amount;
      } else if (t.getType().equals("withdrawal")) {
        balance -= amount;
      }
    }
    return balance;
  }

  public Map<Integer, List<Transaction>> getTransactions() {
    return transactions;
  }

  public void setTransactions(Map<Integer, List<Transaction>> transactions) {
    this.transactions = transactions;
  }

  public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }
}