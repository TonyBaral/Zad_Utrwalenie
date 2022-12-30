public class UJK extends Uczelnia{
    String dziekanat;

    public UJK(Integer id, String nazwa, String miejscowosc, String opis, String dziekanat) {
        super(id, nazwa, miejscowosc, opis);
        this.dziekanat = dziekanat;
    }

    @Override
    public String getInfo() {
        return "UJK{" +
                "dziekanat='" + dziekanat + '\'' +
                ", id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
