
import java.text.ParseException;

public class ej1 {
    public static void main(String[] args) {
        
        cambiaStrings("aeiou r", "eo z w");
        //entreDosFechas( "05/06/2024", "25/06/2024");
    
    }

    public static void cambiaStrings(String a,String b){

        String primero = "";
        String segundo = "";

        for (int i=0;i<a.length();i++) {
            boolean valido = true;
            for (int j=0;j<b.length();j++) {
                if(a.charAt(i)==b.charAt(j)){
                    valido=false;
                }
            }
            if (valido==true) {
                primero=primero+a.charAt(i);
            }
        }

        for (int i=0;i<b.length();i++) {
            boolean valido = true;
            for (int j=0;j<a.length();j++) {
                if(b.charAt(i)==a.charAt(j)){
                    valido=false;
                }
            }
            if (valido==true) {
                segundo=segundo+b.charAt(i);
            }
        }
        

        System.out.println(primero+" primero");
        System.out.println(segundo+" segundo");

    }

    public static void entreDosFechas(String a ,String b){
        //Comprobamos el primer string
        String[] separado1 = a.split("/");
        String[] separado2 = b.split("/");

        int primerNumero = Integer.parseInt(separado1[0]); 
        int segundoNumero = Integer.parseInt(separado2[0]);

        primerNumero

        boolean valido1 = false;
        boolean valido2 = false;


        for (int i = 1;i<31;i++) {
            if ( primerNumero  ) {
                
            }
        }
    }


}

