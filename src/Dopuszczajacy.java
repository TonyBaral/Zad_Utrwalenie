public class Dopuszczajacy extends Oceny{

    public Dopuszczajacy(Integer id, String ocena, String komentarz) {
        super(id, ocena, komentarz);
    }


    public String getName() {
        return "Dopuszczajacy{" +
                "id=" + id +
                ", ocena='" + ocena + '\'' +
                ", komentarz='" + komentarz + '\'' +
                '}';
    }
}
