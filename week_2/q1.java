public class q1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            // Convert each argument from String to int
            sum += Integer.parseInt(args[i]);
        }

        System.out.println("Sum = " + sum);
    }
}
