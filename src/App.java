import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("caliente", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("ardiente", "hot");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("abrasador", "hot");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");

        while (true) {
            String palabraUsuario = System.console().readLine("Introduzca una palabra y le daré los sinónimos: ");

            if (palabraUsuario.equals("salir")) {
                break;
            }

            if (!diccionario.containsKey(palabraUsuario)) {
                String nuevaTraduccion = System.console().readLine("No conozco esa palabra cuál es su traducción: ");
                diccionario.put(palabraUsuario, nuevaTraduccion);
            }

            String traduccionIngles = diccionario.get(palabraUsuario);

            ArrayList<String> sinonimos = new ArrayList<>();

            for (Map.Entry<String,String> entrada : diccionario.entrySet()) {
                String palabraDiccionario = entrada.getKey();
                String traduccionDiccionario = entrada.getValue();

                if (traduccionDiccionario.equals(traduccionIngles) && !palabraDiccionario.equals(palabraUsuario)) {
                        sinonimos.add(palabraDiccionario);
                }
            }

            System.out.println("Sinónimos de " + palabraUsuario + ": " + String.join(", ", sinonimos));
        }
    }
}
