public class Ejercicio3 extends Base{

    public static void main(String[] args) {
        int numero=0;
        String mensaje1 = "";
        String mensaje2 = "";
        screen.println("Ingrese un numero entero");
        numero=keyboard.nextInt();

        if(numero>0){
            mensaje1=" El numero es positivo";
        }
        else if(numero<0){
            mensaje1= " El numero es negativo";
        }
        else{
            mensaje1= " El numero es cero";
        }


        if(numero%2==0){
            mensaje2=" - El numero es par";
        }
        else{
            mensaje2=" - El numero es impar";


        }
        screen.println(mensaje1+mensaje2);
    }
}

