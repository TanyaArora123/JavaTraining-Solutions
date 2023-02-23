package practiceexamples;

class poweroftwo {
    static boolean checknumber(int n) {
        if (n == 0)
            return false;

        double v1 = Math.log(n) / Math.log(2);
        double v = v1;
        return (int) (Math.ceil(v))
                == (int) (Math.floor(
                v1));
    }

    // Driver Code
    public static void main(String[] args) {
        if (checknumber(31))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (checknumber(64))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

