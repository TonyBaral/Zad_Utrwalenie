
public class Uczelnia {
    Integer id;
    String nazwa;
    String miejscowosc;
    String opis;

    public Uczelnia(Integer id, String nazwa, String miejscowosc, String opis) {
        this.id = id;
        this.nazwa = nazwa;
        this.miejscowosc = miejscowosc;
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Uczelnia{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }


    public String getInfo() {
        return "Uczelnia{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
