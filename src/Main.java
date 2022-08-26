import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Person> dutchSoccerPlayers = new ArrayList<>();
        dutchSoccerPlayers.add(new Person("Уэсли", "Снейдер", 38));
        dutchSoccerPlayers.add(new Person("Эдвин", "ван дер Сар", 51));
        dutchSoccerPlayers.add(new Person("Франк", "де Бур", 52));
        dutchSoccerPlayers.add(new Person("Робин", "ван Перси", 39));
        System.out.println(dutchSoccerPlayers);
        Collections.sort(dutchSoccerPlayers, new PersonsMoreWordsComparator(5));
        System.out.println(dutchSoccerPlayers);
        Collections.sort(dutchSoccerPlayers, new PersonsMoreWordsComparator(2));
        System.out.println(dutchSoccerPlayers);
    }
}
