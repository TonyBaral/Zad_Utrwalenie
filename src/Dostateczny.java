public class Dostateczny extends Oceny{

    public Dostateczny(Integer id, String ocena, String komentarz) {
        super(id, ocena, komentarz);
    }

    public String getName() {
        return "Dostateczny{" +
                "id=" + id +
                ", ocena='" + ocena + '\'' +
                ", komentarz='" + komentarz + '\'' +
                '}';
    }
}
