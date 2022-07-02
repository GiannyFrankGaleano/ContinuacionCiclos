public class sucesionFibonacci {
    public static void main(String[] args) {
        int num = 0, numDos = 0, numTres = 0, numCuatro = 0;

        System.out.println("serie con for:  ");
        for (num = 0; num < 10; num++) {

            if (num < 9) {
                System.out.print(numDos + ",");
                numCuatro = num + numDos;
                numDos = numTres;
                numTres = numCuatro;
            } else {
                System.out.print(num);
            }
        }
    }
}
