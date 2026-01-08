import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
/*
        Set<User> users = new HashSet<>();
        users.add(new User(1, "Alice"));
        users.add(new User(2, "Bob"));
        users.add(new User(3, "João"));
        users.add(new User(4, "Pedro"));

        System.out.println(users.contains(new User(1, "Alice")));
        System.out.println(users.contains(new User(2, "Bob").equals(new User(2, "Bob"))));
        System.out.println(new User(5, "Maria").hashCode());
        users.forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        var iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        Set<User> users2 = new TreeSet<>();
        users2.add(new User(1, "Alice"));
        users2.add(new User(2, "Bob"));
        users2.add(new User(3, "João"));
        users2.add(new User(4, "Pedro"));

        //System.out.println(users2);

        System.out.println("++++++++++++++++Ordenação++++++++++++++");
*/
        System.out.println("++++++++++++++++Ordenação++++++++++++++");
        Set<User> users3 = new TreeSet<>(Comparator.comparingInt(User::getCode));
        users3.add(new User(1, "Alice"));
        users3.add(new User(2, "Bob"));
        users3.add(new User(3, "João"));
        users3.add(new User(4, "Pedro"));

        System.out.println(users3);

        System.out.println("++++++++++++++++Reverse++++++++++++++");
        Set<User> users4 = new TreeSet<>(Comparator.comparingInt(User::getCode).reversed());
        users4.add(new User(1, "Alice"));
        users4.add(new User(2, "Bob"));
        users4.add(new User(3, "João"));
        users4.add(new User(4, "Pedro"));

        System.out.println(users4);
    }
}
