import java.util.ArrayList;

public class MultiplosDeTres {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No se ingresaron valores.");
            return;
        }

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++) {
            try {
                numeros.add(Integer.parseInt(args[i]));
            } catch (NumberFormatException e) {
                System.out.println("Error: El argumento " + args[i] + " no es un número válido.");
                return;
            }
        }

        int sum = suma(numeros);
        double prom = promedio(numeros);
        System.out.printf("%d\n",sum);
        System.out.printf("%.0f\n",prom);

    }

    public static int suma(ArrayList<Integer> numeros) {
        int suma = 0;
        for(Integer num : numeros) {
            if (num%3 == 0) {
                suma += num;
            }
        }
        return suma;
    }

    public static double promedio(ArrayList<Integer> numeros) {
        double sum = 0;
        int count = 0;
        for(Integer num : numeros) {
            if (num%3 == 0) {
                sum += num;
                count++;
            }
        }
        return sum/count;
    }

}