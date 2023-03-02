public class Main {
    public static void main(String[] args) {
        var A = -1;

        if( A > 0){
            System.out.println("Numero es positivo");
        }
        else if (A < 0){
            System.out.println("Numero es negativo");
        }
        else {
            System.out.println("Numero es zero");
        }

        var B = 1;
        while (B<3){
            B++;
            System.out.println(B);
        }
        do{
            System.out.println(B);
        B++;}
           while (B<3);

        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }
        var estacionDeAno= "otono";
        switch (estacionDeAno) {
            case "primavera":
                System.out.println("Estacion del ano es " + estacionDeAno + ".");
                break;
            case "verano":
                System.out.println("Estacion del ano es " + estacionDeAno + ".");
                break;
            case "otono":
                System.out.println("Estacion del ano es " + estacionDeAno + ".");
                break;
            case "invierno":
                System.out.println("Estacion del ano es " + estacionDeAno + ".");
                break;

            default:
                System.out.println("Es error");
        }
    }
    
}