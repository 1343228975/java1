package self_Study.arrExcise;

public class Hannuota {
    public static void main(String[] args) {
        hanNuoTA hanNuoTA = new hanNuoTA();
        hanNuoTA.hanNUO(64, 'A', 'B', 'C');
    }

}

class hanNuoTA {
    public void hanNUO(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "->" + c + " ");
        } else {
            hanNUO(num - 1, a, c, b);
            hanNUO(num - 1, b, a, c);
            System.out.println(a + "->" + c + " ");
        }

    }

}