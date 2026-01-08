import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainCollection {
    public static void main(String[] args) {
        int[] codes = {65, 66, 67, 68, 69};
        System.out.println(codes.length);
        System.out.println(codes[0]);
        System.out.println(codes[1]);
        System.out.println(Arrays.toString(codes));

        List<Integer> codes2 = new ArrayList<>();
        codes2.add(codes[0]);
        codes2.add(codes[1]);
        System.out.println(codes2.size());
        System.out.println(codes2.get(0));
        System.out.println(codes2.get(1));
        System.out.println(codes2);

        List<Integer> codes3 = new LinkedList<>();
        codes3.add(codes[0]);
        codes3.add(codes[1]);
        System.out.println(codes3.size());
        System.out.println(codes3.get(0));
        System.out.println(codes3.get(1));
        System.out.println(codes3);

        List<User> users = new ArrayList<>();
        User user1 = new User(1, "Alice");
        users.add(user1);
        users.add(new User(2, "Bob"));
        users.add(new User(3, "João"));

        System.out.println(users.contains(user1));
        System.out.println(users.contains(new User(1, "Alice")));

        List<Integer> vector = new Vector<>();

    }
}

