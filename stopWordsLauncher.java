import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stopWordsLauncher {
    public static void main(String[] args) {
        List<String> stopWordsArray = new ArrayList<>(
                List.of("a", "an", "the", "so", "it", "do", "did", "for", "by", "of", "to"));

        String word;

        Scanner input = new Scanner(System.in);
        LinkedList<String> words = new LinkedList<String>();

        while (true) {
            System.out.println("Enter a word:");
            word = input.nextLine();

            if (word.equals("")) {
                break;
            } else {
                words.add(word);
                continue;
            }
        }


        words.stream()
                .distinct()
                .filter(x -> !stopWordsArray.contains(x))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

            }


        }



