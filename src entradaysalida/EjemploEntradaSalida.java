import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploEntradaSalida {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    String s = br.readLine();
    System.out.println("La variable s vale: "+s);

  }

}
