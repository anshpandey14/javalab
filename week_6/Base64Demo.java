package week_6;

import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) {
        String original = "Hello World!";
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println("Encoded: " + encoded);

        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Decoded: " + decoded);
    }
}

