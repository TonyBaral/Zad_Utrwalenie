public class Main {
    public static void main(String[] args) {
        Nauczyciel nauczyciel = new Nauczyciel(123, "Jan", "Kowalski", "Sędziszów", 98427525);
        System.out.println(nauczyciel.toString());
        Uczen uczen = new Uczen(234, "Oskar", "Kubicki", "Kielce", 46283259, "druga");
        System.out.println(uczen.toString());
        Uczelnia uczelnia = new Uczelnia(345, "Uczelnia Wyższa", "Kielce", "Opis");
        System.out.println(uczelnia.toString());
        Kierunek kierunek = new Kierunek(948, "informatyka", "Opis");
        System.out.println(kierunek.toString());
        Oceny oceny = new Oceny(948, "4", "Komentarz");
        System.out.println(oceny.toString());

        System.out.println("------------------------------------------------------------------------------");

        UJK ujk = new UJK(632, "UJK", "Kielce", "Opis", "Dziekanat informatyczny");
        System.out.println(ujk.getInfo());
        Politechnika_Sw politechnika_sw = new Politechnika_Sw(827, "Politechnika", "Kielce", "Opis", "informatyczny");
        System.out.println(politechnika_sw.getInfo());

        System.out.println("------------------------------------------------------------------------------");

        BardzoDobry bardzoDobry = new BardzoDobry(1, "5", "opis");
        Dobry dobry = new Dobry(2, "4", "opis");
        Dostateczny dostateczny = new Dostateczny(3, "3", "opis");
        Dopuszczajacy dopuszczajacy = new Dopuszczajacy(4, "2", "opis");
        Niedostateczny niedostateczny = new Niedostateczny(5, "1", "opis");

        String[] Tablica = {bardzoDobry.getName(), dobry.getName(), dostateczny.getName(), dopuszczajacy.getName(), niedostateczny.getName()};
        for (String x : Tablica) {
            System.out.println(x);}
    }
}