public class Kierunek {
    Integer id;
    String nazwa;
    String opis;

    public Kierunek(Integer id, String nazwa, String opis) {
        this.id = id;
        this.nazwa = nazwa;
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Kierunek{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
