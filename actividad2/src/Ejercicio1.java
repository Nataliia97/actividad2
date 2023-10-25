public class Ejercicio1 extends Base{

        public static void main(String[] args) {
            String mensaje="";
            int numero=0;
            int residuo=0;
            screen.println("Ingrese un numero entero");
            numero=keyboard.nextInt();
            residuo=numero%2;
            if (residuo==0){
                mensaje="El numero ingresado es par";
            }
            else{
                mensaje="El numero ingresado es impar";
            }
            screen.println(mensaje);
        }
    }