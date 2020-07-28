package decagon;

/**
 *  Testing helps in the following ways:
 *  Discover bugs early
 *  provides documentations for developers
 *  simplifies integration and facilitates changes
 *  improve quality of code.
 */
public class App {
    public static void main( String[] args ) {
        Bank spankieBank = new Bank();

        Customer chibueze = new Customer(1, "Chibueze");
        Customer joshua = new Customer(2, "Joshua");

        spankieBank.AddCustomer(chibueze);
        spankieBank.AddCustomer(joshua);

        Transaction chibuezeDeposit = new Transaction(1, chibueze.getId(), "deposit", 2000);
        Transaction chibuezeWithdrawal = new Transaction(2, chibueze.getId(), "withdrawal", 1000);
        Transaction joshuaDeposit = new Transaction(2, joshua.getId(), "deposit", 3000);

        spankieBank.AddTransaction(chibueze.getId(), chibuezeDeposit);
        spankieBank.AddTransaction(joshua.getId(), joshuaDeposit);
        spankieBank.AddTransaction(chibueze.getId(), chibuezeWithdrawal);

        System.out.printf("Chibueze's Balance: $%d\n", spankieBank.getCustomerBalance(chibueze.getId()));
        System.out.printf("Joshua's Balance: $%d\n", spankieBank.getCustomerBalance(joshua.getId()));
    }
}
