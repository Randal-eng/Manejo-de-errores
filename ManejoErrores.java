
public class ManejoErrores {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();

        System.out.println("Ejemplo Manejo de errores");
        
        //Establecer numero a las variables
        numeros.setNum1(20);
        numeros.setNum2(10);

        int num1 = numeros.getNum1();
        int num2 = numeros.getNum2();
        
        //Imprimir el valor de las variables
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);

        //Dividir un valor entre cero en un try catch
        try {
            //Ejecutar operacion
            int resultado = num1/0;
            System.out.println(resultado);
        } catch (Exception e) {
            //Mensaje de error
            System.out.println("No se puede dividir entre cero!!!");
        }
    }
}
