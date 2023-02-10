package main.java.com.app;

public class App {
  private String titulo;
  private String fabricante;
  private float tamanhoEmMB;

  public App(String titulo, String fabricante, float tamanhoEmMB) {
    this.titulo = titulo;
    this.fabricante = fabricante;
    this.tamanhoEmMB = tamanhoEmMB;
  }

  //gettes e settes
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getFabricante() {
    return fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  public float getTamanhoEmMB() {
    return tamanhoEmMB;
  }

  public void setTamanhoEmMB(float tamanhoEmMB) {
    this.tamanhoEmMB = tamanhoEmMB;
  }
}
