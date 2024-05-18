public class Visitas {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No se ingresaron valores de visitas.");
            return;
        }

        int[] visitasDiarias = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                visitasDiarias[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: El argumento " + args[i] + " no es un número válido.");
                return;
            }
        }

        double prom = promedio(visitasDiarias);
        System.out.printf("Para la entrada anterior, el resultado es %.0f.\n",prom);
    }

    public static double promedio(int[] valores) {
        double prom = 0.0;
        for (int i = 0; i < valores.length; i++) {
            prom += valores[i];
        }
        return prom/valores.length;
    }
}
