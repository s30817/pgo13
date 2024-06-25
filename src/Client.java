public class Client extends User {

    private BankAccount konto;
    public Client(String imie, String nawisko) {
        super(imie, nawisko);
        this.konto=new BankAccount();
    }


    public BankAccount getKonto() {
        return konto;
    }
}