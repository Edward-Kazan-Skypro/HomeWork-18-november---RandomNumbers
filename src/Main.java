import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    static HashSet<Integer> numbersSet = new HashSet<>();
    static ArrayList <Integer> numbersList = new ArrayList<>();

    public static void fillSet() {
        while (numbersSet.size() < 20) {
            int randomNumber = (int) (Math.random() * 1001 - 1);
            numbersSet.add(randomNumber);
        }
        System.out.println("Получены следующие числа:");
        System.out.println(numbersSet);
    }

    public static void removeOddNumbers (){
        for (Integer ns: numbersSet){
            if (ns%2 == 0) {
                numbersList.add(ns);
            }
        }
    }

    public static void viewSet() {
        System.out.println("Четные числа из полученного списка:");
        System.out.println(numbersList);
    }

    public static void main(String[] args) {
        fillSet();
        removeOddNumbers();
        viewSet();
    }
}