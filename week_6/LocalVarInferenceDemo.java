package week_6;

public class LocalVarInferenceDemo {
    public static void main(String[] args) {
        var message = "Hello, Local Variable Type Inference!";
        System.out.println(message);

        var list = java.util.List.of(1, 2, 3);
        list.forEach(System.out::println);
    }
}
