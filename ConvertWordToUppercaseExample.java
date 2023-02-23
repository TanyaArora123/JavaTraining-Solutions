package practiceexamples;

public class ConvertWordToUppercaseExample {

    public static void main(String[] args) {
        String s = "b.v.raju college";
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("raju")) {
                words[i] = words[i].toUpperCase();
            }
            String result = String.join(" ", words);
            System.out.println(result);
        }
    }
}
