package practiceexamples;

public class numbercheck {
    public boolean checkNumber(int num) {
        boolean flag = false;
        int current = num % 10;
        num = num / 10;
        while (num > 0) {
            if (num >= current) {

                flag = true;
                break;
            }
            current = num % 10;
            num = num / 10;
        }
        if (flag == true) {
            System.out.println("THis is an increasing number");
        } else {
            System.out.println("This is a decreasing order");
        }
        return flag;
    }

    public static void main(String[] args) {
     numbercheck numbercheck=new numbercheck();
     numbercheck.checkNumber(12345678);
    }
}


