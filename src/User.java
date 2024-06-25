public abstract class User {
    String imie;
    String nawisko;

    public User(String imie, String nawisko) {
        this.imie = imie;
        this.nawisko = nawisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNawisko() {
        return nawisko;
    }

    public void setNawisko(String nawisko) {
        this.nawisko = nawisko;
    }

}