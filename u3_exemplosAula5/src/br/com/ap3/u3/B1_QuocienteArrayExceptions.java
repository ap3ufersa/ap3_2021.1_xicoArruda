package br.com.ap3.u3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class B1_QuocienteArrayExceptions {

  public static int calculaQuociente(int numerador, int denominador) {
    return numerador / denominador;
  }

  public static void main(String[] args) {
    int tamanho = 10; // e se mudar o tamanho pra 6?
    int[] numeradores = { 16, 32, 64, 128, 256 };
    int[] denominadores = { 2, 4, 4, 0, 2 };

    for (int i = 0; i < tamanho; i++) {
      try {
        System.out.print(numeradores[i] + "/" + denominadores[i] + "=");
        System.out.println(calculaQuociente(numeradores[i], denominadores[i]));
      } catch (ArithmeticException aritException) {
        System.err.println("O número do divisor deve ser diferente de 0!");
      } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
        System.err.println("Tentei acessar uma posição inválida:" + i);
      }
    }
  }
}
