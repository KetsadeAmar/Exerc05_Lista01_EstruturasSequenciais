import java.util.Scanner;

public class App {

     //Início do Programa
     public static void main(String[] args) throws Exception {

     //Declaração de Variaveis

      double metros;
      double centimetros;

      // Entrada de Dados
      Scanner teclado = new Scanner(System.in);
      System.out.println ("Digite um valor em metros: ");
      metros = teclado.nextDouble();
      teclado.close();

      // Calcular Metros
      centimetros = metros * 100;

      // Exibir a Resposta para o Usuário
      System.out.println(metros + " metros equivalem a " + centimetros + " centimetros");
    }

}    




