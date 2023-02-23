package practiceexamples;

public class ConvertSecondLToUppercaseExample {
    public static void main(String[] args) {
        String str = "bvrit college";
        int firstLIndex = str.indexOf('l');
        if (firstLIndex != -1) {
            int secondLIndex = str.indexOf('l', firstLIndex + 1);
            if (secondLIndex != -1) {
                String beforeL = str.substring(0, secondLIndex);
                String afterL = str.substring(secondLIndex + 1);
                char secondL = Character.toUpperCase(str.charAt(secondLIndex));
                System.out.println(beforeL + secondL + afterL);
            }
        }
    }
}
