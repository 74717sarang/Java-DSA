import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!" + "/n");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 5, 4, 8, 2, 9, 2, 1, 8);

        // filter even no
        System.out.println(list);
        System.out.println("even No");
        list.stream()
                .filter(i -> i % 2 == 0)
//                .forEach(System.out::println);
                .forEach(i -> System.out.println(i));
//        .collect(Collectors.toList());
        System.out.println("even No");


        List<String> slist = Arrays.asList("sarang", "new", "Adac");

        System.out.println(slist);
        System.out.println("String Uppercase :: ");
        List<String> col = slist.stream()
                .map(i -> i.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(col);

        System.out.println("String Start With a :: ");
        System.out.println("return boolean ");
        slist.stream()
                .map(i -> i.startsWith("A"))
                .forEach(i -> System.out.println(i));
//                    .count()

        System.out.println("String Sort acen :: ");
        slist.stream()
                .sorted()
                .forEach(System.out::println);


        System.out.println("String Sort decending :: ");
        slist.stream()
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        int sum = list.stream()
                .mapToInt(i -> i)
                .sum();
        System.out.println("Sum=  " + sum);



    }
}

