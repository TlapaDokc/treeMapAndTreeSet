import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> dutchSoccerPlayers = new ArrayList<>();
        dutchSoccerPlayers.add(new Person("Уэсли", "Снейдер", 38));
        dutchSoccerPlayers.add(new Person("Эдвин", "ван дер Сар", 51));
        dutchSoccerPlayers.add(new Person("Франк", "де Бур", 52));
        dutchSoccerPlayers.add(new Person("Робин", "ван Перси", 39));
        System.out.println(dutchSoccerPlayers);
        Comparator<Person> comparator = (o1, o2) -> {
            String surnameO1 = o1.getSurname();
            String surnameO2 = o2.getSurname();
            String[] arraySurnamesO1 = surnameO1.split(" ");
            String[] arraySurnamesO2 = surnameO2.split(" ");
            if (arraySurnamesO1.length > arraySurnamesO2.length && arraySurnamesO1.length < 2) {
                return -1;
            }
            if (arraySurnamesO1.length < arraySurnamesO2.length && arraySurnamesO2.length < 2) {
                return 1;
            }
            int ageO1 = o1.getAge();
            int ageO2 = o2.getAge();
            if (ageO1 > ageO2) {
                return -1;
            }
            if (ageO1 < ageO2) {
                return 1;
            }
            return 0;
        };
        Collections.sort(dutchSoccerPlayers, comparator);
        System.out.println(dutchSoccerPlayers);
    }
}
