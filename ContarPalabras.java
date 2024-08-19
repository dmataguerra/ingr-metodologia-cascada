import java.util.StringTokenizer;
import java.io.*;

public class ContarPalabras {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Ingresa la palabra a contabilizar: ");
        String oracion = br.readLine();
        StringTokenizer oracionSeparada = new StringTokenizer(oracion, " ");

        System.out.println("La oracion tiene "+ oracionSeparada.countTokens() + " palabras");
    }
}