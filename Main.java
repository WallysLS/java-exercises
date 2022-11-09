// Recebe um  número e fala se é par ou impar.
// O usuário deve ter a opção de jogar quantas vezes quiser
// Caso algo inválido seja digitado, retorna uma mensagem para digitar novamente

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
           
        } while(true);
      
    }
}

