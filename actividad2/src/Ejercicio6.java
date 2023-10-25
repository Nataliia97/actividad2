public class Ejercicio6 extends Base{

    public static void main(String[] args) {
        int altura1;
        int altura2;
        int altura3;
        int altura4;
        int posicion1=0;
        int posicion2=0;
        int posicion3=0;
        int posicion4=0;
        int aux=0;
        screen.println("Ingrese la primer altura en cm: ");
        altura1=keyboard.nextInt();
        screen.println("Ingrese la segunda altura en cm: ");
        altura2=keyboard.nextInt();
        screen.println("Ingrese la tercera altura en cm: ");
        altura3=keyboard.nextInt();
        screen.println("Ingrese la cuarta altura en cm");
        altura4=keyboard.nextInt();
        posicion1=altura1;
        posicion2=altura2;
        posicion3=altura3;
        posicion4=altura4;

        if(posicion1>posicion2)
            aux=posicion1;
            posicion1=posicion2;
            posicion2=aux;

        if (posicion2>posicion3)
            aux=posicion2;
            posicion2=posicion3;
            posicion3=aux;

        if (posicion3>posicion4)
            aux=posicion3;
            posicion3=posicion4;
            posicion4=aux;

        if (posicion1>posicion2)
            aux=posicion1;
            posicion1=posicion2;
            posicion2=aux;

        if (posicion2>posicion3)
            aux=posicion2;
            posicion2=posicion3;
            posicion3=aux;

        if (posicion1>posicion2)
            aux=posicion1;
            posicion1=posicion2;
            posicion2=aux;

        screen.println("El orden ascendente de las alturas mencionadas es : " +posicion1+" cm, " +posicion2+ " cm, " +posicion3+" cm y " +posicion4+ " cm");
    }
}
