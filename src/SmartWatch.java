import java.util.ArrayList;

public class SmartWatch {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No se ingresaron valores de pasos diarios.");
            return;
        }

        ArrayList<Integer> pasosDiarios = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++) {
            try {
                pasosDiarios.add(Integer.parseInt(args[i]));
            } catch (NumberFormatException e) {
                System.out.println("Error: El argumento " + args[i] + " no es un número válido.");
                return;
            }
        }

        int limInf = 200;
        int limSup = 100000;
        ArrayList<Integer> pasosDiariosFiltrados = clearSteps(pasosDiarios,limInf,limSup);

        double prom = promedio(pasosDiariosFiltrados);
        System.out.printf("%.0f\n",prom);
    }

    public static double promedio(ArrayList<Integer> valores) {
        double prom = 0.0;
        if (valores.isEmpty()) {
            System.out.println("No existe valores validos para calcular el promedio.");
            return prom;
        }

        for (Integer valor : valores) {
            prom += valor;
        }
        return prom/valores.size();
    }

    public static ArrayList<Integer> clearSteps(ArrayList<Integer> valores, int limInf, int limSup) {
        ArrayList<Integer> valoresFiltrados = new ArrayList<Integer>();
        for (Integer item : valores) {
            if(item >= limInf && item <= limSup) {
                valoresFiltrados.add(item);
            }
        }

        return valoresFiltrados;
    }

}
