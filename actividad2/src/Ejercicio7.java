public class Ejercicio7 extends Base{
    public static void main(String[] args) {
        long numerocelular = 0;
        long prefijocelular = 0;
        String operadorcelular = "";
        String tipodeoperador = "";
        String infraestructuradeloperador = "";
        String prefijoasignado = "";

        screen.println("Ingrese un numero de telefono para hallar informacion relacionada a el");
        numerocelular = keyboard.nextLong();
        prefijocelular = numerocelular/10000000;
        if(prefijocelular>=300 & prefijocelular<=304){
            operadorcelular="Tigo";
        }
        else if(prefijocelular==324){
            operadorcelular="Tigo";
        }
        else if(prefijocelular>=310 & prefijocelular<=314){
            operadorcelular="Claro";
        }
        else if(prefijocelular>=320 & prefijocelular<=323){
            operadorcelular="Claro";
        }
        else if(prefijocelular>=315 & prefijocelular<=318){
            operadorcelular="Movistar";
        }
        else if(prefijocelular==319){
            operadorcelular="Virgin";
        }
        else if(prefijocelular>=350 & prefijocelular<=351){
            operadorcelular="Exito";
        }
        else if(prefijocelular>=305 & prefijocelular<=308){
            operadorcelular="Wom";
        }


        if(operadorcelular=="Claro"){
            tipodeoperador="Operador movil con red";
        }
        else if(operadorcelular=="Movistar"){
            tipodeoperador="Operador movil con red";
        }
        else if(operadorcelular=="Tigo"){
            tipodeoperador="Operador movil con red";
        }
        else if(operadorcelular=="Virgin"){
            tipodeoperador="Operador movil virtual";
        }
        else if(operadorcelular=="Exito"){
            tipodeoperador="Operador movil virtual";
        }
        else if(operadorcelular=="Wom"){
            tipodeoperador="Operador Movil virtual";
        }


        if(operadorcelular=="Virgin"){
            infraestructuradeloperador=" De Movistar.";
        }
        else if(operadorcelular=="Exito"){
            infraestructuradeloperador=" De Tigo.";
        }
        else if(operadorcelular=="Wom"){
            infraestructuradeloperador=" De Tigo, Claro y Movistar.";
        }
        else{
            infraestructuradeloperador="Infraestructura propia.";
        }

        if(operadorcelular=="Claro"){
            prefijoasignado=" De 310 a 314 y 320 a 323";
        }
        else if(operadorcelular=="Tigo") {
            prefijoasignado = " De 300 a 304 y 324";
        }
        else if(operadorcelular=="Movistar"){
            prefijoasignado=" De 315 a 318";
        }
        else if(operadorcelular=="Virgin"){
            prefijoasignado=" Solo el 319";
        }
        else if(operadorcelular=="Exito"){
            prefijoasignado=" El 350 y el 351";
        }
        else if(operadorcelular=="Wom"){
            prefijoasignado=" Del 305 al 308";
        }
    }
}
