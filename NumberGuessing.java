import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int random = (int)(Math.random() * 99+1);
        System.out.println("Descubra um número entre 0 e 100");
        System.out.println("Digite um número");
        
        do{
            try{    
                int escolha = input.nextInt();
                if(escolha == random){
                    System.out.println("Parabéns, você acertou o número!");
                    System.exit(0);
                }
                else if(escolha > random){  
                    System.out.println("Errado! Digite um valor menor");
                }
                else{
                    System.out.println("Errado! Digite um valor maior");
                }
            }
            catch(InputMismatchException erro){
                System.out.println("Você digitou algo errado. Tente novamente!");
            }
        }
        while(true);
    }
}