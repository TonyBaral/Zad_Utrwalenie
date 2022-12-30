public class Niedostateczny extends Oceny{

    public Niedostateczny(Integer id, String ocena, String komentarz) {
        super(id, ocena, komentarz);
    }


    public String getName() {
        return "Niedostateczny{" +
                "id=" + id +
                ", ocena='" + ocena + '\'' +
                ", komentarz='" + komentarz + '\'' +
                '}';
    }
}
