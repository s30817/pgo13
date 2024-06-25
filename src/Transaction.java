public class Transaction {
    private double kwota;
    private BankAccount kontoNadawca;
    private BankAccount kontoOdbiorca;

    public Transaction( BankAccount kontoNadawca, BankAccount kontoOdbiorca,double kwota) {
        this.kontoNadawca=kontoNadawca;
        this.kontoOdbiorca=kontoOdbiorca;
        this.kwota=kwota;
    }
    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public BankAccount getKontoNadawca() {
        return kontoNadawca;
    }

    public void setKontoNadawca(BankAccount kontoNadawca) {
        this.kontoNadawca = kontoNadawca;
    }

    public BankAccount getKontoOdbiorca() {
        return kontoOdbiorca;
    }

    public void setKontoOdbiorca(BankAccount kontoOdbiorca) {
        this.kontoOdbiorca = kontoOdbiorca;
    }
}