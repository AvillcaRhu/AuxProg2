
public class Aplicacion {

  private String nombre;
  private int tamanio;

  public Aplicacion(String nombre, int tamanio) {
    this.nombre = nombre;
    this.tamanio = tamanio;
  }

  public String getNombre() {
    return this.nombre;
  }

  public int getTamanio() {
    return this.tamanio;
  }

  public String toString() {
    return this.nombre + " (" + this.tamanio + " MB)";
  }
}
