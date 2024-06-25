public class Employee extends User {
    private static int idLicznik=0;
    private int idPracownika;

    public Employee(String imie, String nawisko) {
        super(imie, nawisko);
        this.idPracownika = idLicznik++;
    }

    public int getIdPracownika(){
        return idPracownika;
    }

}