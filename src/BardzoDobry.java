public class BardzoDobry extends Oceny {

    public BardzoDobry(Integer id, String ocena, String komentarz) {
        super(id, ocena, komentarz);
    }


    public String getName() {
        return "BardzoDobry{" +
                "id=" + id +
                ", ocena='" + ocena + '\'' +
                ", komentarz='" + komentarz + '\'' +
                '}';
    }
}
