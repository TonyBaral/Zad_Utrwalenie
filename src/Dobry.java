public class Dobry extends Oceny{

    public Dobry(Integer id, String ocena, String komentarz) {
        super(id, ocena, komentarz);
    }

    public String getName() {
        return "Dobry{" +
                "id=" + id +
                ", ocena='" + ocena + '\'' +
                ", komentarz='" + komentarz + '\'' +
                '}';
    }
}
