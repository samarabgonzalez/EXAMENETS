public class Mainb {
    public static void main(String[] args) {
        int pp = 0;
        int a = 2008;
        while (a <= 2033) {
            if (pp == 0) {
                boolean ePr = true;
                for (int i = a - 1; i > 1; i--) {
                    if (a % i == 0) {
                        ePr = false;
                    }
                }
                if (ePr) {
                    pp = a;
                }
            }
            a++;
            continue;
        }
        System.out.println("El primer año primo encontrado es " + pp);
        if (pp % 2 != 0) {
        } else System.out.println("que es un año par");
        if (pp > 2008) {
            if (pp < 2033) {
                System.out.println("y está comprendido entre 2008 y 2033");
            }
        }
        return;
    }
}