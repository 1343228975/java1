package self_Study.for_exeise;

public class homework03 {
    public static void main(String[] args) {
        int sum = 1,sum2 = 0;
        for (int i = 1; i <= 100; i++) {

            for (int j = 1; j <= i+1 ; j++) {
                sum2 += j;
            }

        }

    System.out.println(sum2);
    }

}
