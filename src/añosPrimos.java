/**
 * The type Años primos.
 */
public class añosPrimos {
    /**
     * Método main que llama a los métodos para encontrar el primer año primo entre 2008 y 2033, y mostrar si es par o impar y si está comprendido entre esos años.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int añoPrimo = 0;
        int año = 2008;
        añoPrimo = getAñoPrimo(año, añoPrimo);
        esParImpar(añoPrimo);
    }

    /**
     * Método que recibe con parámetro un año primo y muestra por pantalla si es par o impar y si está comprendido entre 2008 y 2033
     * @param añoPrimo
     */
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

    /**
     * Método que recibe con parámetro un año y un año primo, y devuelve el primer año primo encontrado entre 2008 y 2033
     * @param año
     * @param añoPrimo
     * @return
     */
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