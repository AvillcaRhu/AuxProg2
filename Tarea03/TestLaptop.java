import java.util.Scanner;

public class TestLaptop {

  /* b) y e) Retorna la laptop con mas aplicaciones (la primera si hay empate) */
  public static Laptop laptopConMasApps(Laptop[] laptops) {
    Laptop mayor = laptops[0];
    for (int i = 1; i < laptops.length; i++) {
      if (laptops[i].getCantApps() > mayor.getCantApps()) {
        mayor = laptops[i];
      }
    }
    return mayor;
  }

  /* c) Agrega la aplicacion a la laptop del modelo indicado */
  public static boolean agregarAppAModelo(Laptop[] laptops, String modelo, Aplicacion app) {
    for (int i = 0; i < laptops.length; i++) {
      if (laptops[i].getModelo().equals(modelo)) {
        return laptops[i].agregarAplicacion(app);
      }
    }
    return false;
  }

  /* d) Elimina las apps de todas las laptops cuya pantalla tenga el ancho indicado */
  public static int eliminarAppsPorAncho(Laptop[] laptops, int ancho) {
    int afectadas = 0;
    for (int i = 0; i < laptops.length; i++) {
      if (laptops[i].getPantalla().getAncho() == ancho) {
        laptops[i].eliminarAplicaciones();
        afectadas++;
      }
    }
    return afectadas;
  }

  public static void mostrarTodas(Laptop[] laptops) {
    for (int i = 0; i < laptops.length; i++) {
      System.out.println(laptops[i]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Aplicaciones independientes (agregacion): varias laptops pueden compartirlas
    Aplicacion[] catalogo = {
      new Aplicacion("Chrome", 300), new Aplicacion("Word", 450),
      new Aplicacion("Excel", 450), new Aplicacion("Spotify", 200),
      new Aplicacion("VSCode", 350), new Aplicacion("Zoom", 200),
      new Aplicacion("Steam", 600)
    };
    String[] tipos = {"LED", "OLED", "IPS"};
    int[] anchos = {1366, 1920, 2560};
    int[] altos = {768, 1080, 1440};

    // a) Instancia N objetos Laptop en un vector
    System.out.print("Cantidad de laptops N: ");
    int n = sc.nextInt();
    Laptop[] laptops = new Laptop[n];
    for (int i = 0; i < n; i++) {
      laptops[i] = new Laptop("M" + (i + 1), tipos[i % 3], anchos[i % 3], altos[i % 3]);
      int cantidad = 1 + (i * 2) % catalogo.length; // cantidad de apps distinta por laptop
      for (int j = 0; j < cantidad; j++) {
        laptops[i].agregarAplicacion(catalogo[(i + j) % catalogo.length]);
      }
    }
    System.out.println("\n--- Laptops creadas ---");
    mostrarTodas(laptops);

    // b) Laptop con mas aplicaciones
    System.out.println("\n--- b) Laptop con mas aplicaciones ---");
    System.out.println(laptopConMasApps(laptops));

    // c) Agrega una aplicacion a la laptop de modelo X
    System.out.print("\n--- c) Modelo X al que agregar la app (ej. M1): ");
    String modelo = sc.next();
    Aplicacion nueva = new Aplicacion("Photoshop", 800);
    if (agregarAppAModelo(laptops, modelo, nueva)) {
      System.out.println("Aplicacion agregada a " + modelo);
    } else {
      System.out.println("No se pudo agregar (modelo inexistente o laptop llena)");
    }

    // d) Elimina las apps de las laptops con pantalla de ancho Y
    System.out.print("\n--- d) Ancho Y de pantalla (1366, 1920 o 2560): ");
    int y = sc.nextInt();
    int afectadas = eliminarAppsPorAncho(laptops, y);
    System.out.println("Laptops afectadas: " + afectadas);

    // e) Laptop con mas aplicaciones (despues de los cambios)
    System.out.println("\n--- e) Laptop con mas aplicaciones ---");
    System.out.println(laptopConMasApps(laptops));

    // f) Ordena las apps de cada laptop (tamanio decreciente, empate por nombre)
    for (int i = 0; i < laptops.length; i++) {
      laptops[i].ordenarAplicaciones();
    }
    System.out.println("\n--- f) Apps ordenadas ---");
    mostrarTodas(laptops);

    sc.close();
  }
}
