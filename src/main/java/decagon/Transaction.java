package decagon;

public class Transaction {
  private Integer id;
  private Integer customerID;
  private String type;
  private Integer amount;

  public Transaction(Integer id, Integer customerID, String type, Integer amount) {
    this.id = id;
    this.customerID = customerID;
    this.type = type;
    this.amount = amount;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getCustomerID() {
    return customerID;
  }

  public void setCustomerID(Integer customerID) {
    this.customerID = customerID;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }
}