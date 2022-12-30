public class Oceny {
    Integer id;
    String ocena;
    String komentarz;

    public Oceny(Integer id, String ocena, String komentarz) {
        this.id = id;
        this.ocena = ocena;
        this.komentarz = komentarz;
    }

    @Override
    public String toString() {
        return "Oceny{" +
                "id=" + id +
                ", ocena='" + ocena + '\'' +
                ", komentarz='" + komentarz + '\'' +
                '}';
    }
}
