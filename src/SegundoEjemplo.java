public class SegundoEjemplo {
    public static void main(String[] args) {
    //pintar los numeros del 10 al 1

    boolean terminar = true;
    int numero = 10;


    while(terminar){

        System.out.println("Numero: "+numero);

        numero = numero-1;

        if(numero<1){
            terminar = false;
        }
    }


    }
}
