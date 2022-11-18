import java.util.HashSet;

public class Main {

    static HashSet<Integer> numbersSet = new HashSet<>();

    public static void fillSet() {
        while (numbersSet.size() < 20) {
            int randomNumber = (int) (Math.random() * 1001 - 1);
            numbersSet.add(randomNumber);
        }
    }

    public static void viewSet() {
        System.out.println(numbersSet);
    }

    public static void main(String[] args) {
        fillSet();
        viewSet();
    }
}