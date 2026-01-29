import dev.jodatrash.automatization.menu.ApplicationWebDriver;
import dev.jodatrash.automatization.menu.MenuSelection;

public class MainApp {
  public static void main(String[] args) throws Exception {

    MenuSelection menuSelection = new MenuSelection();
    ApplicationWebDriver appDriver = new ApplicationWebDriver(menuSelection);
    appDriver.startApplication();

  }
}