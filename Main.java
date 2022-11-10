import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Digite um número inteiro.");
            try{
                int numero = input.nextInt();
                if(numero % 2 == 0){
                    System.out.println(numero + " é um número par.");
                }
                else{
                    System.out.println(numero + " é um número impar.");
                }
            }
            catch(InputMismatchException erro){
                System.out.println("Essa entrada é inválida.");
                input.nextLine();
            }
            System.out.println("Você gostaria de tentar novamente? Digite 1 para sim e 2 para não");
            try{
                int jogar = input.nextInt();
                if(jogar == 1){
                input.nextLine();
                }
                else if(jogar == 2){
                    System.exit(0);
                }
            } 
            catch(InputMismatchException erro){
                System.out.println("Entrada inválida. Digite 1 ou 2");
            }
            
           
        } while(true); 
    }
}

