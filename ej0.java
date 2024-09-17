import java.util.Scanner;
public class ej0{
    public static void main(String[] args) {
        
        //mostrarNumeros(3,6);
        //System.out.println(sumarImpares(5));
        //calcularArea();
        mostrarBinario();

    }

    public static void mostrarBinario(){
        Scanner s = new Scanner(System.in);
        
        int random = (int) (Math.random()*256)-1;
        
        int numeroRandom = random;
        int variable = 0;
        String resultado = "";
        if(random==0){

        }else{
            if (random<2) {
                
            }else{

                do { 
                
                    int modulo = random%2;
                    random=random/2;

                    resultado=modulo+""+resultado;

                } while (random>1);
                if (random==1) {
                    resultado="1"+resultado;

                }
            }
        }


        System.out.println("Numero "+numeroRandom+" su binario es : "+resultado);
    
    }

    public static void calcularArea(){
        int answer  = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Calcular el area de \n1.Circulo 2.Cuadrado 3.Triangulo");
        answer=s.nextInt();

        switch (answer) {
            case 1:
                System.out.println("Introduce el radio");
                double radio = s.nextDouble();

                System.out.println("El area del circulo es : "+(radio*radio)*Math.PI);
            break;
            case 2:
            System.out.println("Introduce la base");
            double base = s.nextDouble();

            System.out.println("Introduce la altura");
            double altura = s.nextDouble();
            System.out.println("El area del triangulo es : "+(base*altura)/2);
        
            break;
            case 3:
                
            System.out.println("Introduce el lado");
            double lado = s.nextDouble();

            System.out.println("El area es "+lado*lado);

            break;
            default:

            System.out.println("Entrada invalida");
                throw new AssertionError();
        }
        
    } 

    public static int sumarImpares(int valor){
        int contador = 0;
        int num = 0;

        for (int i =0 ; i<=valor;i++) {
            if (i%2!=0) {
                num+=i;
            }
        }

        return num;

    }

    public static void mostrarNumeros(int num1,int num2){

        int numeroMayor = 0;
        int numeroMenor = 0;

        if (num1>=num2) {
            numeroMayor=num1;
            numeroMenor=num2;
        }else{
            numeroMayor=num2;
            numeroMenor=num1;
        }
        while (numeroMenor<numeroMayor) { 
            if (num1==numeroMenor) {
                
            }else{
                System.out.println(numeroMenor);

            }
            numeroMenor++;

        }

    }
}