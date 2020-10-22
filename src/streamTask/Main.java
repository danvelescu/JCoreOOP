package streamTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Streams {
    ////////////////////////// Ex 1
    public void getMultiply2_List(List<Integer> myList) {

        myList = myList.stream().map(integer ->
                integer * 2
        ).collect(Collectors.toList());

        System.out.println(myList);
    }

    ////////////////////////// Ex 2
    public void reverseString(String word) {
        List<String> myList = new ArrayList<>();

        Collections.addAll(myList, word.split(""));

        List reversList = new ArrayList();

        myList.stream().forEach(s -> {
            reversList.add(myList.get(myList.size() - reversList.size() - 1));
        });
        reversList.stream().forEach(s -> System.out.print(s));
    }

    ////////////////////////// Ex 3
    public void showNum(List<Integer> numbers) {
        System.out.println(numbers);
        System.out.println("Give me a number of element: ");
        Scanner sc = new Scanner(System.in);
        Integer nr = sc.nextInt();
        System.out.println(numbers.stream().skip(nr - 1).findFirst().get());
    }

    ////////////////////////// Ex 4
    public List<Integer> convertListToInt(List<String> listOfString) {
        List<Integer> numbers = new ArrayList<>();

        listOfString.stream().forEach(s -> {
            numbers.add(Integer.parseInt(s));
        });
        System.out.println(numbers);
        return numbers;
    }

    ////////////////////////// Ex 5 - 6
    public void findMax_Min(List<Integer> numbers) {
        System.out.println(numbers);
        System.out.println("Max : " + numbers.stream().max((i, j) -> i.compareTo(j)).get());
        System.out.println("Min : " + numbers.stream().min((i, j) -> i.compareTo(j)).get());
    }

    ////////////////////////// Ex 7
    public List giveListWithoutDub(List list) {
        List listWD = (List) list.stream().distinct().collect(Collectors.toList());
        System.out.println("List : " + list);
        System.out.println("List without duplicate elements:" + listWD);
        return listWD;
    }

    ////////////////////////// Ex 8
    public void readFile(String fileName) {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Streams s = new Streams();
        List<Integer> myList = new ArrayList();
        List<String> strList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        strList.add("1");
        strList.add("3");
        strList.add("3");
        strList.add("4");
        strList.add("4");


        //   s.getMultiply2_List(myList);
        //  s.reverseString("Reverse");
        // s.showNum(myList);
        //myList.addAll(s.convertListToInt(strList));
        //s.findMax_Min(myList);
        //s.giveListWithoutDub(strList);
        s.readFile("src/streamTask/textfor.txt");
    }
}
