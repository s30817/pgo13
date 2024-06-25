import java.lang.reflect.Array;
import java.util.ArrayList;

public class BankAccount implements AccountOperations{

    private double stanKonta=0;
    ArrayList<Transaction>transactions;

    public BankAccount() {
        this.stanKonta = stanKonta;
        this.transactions = new ArrayList<>();
    }

    public double getStanKonta() {
        return stanKonta;
    }
    @Override
    public double sprStanuKonta() {
        return this.stanKonta;
    }

    @Override
    public void wykonaniePrzelewu(double kwota, BankAccount konto) throws AccountOperationException {
        if (kwota<= 0 || kwota>this.stanKonta){
            throw new AccountOperationException("Bledna kwota przelewu");
        }
        this.stanKonta -= kwota;
        konto.dokonanieWplaty(kwota);
        Transaction transaction = new Transaction(this,konto,kwota);
        this.transactions.add(transaction);
        konto.transactions.add(transaction);
    }

    @Override
    public void dokonanieWplaty(double kwota) {
        this.stanKonta+=kwota;
    }
}