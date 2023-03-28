/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedrapat;

import java.util.Scanner;

/**
 *
 * @author 82318900
 */
public class CriaJogador {
    public static void CriaJogador(){
                String nome;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite o nome do Jogador");
        nome = sc.next();
        
        Jogador player1 = new Jogador(nome, 0 , 5);
        Jogador player2 = new Jogador("CPU" , 0 , 5);
        
        System.out.println("Player1-" + player1.getNome());
        System.out.println("Player2-" + player2.getNome());
        
    }
}
