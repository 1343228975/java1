package self_Study.for_exeise;



public class foraz {
    public static void main(String[] args) {
   
        char num = 'a';
        int count = 0;
        for (int i = 0; i < 26; i++) {

            System.out.print(num + " ");
            num += 1;
            count++;
            if (count % 5 == 0) {
                System.out.println();

            }
        }
    }
}
