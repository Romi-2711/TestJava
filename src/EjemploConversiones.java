public class EjemploConversiones {

  public static void main(String[] args) {
    int a = 5;
    int b = 7;

    double c = 0.5;

    c = a; // c (double puede almacenar int) guarda el contenido de a (int)

    a = (int)c; // casting

    String s = "7";
    b = s; //b es int y s string
    b = Integer.parseInt(s);



  }

}
