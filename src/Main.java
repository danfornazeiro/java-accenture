import domain.User;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("alice@teste.com", new User("Alice", 30));
        users.put("bob@teste.com", new User("Bob", 25));
        users.put("Joao@teste.com", new User("João", 28));
        users.put("nelson@teste.com", new User("Nelson", 35));

        System.out.println(users);

        System.out.println("==============Chaves==============");
        users.keySet().forEach(System.out::println);

        System.out.println("=============Valores==============");
        users.values().forEach(System.out::println);

        System.out.println(users.containsKey("alice@teste.com"));
        System.out.println(users.containsValue(new User("Alice", 30)));

        users.forEach((k, v) -> System.out.printf("Chave: %s | Valor: %s%n\n", k, v));
        System.out.println("===========================");
        users.replace("Joao@teste.com", new User("João Silva", 59));
        users.forEach((k, v) -> System.out.printf("Chave: %s | Valor: %s%n\n", k, v));
    }
}