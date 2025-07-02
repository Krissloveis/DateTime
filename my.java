import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class my {
    public static void main(String[] args) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now.format(formatter));

        while (true) {
            System.out.println("Введите сообщение:");
            String input = new Scanner(System.in).nextLine();
             switch (input) {
                 case "Hello!" -> System.out.println("Hello!)");
                 case "How are you?" -> {
                     System.out.println("I'm Fine!");
                     System.out.println("And you?");
                 }
                 default -> System.out.println("I don't understand :(");

             }
        }
    }
}
