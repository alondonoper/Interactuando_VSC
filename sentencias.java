import java.util.Scanner;

public class sentencias {
    public static void main(String[] args) {
        ciclo4();
    }

    private static void condicional1() {
        int numero;
        var sc = new Scanner(System.in);

        System.out.print("Ingrese el número: ");
        numero = sc.nextInt();

       if (numero > 0) {
                System.out.println("El número es positivo");
       } else if (numero < 0) {
                System.out.println("El número es negativo");

       } else{
                System.out.println("El número no es negativo ni positivo");
       }

       sc.close();
    }

    private static void condicional2() {
        var sc = new Scanner(System.in);  
        System.out.print("Ingrese una letra: ");
        var letra = sc.nextLine();

        switch (letra) {
            case "a":
                System.out.println("Es una vocal");              
                break;

            case "e":
                System.out.println("Es una vocal"); 
                break;
            
            case "i":
                System.out.println("Es una vocal"); 
                break;

            case "o":
                System.out.println("Es una vocal"); 
                break;

            case "u":
                System.out.println("Es una vocal");
                break;
        
            default:
                System.out.println("Es una consonante"); 
                break;
        }


    }

    private static void ciclo1() {
        var numero = 5;
        
        while (numero > 0) {
            System.out.println(numero--);
        }

        System.out.println("Booooooom!");

    }

    private static void ciclo2(){
        var numero = 10;

        do {
            System.out.println(numero);
            numero--;

        } while (numero > 0);
        System.out.println("Despegue!!!!!!");
    }

    private static void ciclo3(){
        var resultado = 1;

        for (var numero = 5; numero > 0; numero--){
            resultado *= numero;
        }

        System.out.println(resultado);
    }

    private static void ciclo4(){
        var frutas = new String[]{
            "Manzana", "Pera", "Naranja", "Mandarina", "Limon"
        };
        for (var fruta : frutas) {
            System.out.println("La fruta es: "+ fruta);
        }
    }

    private static void ciclo5(){

    }

}


