import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestVarargs {
//    public static <T> T[] meow(T... elements) {
//        return elements;
//    }
//
//    public static <T> void hack(T seed) {
//
//        T[] plant = meow(seed);
//
//        List<Integer> a = new ArrayList<>();
//        a.addAll((Collection<? extends Integer>) Arrays.asList(plant));
//        a.addAll(List.of(1, 2, 3));
//        System.out.println(a);
//    }
//
//    public static void main(String[] args) {
//        hack("kkk");
//    }

    public static <T> void hack(T... seed) {

        List<Integer> a = new ArrayList<>();
        a.addAll((Collection<? extends Integer>) Arrays.asList(seed));
        a.addAll(List.of(1, 2, 3));
        System.out.println(a);
    }

    public static void main(String[] args) {
        hack("kkk", "kkk");
    }

//    static <E> List<E> hi(List<E> list, E... elements) {
//        System.out.println(list);
//        System.out.println(elements);
//        for (E e : elements) {
//            list.add(e);
//        }
//        return list;
//    }
//    public static <E> void addAll(List<E> list, E... array) {
//
////        for (E element : array) {
////            list.add(element);
////        }
//        List<E> a = hi(list, array[0], array[1]);
//    }
//
//    public static void main(String[] args) {
//        // but here we get a warning
//        addAll(new ArrayList<>(),
//                new Pair<>("Leonardo", "da Vinci"),
//                new Pair<>("Vasco", "de Gama")
//        );
//    }
}