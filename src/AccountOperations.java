public interface AccountOperations {
    double sprStanuKonta();
    public void wykonaniePrzelewu(double kwota,BankAccount konto) throws AccountOperationException;
    public void dokonanieWplaty(double kwota) ;
}