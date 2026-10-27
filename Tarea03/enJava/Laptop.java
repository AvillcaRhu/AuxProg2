package enJava;
import java.util.Arrays;
import java.util.Comparator;
public class Laptop {

  private static final int MAX_APPS = 50;

  private String modelo;
  private int cantApps;
  private Aplicacion[] apps;
  private Pantalla pantalla;

  /* La Pantalla se crea dentro de la Laptop (composicion) */
  public Laptop(String modelo, String tipoPantalla, int ancho, int alto) {
    this.modelo = modelo;
    this.cantApps = 0;
    this.apps = new Aplicacion[MAX_APPS];
    this.pantalla = new Pantalla(tipoPantalla, ancho, alto);
  }

  public String getModelo() {
    return this.modelo;
  }

  public int getCantApps() {
    return this.cantApps;
  }

  public Pantalla getPantalla() {
    return this.pantalla;
  }

  /* c) Agrega una aplicacion; retorna false si la laptop ya tiene 50 */
  public boolean agregarAplicacion(Aplicacion app) {
    if (this.cantApps >= MAX_APPS) {
      return false;
    }
    this.apps[this.cantApps] = app;
    this.cantApps++;
    return true;
  }

  /* d) Elimina todas las aplicaciones de la laptop */
  public void eliminarAplicaciones() {
    for (int i = 0; i < this.cantApps; i++) {
      this.apps[i] = null;
    }
    this.cantApps = 0;
  }

  /* f) Ordena las aplicaciones de mayor a menor tamanio; si empatan, por nombre */
  public void ordenarAplicaciones() {
    Arrays.sort(this.apps, 0, this.cantApps, new Comparator<Aplicacion>() {
      public int compare(Aplicacion a, Aplicacion b) {
        if (a.getTamanio() != b.getTamanio()) {
          return Integer.compare(b.getTamanio(), a.getTamanio());
        }
        return a.getNombre().compareTo(b.getNombre());
      }
    });
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Laptop ").append(this.modelo)
      .append(" | Pantalla: ").append(this.pantalla)
      .append(" | Apps (").append(this.cantApps).append("):");
    if (this.cantApps == 0) {
      sb.append(" ninguna");
    }
    for (int i = 0; i < this.cantApps; i++) {
      sb.append("\n    - ").append(this.apps[i]);
    }
    return sb.toString();
  }
}
