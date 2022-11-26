import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = 0;
    
    System.out.println("Digite um número: ");
    x = sc.nextInt();
      System.out.println("O número escolhido foi: " +x+ ", O Cubo desse número é: "+(x*x*x));
    }
  }