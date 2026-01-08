import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(
            new User("Alice", 30),
            new User("Bob", 25),
            new User("Charlie", 35),
            new User("Diana", 28)
        );
        //interface funcional
        /*var consumer = new Consumer<User>() {
            @Override
            public void accept(final User user) {
                System.out.println(user);
            }
        };

        users.forEach(consumer);*/

        //lambda
        users.forEach(System.out::println);

        printStringValue(User::name, users);
        printStringValue(Record::toString, users);
        printStringValue(user -> String.valueOf(user.age()), users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
