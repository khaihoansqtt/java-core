import java.util.HashSet;
import java.util.Set;

public class TestHash {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        for (int i = 0; i <= 1000; i++) {
            Person a = new Person(0);
            set.add(a);
        }
        System.out.println(set.size());
    }
}

class Person {
    String name;
    int age;

    public Person(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
