public class Ejercicio4 extends Base{

    public static void main(String[] args) {

        String mensaje="";
        int costollanta1=120000;
        int costollanta2=108000;
        int costototalllantas;
        int cantidadllantas;
        screen.println("Ingrese la cantidad de llantas que usted necesita");
        cantidadllantas= keyboard.nextInt();
        if (cantidadllantas<4) {
            costototalllantas=costollanta1*cantidadllantas;
            mensaje="La cantidad total que debe pagar es:" +costototalllantas;
        }
        else{
            costototalllantas=costollanta2*cantidadllantas;
            mensaje="La cantidad total que debe pagar es:" +costototalllantas;
        }
        screen.println(mensaje);
    }
}

