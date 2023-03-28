package pedrapat;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Scanner;

public class Tabuleiro {
    public static void main(String[]args){
        int palpite, iaComputador;
    
        Scanner sc = new Scanner(System.in);
    
        System.out.println("1-pedra");
        System.out.println("2-papel");
        System.out.println("3-tesoura");
        palpite = sc.nextInt();
        iaComputador =random.nextInt(3)+1;
        if(iaComputador==1)
            System.out.println("1- pedra");
        else if(iaComputador==2){
            System.out.println("2- papel");
        }
        else{
            System.out.println("3- tesoura");
        }
        if(iaComputador==palpite){
            System.out.println("Empate");
        }
        if(iaComputador==1 && palpite== 2){
            System.out.println("você venceu");
        }        
        if(iaComputador==1 && palpite== 3){
            System.out.println("você perdeu");
        }
        if(iaComputador==2 && palpite== 1){
            System.out.println("você perdeu");
        }      
        if(iaComputador==2 && palpite== 3){
            System.out.println("você venceu");
        }
    }
}
