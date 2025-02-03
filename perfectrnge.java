public class perfectrnge {
    public static void main(String[] args) {
        int start = 5;
        int end = 100;

        for (int i = start; i <= end; i++) {
            int sum = 0;
            
           
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
