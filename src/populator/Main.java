package populator;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Type[] types = populator.ProductPopulator2.class.getGenericInterfaces();
//        System.out.println(types.length);
//        for (Type type : types) {
//            var paraType = (ParameterizedType) type;
//            System.out.println("raw type: " + paraType.getRawType());
//            System.out.println("argument " + paraType.getActualTypeArguments()[0]);
//            System.out.println("argument " + paraType.getActualTypeArguments()[1]);
//        }
//        Type[] types = populator.ProductPopulator3.class.getGenericInterfaces();
//        System.out.println(types.length);
//        for (Type type : types) {
//            var classA = (Class) type;
//            System.out.println(classA.getName());
//            Type[] types1 = classA.getGenericInterfaces();
//            System.out.println(types1.length);
//            for (Type type1 : types1) {
//            for (Type type1 : types1) {
//                var paraType = (ParameterizedType) type1;
//                System.out.println("raw type: " + paraType.getRawType());
//                System.out.println("argument " + paraType.getActualTypeArguments()[0]);
//                System.out.println("argument " + paraType.getActualTypeArguments()[1]);
//            }
//        }
        Integer[] a = {1, 2, 3};
        System.out.println(Optional.of(a).map(Object::getClass).map(Class::isArray).orElse(false));
    }
}