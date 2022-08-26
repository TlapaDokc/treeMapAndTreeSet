import java.util.Comparator;

public class PersonsMoreWordsComparator implements Comparator<Person> {
    private int maxWords;

    public PersonsMoreWordsComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String SurnameO1 = o1.getSurname();
        String SurnameO2 = o2.getSurname();
        String[] arrySurnamesO1 = SurnameO1.split(" ");
        String[] arrySurnamesO2 = SurnameO2.split(" ");
        if (arrySurnamesO1.length > arrySurnamesO2.length && arrySurnamesO1.length < maxWords) {
            return -1;
        }
        if (arrySurnamesO1.length < arrySurnamesO2.length && arrySurnamesO2.length < maxWords) {
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
    }
}
