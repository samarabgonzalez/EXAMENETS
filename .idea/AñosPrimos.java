public class Mainb {
    public static void main(String[] args) {
        int añoPrimo = 0;
        int año = 2008;
        añoPrimo = getAñoPrimo(año, añoPrimo);
        esParImpar(añoPrimo);
    }

    private static void esParImpar(int añoPrimo) {
        System.out.println("El primer año primo encontrado es " + añoPrimo);
        if (añoPrimo % 2 != 0) {
            System.out.println("Que es un año par");
        } else
        if (añoPrimo > 2008) {
            if (añoPrimo < 2033) {
                System.out.println("y está comprendido entre 2008 y 2033");
            }
        }
        return;
    }

    private static int getAñoPrimo(int año, int añoPrimo) {
        while (año <= 2033) {
            if (añoPrimo == 0) {
                boolean esPrimo = true;
                for (int i = año - 1; i > 1; i--) {
                    if (año % i == 0) {
                        esPrimo = false;
                    }
                }
                if (esPrimo) {
                    añoPrimo = año;
                }
            }
            año++;
            continue;
        }
        return añoPrimo;
    }
}