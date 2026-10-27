package enJava;

public class Pantalla {

  private String tipo;
  private int ancho;
  private int alto;

  public Pantalla(String tipo, int ancho, int alto) {
    this.tipo = tipo;
    this.ancho = ancho;
    this.alto = alto;
  }

  public String getTipo() {
    return this.tipo;
  }

  public int getAncho() {
    return this.ancho;
  }

  public int getAlto() {
    return this.alto;
  }

  public String toString() {
    return this.tipo + " " + this.ancho + "x" + this.alto;
  }
}
