import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> dutchSoccerPlayers = new ArrayList<>();
        dutchSoccerPlayers.add(new Person("Уэсли", "Снейдер", 38));
        dutchSoccerPlayers.add(new Person("Эдвин", "ван дер Сар", 51));
        dutchSoccerPlayers.add(new Person("Франк", "де Бур", 52));
        dutchSoccerPlayers.add(new Person("Робин", "ван Перси", 39));
        dutchSoccerPlayers.add(new Person("Джошуа", "Зиркзе", 19));
        dutchSoccerPlayers.add(new Person("Ки-Яна", "Хувер", 18));
        System.out.println(dutchSoccerPlayers);
        Collections.sort(dutchSoccerPlayers, new PersonsMoreWordsComparator(5));
        System.out.println(dutchSoccerPlayers);
        Collections.sort(dutchSoccerPlayers, new PersonsMoreWordsComparator(2));
        System.out.println(dutchSoccerPlayers);
        Predicate<Person> personPredicate = age -> age.getAge() < 20;
        dutchSoccerPlayers.removeIf(personPredicate);
        System.out.println(dutchSoccerPlayers);
    }
}
