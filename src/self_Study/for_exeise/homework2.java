package self_Study.for_exeise;

public class homework2 {
    public static void main(String[] args) {

      double sum = 0;
        for (int j = 1; j <= 100 ; j++) {
            if (j % 2 != 0){
                sum = sum + (1.0/j);

            }
            else {
                sum = sum - (1.0/j);
            }

        }
     System.out.println(sum);
    }

}
