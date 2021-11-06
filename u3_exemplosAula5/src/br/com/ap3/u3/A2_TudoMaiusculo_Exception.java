package br.com.ap3.u3;

public class A2_TudoMaiusculo_Exception {

  public static void main(String args[]) {
    String frase = null;
    String novaFrase = null;

    try {
      novaFrase = frase.toUpperCase();
    } catch (NullPointerException e) // CAPTURA DA possivel exceção
    {
      System.out.println("A frase inicial está nula. Foi atribuito o valor FraseVazia.");
      frase = "FraseVazia";
      novaFrase = frase.toUpperCase();
    }

    System.out.println("Frase antiga: " + frase);
    System.out.println("Frase nova: " + novaFrase);
  }
}