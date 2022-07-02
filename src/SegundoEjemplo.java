public class SegundoEjemplo {
    public static void main(String[] args) {

        int numero = 0;


        while (numero < 100) {
            numero = numero + 1;
            if (numero % 2 == 0) {
                System.out.println("numero: " + numero + " - " + "L");

            } else {
                System.out.println("numero: " + numero + " - " + "D");
            }
        }


    }
}
