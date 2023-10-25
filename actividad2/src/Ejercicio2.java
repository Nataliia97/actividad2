public class Ejercicio2 extends Base{

    public static void main(String[] args) {
        String mensaje="";
        int numero;
        screen.println("Ingrese un numero entero");
        numero=keyboard.nextInt();
        if (numero>0){
            mensaje="El numero ingresado es positivo";
        }
        else if(numero==0){
            mensaje="El numero ingresado es cero";
        }
        else
            mensaje="El numero ingresado es negativo";

        screen.println(mensaje);
    }
}
