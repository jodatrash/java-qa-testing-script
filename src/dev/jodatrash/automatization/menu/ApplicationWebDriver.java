package dev.jodatrash.automatization.menu;

import dev.jodatrash.automatization.utils.ColorUtils;
import dev.jodatrash.automatization.utils.MessageUtils;

import java.util.Scanner;

public class ApplicationWebDriver {


  private final MenuSelection menuSelection;
  private final Scanner userInput;

  public ApplicationWebDriver(MenuSelection menuSelection) {
    this.menuSelection = menuSelection;
    this.userInput = new Scanner(System.in);
  }

  private int getUserInput() {
    return userInput.nextInt();
  }

  /*
  TODO: Hacer try-catch para evitar letras o
   caracteres especiales.
  */
  public void startApplication() {
    int option;
    do {
      displayMenu();
      option = getUserInput();
      optionProcess(option);
    } while (option != 0);
    userInput.close();
  }

  private void displayMenu() {
    System.out.println("Testing QA con selenium WebDriver");
    System.out.println("\nMenú de opciones.");
    System.out.println("[1] - Testear que demowebshop cargue correctamente.");
    System.out.println("[2] - Testear el inicio de sesión.");
    System.out.println("[3] - Testear la navegación en la web.");
    System.out.println("[4] - Testear la función de agregar al carrito.");
    System.out.println("=".repeat(51));
    System.out.println("[0] - Finalizar aplicativo.");
    System.out.println("=".repeat(51));
  }

  private void optionProcess(int option) {
    switch (option) {
      case 1:
        menuSelection.webCharge();
        System.out.println(ColorUtils.RED + MessageUtils.WEB_CHECK + ColorUtils.RESET);
        break;
      case 2:
        System.out.println(MessageUtils.WEB_LOGIN);
        menuSelection.webLogin();
        break;
      case 3:
        break;
      case 4:
        break;
      case 0:
        menuSelection.webClose();
        break;
      default:
        System.out.println(MessageUtils.INVALID_MESSAGE);
    }
  }

}
