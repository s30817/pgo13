public class Main {
    public static void main(String[] args) {

        Admin admin = new Admin("Kacper", "XYZ");

        Employee employee1 = new Employee("Mateusz", "Kowalski");
        Employee employee2 = new Employee("Tomasz", "ZYX");

        Client client1 = new Client("Grzegorz", "YZX");
        Client client2 = new Client("Lukasz", "Wesoly");
        Client client3 = new Client("Mikolaj", "Serdeczny");
        Client client4 = new Client("Stefan", "Wysoki");

        BankAccount bankAccount1 = client1.getKonto();
        BankAccount bankAccount2 = client2.getKonto();
        BankAccount bankAccount3 = client3.getKonto();
        BankAccount bankAccount4 = client4.getKonto();

        bankAccount1.dokonanieWplaty(7000);
        bankAccount2.dokonanieWplaty(9000);
        bankAccount3.dokonanieWplaty(10000);
        bankAccount4.dokonanieWplaty(3000);

        wykonajTransakcje(bankAccount1, bankAccount2, 500);
        wykonajTransakcje(bankAccount2, bankAccount3, 700);
        wykonajTransakcje(bankAccount3, bankAccount4, 1800);
        wykonajTransakcje(bankAccount4, bankAccount2, 900);
        wykonajTransakcje(bankAccount3, bankAccount1, 100);
        wykonajTransakcje(bankAccount2, bankAccount4, 1200);
        wykonajTransakcje(bankAccount1, bankAccount3, 3000);
        wykonajTransakcje(bankAccount2, bankAccount3, 200);
        wykonajTransakcje(bankAccount3, bankAccount4, 100);
        wykonajTransakcje(bankAccount2, bankAccount4, 700);


    }

    public static void wykonajTransakcje(BankAccount kontoNadawca, BankAccount kontoOdbiorca, double kwota) {
        try {
            kontoNadawca.wykonaniePrzelewu(kwota, kontoOdbiorca);
            System.out.println("Transakcja na kwotę " + kwota + " od konta " + kontoNadawca + " do konta " + kontoOdbiorca + " zakończona sukcesem.");
        } catch (AccountOperationException e) {
            System.out.println("Transakcja na kwotę " + kwota + " od konta " + kontoNadawca + " do konta " + kontoOdbiorca + " nie powiodła się: " + e.getMessage());
        }
    }
}