public class MasCiclos {

    public static void main(String[] args) {
       //ciclo while
        // pintar numeros del 1 al 10
        boolean noHaTerminado = true;

        int numero = 1;
        while (noHaTerminado){

            System.out.println("Numero "+numero);

            numero = numero+1;

            if(numero>10){

                noHaTerminado = false;

            }
        }

    }
}
