package main.java.com.celular;

import main.java.com.ieletronico.Eletronico;

public class Celular implements Eletronico {
  private String fabricante;
  private String modelo;
  private float capacidadeMemoria;

  public Celular(String umFabricante, String umModelo, float umaMemoria) {
    this.fabricante = umFabricante;
    this.modelo = umModelo;
    this.capacidadeMemoria = umaMemoria;
  }

  @Override
  public void ligar() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void desligar() {
    // TODO Auto-generated method stub
    
  }

  //gettes e settes
  public String getFabricante() {
    return fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public float getCapacidadeMemoria() {
    return capacidadeMemoria;
  }

  public void setCapacidadeMemoria(float capacidadeMemoria) {
    this.capacidadeMemoria = capacidadeMemoria;
  }
  
}
