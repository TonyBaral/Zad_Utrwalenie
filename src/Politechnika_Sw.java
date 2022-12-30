public class Politechnika_Sw extends Uczelnia{
    String kierunki;

    public Politechnika_Sw(Integer id, String nazwa, String miejscowosc, String opis, String kierunki) {
        super(id, nazwa, miejscowosc, opis);
        this.kierunki = kierunki;
    }

    @Override
    public String getInfo() {
        return  "Politechnika_Sw{" +
                "kierunki='" + kierunki + '\'' +
                ", id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
