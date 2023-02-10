package main.java.com.smartphone;

import java.util.Collection;

import main.java.com.app.App;
import main.java.com.celular.Celular;
import main.java.com.ismartphone.ISmartphone;

public class Smartphone extends Celular implements ISmartphone {
  private Collection<App> aplicativosInstalados;

  public Smartphone(String umFabricante, String umModelo, float umaMemoria) {
    super(umFabricante, umModelo, umaMemoria);
  }

  public void exibirAppsInstalados() {
    for (App app : aplicativosInstalados) {
      System.out.println(app);
    }
  }

  public float recuperarMemoriaDisponivel() {
    float memoriaDisponivel = 0;
    for (App app : aplicativosInstalados) {
      memoriaDisponivel += app.getTamanhoEmMB();
    }
    return memoriaDisponivel;
  }

  @Override
  public void instalarApp(App umApp) {
    if (recuperarMemoriaDisponivel() < umApp.getTamanhoEmMB()) {
      System.out.println("Não há espaço suficiente para instalar o app " + umApp.getTitulo());
    } else {
      aplicativosInstalados.add(umApp);
    }
  }

  @Override
  public void desinstalarApp(App umApp) {
    //verifica se tem app instalado, se sim busca o app e remove, senão informa que não tem app instalado
    if (aplicativosInstalados.isEmpty()) {
      System.out.println("Não há apps instalados");
    } else {
      for (App app : aplicativosInstalados) {
        if (app.getTitulo().equals(umApp.getTitulo())) {
          aplicativosInstalados.remove(app);
        }
      }
    }

  }

  @Override
  public Collection<App> recuperarAppsInstalados() {
    return aplicativosInstalados;
  }
  
}
