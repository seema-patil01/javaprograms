public class Automarphic {
    public static void main(String[] args) {
        int n = 5;
        int original = n;
        int sq = n * n;
        boolean flag = true;

        while (n > 0) {
            if (n % 10 != sq % 10) {
                flag = false;
                break;
            }
            n /= 10;
            sq /= 10;
        }

        if (flag) {
            System.out.println(original + " is Automorphic");
        } else {
            System.out.println(original + " is not Automorphic");
        }
    }
}
