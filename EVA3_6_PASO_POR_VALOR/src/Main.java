public class Main {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("Valor de x en main es: " + x);
        sumarValor(x);
        System.out.println("Valor de x despues de la funcion: " + x);
    }
    private static void sumarValor(int valor){
        System.out.println("Valor recibido en sumarValor es: " + valor);
        valor++;
        System.out.println("Valor modificado es: " + valor);

    }
}