public class Uczen {
    Integer id;
    String imie;
    String nazwisko;
    String miejscowosc;
    Integer pesel;
    String klasa;

    public Uczen(Integer id, String imie, String nazwisko, String miejscowosc, Integer pesel, String klasa) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
        this.pesel = pesel;
        this.klasa = klasa;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", pesel=" + pesel +
                ", klasa='" + klasa + '\'' +
                '}';
    }
}
