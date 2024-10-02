import java.util.regex.Pattern;

public class TestRemoveInList {
    public static void main(String[] args) {
//        Map<String, Integer> a = new HashMap<>();
//        a.put("hi", 1);
//        a.put("ha", 2);
//        System.out.println(Arrays.toString(a.entrySet().stream().flatMap(entry -> Stream.of(entry.getKey(), entry.getValue())).toArray()));
//
//        List<Integer> listInt = new ArrayList<>(List.of(1, 2, 3, 4));
//        listInt.removeIf(b -> b == 2 || b == 3);
//        System.out.println(listInt);
//
//        System.out.println(String.format("%s hihi", "hoan"));
        String allCountryRegex = "^((\\+)?((\\(\\d{1,3}\\))|\\d{1,3}))?[- .]?((\\(\\d{1,4}\\))|\\d{1,4})[- .]?((\\(\\d{1,4}\\))|\\d{1,4})[- .]?((\\(\\d{1,4}\\))|\\d{1,4})$";
        String phone = "+84 984.(432)-(4344)";
        if (Pattern.compile(allCountryRegex).matcher(phone).matches()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
