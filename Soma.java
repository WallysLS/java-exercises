//Recebe qualquer quantidade de números do usuário e soma
// Caso o usuário digite algo errado, ele deve ter a chance de digitar novamente
import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja somar quantos números?");
        int quantidade = input.nextInt();
        int index = 0;
        System.out.println("Digite " + quantidade + " números");
        do{
            try{
                double numero1 = input.nextDouble();
                double numero2 = input.nextDouble();
                double soma = numero1 + numero2;
                System.out.println("A soma é igual a: " + soma);
            } 
            catch(InputMismatchException erro ){
                System.out.println("Você digitou algo errado! Tente novamente");
            } 
            index++;
        } while(index < quantidade );

}
}
    
