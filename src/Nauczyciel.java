public class Nauczyciel {
    Integer id;
    String imie;
    String nazwisko;
    String miejscowosc;
    Integer pesel;

    public Nauczyciel(Integer id, String imie, String nazwisko, String miejscowosc, Integer pesel) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", pesel=" + pesel +
                '}';
    }
}
