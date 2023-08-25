import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] quoteCharArray = quote.toCharArray();

        HashMap<Character, Integer> charHashMap = new HashMap<>();

        for (char value : quoteCharArray) {
            if (charHashMap.containsKey(value)) {
                charHashMap.put(value, charHashMap.get(value) + 1);
            } else {
                charHashMap.put(value, 1);
            }
        }

        for (char c : charHashMap.keySet()) {
            int numOfChars = charHashMap.get(c);
            System.out.println(c + ": " + numOfChars);
        }

    }
}