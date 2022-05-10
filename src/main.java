public class main {

    public static void bucle(int inicio, int fin){
        while (inicio <= fin) {
            System.out.println("Número: " + inicio);
            inicio++;
        }
    }

    public static void main(String[] args){
        int numeroGrande = 10;
        int numeroChico = 1;
        double unFloat = 0.5;
        char unCaracter = 's';
        String unaCadena = "Hola, Mundo! Esto es una variable";
        calculadora calc = new calculadora();

        if (numeroGrande > numeroChico) {
            System.out.println("Número chico es más pequeño");
        } else {
            System.out.println("Has puesto mal los números");
        }
        System.out.println("Hola, mundo! " + numeroGrande);
        System.out.println(unaCadena + unCaracter);
        System.out.println("Un float aquí es un double => " + unFloat);

        bucle(numeroChico, numeroGrande);
        for (int i = 0; i < 10; i++) {
            System.out.println("I: " + i);
        }

        calc.saludo();
        System.out.println("La suma de numeroChico + numeroGrande es: " + calc.suma(numeroChico, numeroGrande));
    }
}
