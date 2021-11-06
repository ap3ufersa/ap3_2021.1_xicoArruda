package br.com.ap3.u3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class B2_QuocienteArrayFinnaly {

  public static int calculaQuociente(int numerador, int denominador) throws ArithmeticException {
    return numerador / denominador;
  }

  public static void main(String[] args) {
    int tamanho = 5;
    int[] numeradores = { 16, 32, 64, 128, 256 };
    int[] denominadores = { 2, 4, 4, 0, 2 };

    for (int i = 0; i < tamanho; i++)
      try {
        System.out.print(numeradores[i] + "/" + denominadores[i] + "=");
        System.out.println(calculaQuociente(numeradores[i], denominadores[i]));
      } catch (InputMismatchException inputException) {
        System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
      } catch (ArithmeticException aritException) {
        System.err.println("O número do divisor deve ser diferente de 0!");
      } finally {
        System.out.println("Execução do Finally!");
      }
  }
}
