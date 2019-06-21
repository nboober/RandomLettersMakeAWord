import java.util.Scanner;
import java.util.ArrayList;

public class RandomLettersMakeAWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        ArrayList<String> random = new ArrayList<>();
        String quit = "";


        do {
            System.out.println("Give me a length for a word: ");
            int word = scanner.nextInt();

            for (int i = 0; i < word; i++) {
                random.add(array[((int) (Math.floor(Math.random() * 26)))]);

            }

            for (int i = 0; i < random.size(); i++) {
                System.out.print(random.get(i));
            }

            if (!random.contains("a") && !random.contains("e") && !random.contains("i") && !random.contains("o") && !random.contains("u")) {
                System.out.print(" is not a word.");
            } else {
                System.out.print(" might be a word.");
            }

            random.clear();

            System.out.println("\n\nWould you like to play again? If not, type \"quit\".");
            quit = scanner.next();

        }while(!quit.equalsIgnoreCase("quit"));


    }
}
