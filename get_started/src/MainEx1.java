//import java.util.*; // importa tudo da class util
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainEx1 {
    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome";
    private static final Scanner scanner = new Scanner(System.in);
    private static final PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        // comentário de uma linha
        /*
        * comentario mais de uma linha
        * continua aqui
        * */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String nome = scanner.nextLine();
        System.out.println("informe a sua idade");
        int idade = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s", nome, idade);*/

        /*var person = new Person();
        //person.Nome = "Nelson";
        //person.Idade = 60;

        person.setNome("Nelson");
        person.setIdade(18);

        System.out.printf("Seu nome é: %s e sua idade é: %s anos.", person.getNome(), person.getIdade()  );

        var personRecord = new PersonRecord("Nelson", 60);
        var personRecord2 = new PersonRecord("José");
        System.out.println(personRecord);//acessa toString() implicitamente
        System.out.println(personRecord2);//acessa toString() implicitamente*/

        scanner.useDelimiter("\\n"); // permite a entrada de nome com espaço
                                            // exemplo -> Doguinho Caramelo.

        var option = -1;

        do {
            System.out.println("=== Escolha uma opção ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com Shampoo");
            System.out.println("4 - Verificar a água da máquina");
            System.out.println("5 - Verificar o Shampoo");
            System.out.println("6 - Verificar se tem pet no bano");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Tirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfPetInMachine();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                default -> System.out.println("Opção inválida!");
            }
        } while (option != 0);
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("A máquina está com " + amount + " litros de água.");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina está com " + amount + " litros de shampoo.");
    }

    private static void checkIfPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "tem pet na máquina" : "não tem pet na máquina");
    }

    public static void setPetInMachine() {
        var name = "";
        while (name.isEmpty()) {
            System.out.println("Digite o nome do pet: ");
            name = scanner.next();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina!" );
    }
}