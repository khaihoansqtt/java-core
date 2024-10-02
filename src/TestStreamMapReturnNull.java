import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class TestStreamMapReturnNull {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 5).boxed().map(i -> {
            if (i == 3) return null;
            return i;
        }).filter(Objects::nonNull).toList();
        System.out.println(list);
    }
}
