package main.java.com.ismartphone;

import java.util.Collection;

import main.java.com.app.App;
import main.java.com.ieletronico.Eletronico;

public interface ISmartphone extends Eletronico {
  public void instalarApp(App umApp);
  public void desinstalarApp(App umApp);
  public Collection<App> recuperarAppsInstalados();
}
