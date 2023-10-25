public class Ejercicio5 extends Base{
    public static void main(String[] args) {
        int altura1;
        int altura2;
        int altura3;
        int posicion1=0;
        int posicion2=0;
        int posicion3=0;
        int aux=0;
        screen.println("Ingrese la primer altura en cm: ");
        altura1=keyboard.nextInt();
        screen.println("Ingrese la segunda altura en cm: ");
        altura2=keyboard.nextInt();
        screen.println("Ingrese la tercera altura en cm: ");
        altura3=keyboard.nextInt();
        posicion1=altura1;
        posicion2=altura2;
        posicion3=altura3;
        if (posicion1>posicion2) {
            aux=posicion1;
            posicion1=posicion2;
            posicion2=aux;
        }
        if (posicion2>posicion3){
            aux=posicion2;
            posicion2=posicion3;
            posicion3=aux;
        }
        if (posicion1>posicion2){
            aux=posicion1;
            posicion1=posicion2;
            posicion2=aux;
        }
        screen.println("El orden ascendente de las alturas mencionadas es : " +posicion1+" cm, " +posicion2+ " cm y " +posicion3+" cm");
    }
}

