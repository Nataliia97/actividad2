public class Ejercicio8 extends Base{

        public static void main(String[] args) {
            String fechadenacimiento="";
            String cumpleanos="";
            int cumpleanosenentero;
            String signozodiacal="";

            screen.println("Ingrese una fecha de nacimiento en formato AAAA-MM-DD: ");
            fechadenacimiento=keyboard.nextLine();
            cumpleanos=fechadenacimiento.substring(5,7)+fechadenacimiento.substring(8,10);
            cumpleanosenentero=Integer.parseInt(cumpleanos);
            if ((cumpleanosenentero>=120 && cumpleanosenentero<=131)||(cumpleanosenentero>=201 && cumpleanosenentero<=218))
                signozodiacal="Acuario";
            else if ((cumpleanosenentero>=219 && cumpleanosenentero<=229)||(cumpleanosenentero>=301 && cumpleanosenentero<=320))
                signozodiacal="Piscis";
            else if ((cumpleanosenentero>=321 && cumpleanosenentero<=331)||(cumpleanosenentero>=401 && cumpleanosenentero<=419))
                signozodiacal="Aries";
            else if ((cumpleanosenentero>=420 && cumpleanosenentero<=430)||(cumpleanosenentero>=501 && cumpleanosenentero<=520))
                signozodiacal="Tauro";
            else if ((cumpleanosenentero>=521 && cumpleanosenentero<=531)||(cumpleanosenentero>=601 && cumpleanosenentero<=620))
                signozodiacal="Géminis";
            else if ((cumpleanosenentero>=621 && cumpleanosenentero<=630)||(cumpleanosenentero>=701 && cumpleanosenentero<=722))
                signozodiacal="Cáncer";
            else if ((cumpleanosenentero>=722 && cumpleanosenentero<=731)||(cumpleanosenentero>=801 && cumpleanosenentero<=822))
                signozodiacal="Leo";
            else if ((cumpleanosenentero>=823 && cumpleanosenentero<=831)||(cumpleanosenentero>=901 && cumpleanosenentero<=922))
                signozodiacal="Virgo";
            else if ((cumpleanosenentero>=923 && cumpleanosenentero<=930)||(cumpleanosenentero>=1001 && cumpleanosenentero<=1022))
                signozodiacal="Libra";
            else if ((cumpleanosenentero>=1023 && cumpleanosenentero<=1031)||(cumpleanosenentero>=1101 && cumpleanosenentero<=1121))
                signozodiacal="Escorpio";
            else if ((cumpleanosenentero>=1122 && cumpleanosenentero<=1130)||(cumpleanosenentero>=1201 && cumpleanosenentero<=1221))
                signozodiacal="Sagitario";
            else if ((cumpleanosenentero>=1222 && cumpleanosenentero<=1231)||(cumpleanosenentero>=101 && cumpleanosenentero<=119))
                signozodiacal="Capricornio";

            if(!signozodiacal.isEmpty())
                screen.println("Su signo zodiacal es: "+signozodiacal);
            else
                screen.println("No se pudo determinar su signo zodiacal");
        }
    }

