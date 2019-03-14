/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_proposta2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Gabriel J. Todesco & Rodrigo Schneider
 */
public class Jogo {
    
    private Jogador jogador1;   
    private Jogador jogador2;
    private Jogador jogador3;
    private Jogador jogador4;
    
    public Jogo(){
        
    }
    
    public Jogo(Jogador jogador1, Jogador jogador2, Jogador jogador3, Jogador jogador4){
        setJogador1(jogador1);
        setJogador2(jogador2);
        setJogador3(jogador3);
        setJogador4(jogador4);
    }
    
    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public Jogador getJogador3() {
        return jogador3;
    }

    public void setJogador3(Jogador jogador3) {
        this.jogador3 = jogador3;
    }

    public Jogador getJogador4() {
        return jogador4;
    }

    public void setJogador4(Jogador jogador4) {
        this.jogador4 = jogador4;
    }
        
    public static String getRandom(){
        
        Random gerador = new Random();
        
        int numeroRandomico = gerador.nextInt(6) + 1;
      
        return Integer.toString(numeroRandomico);
    }
    
    public ArrayList verificarPossibilidades(String d1, String d2, String d3, String d4, String d5){ 
        
        int dado1 = Integer.parseInt(d1);
        int dado2 = Integer.parseInt(d2);
        int dado3 = Integer.parseInt(d3);
        int dado4 = Integer.parseInt(d4);
        int dado5 = Integer.parseInt(d5);
        
        ArrayList<Integer> dados = new ArrayList<Integer>();
        
        dados.add(dado1);
        dados.add(dado2);
        dados.add(dado3);
        dados.add(dado4);
        dados.add(dado5);
        
        // Ordena Array de dados
        Collections.sort(dados);
        
        ArrayList<String> possibilidades = new ArrayList<String>();
        
        // Verifica numeração básica 1, 2, 3, 4, 5, 6
        if(dados.contains(1))
            possibilidades.add("1");
        if(dados.contains(2))
            possibilidades.add("2");
        if(dados.contains(3))
            possibilidades.add("3");
        if(dados.contains(4))
            possibilidades.add("4");
        if(dados.contains(5))
            possibilidades.add("5");
        if(dados.contains(6))
            possibilidades.add("6");
        
        // Verificar números iguais para TRINCA, QUADRA ou GENERAL
        int nrAnterior    = 0;
        int nrAtual       = 0;
        int numerosIguais = 0;
        
        for(int i = 0; i < dados.size(); i++){
            nrAtual = dados.get(i);
            if(nrAtual == nrAnterior)
                numerosIguais ++;
            
            nrAnterior = nrAtual;
        }
        
        int [] numeros = calcularFrequenciaNumeros(dados);
        numerosIguais = calcularNumerosIguais(numeros);
        
        if(numerosIguais == 5){
            possibilidades.add("Trinca");
            possibilidades.add("Quadra");
            possibilidades.add("General");
        }else if(numerosIguais == 4){
            possibilidades.add("Trinca");
            possibilidades.add("Quadra");
        }else if(numerosIguais == 3)
            possibilidades.add("Trinca");
        
        // Verifica possibilidade de FULL-HAND
        if(dados.get(0) == dados.get(1) && dados.get(1) != dados.get(2) && dados.get(2) == dados.get(3) && dados.get(3) == dados.get(4))
            possibilidades.add("FullHand");
        else if(dados.get(0) == dados.get(1) && dados.get(1) == dados.get(2) && dados.get(2) != dados.get(3) && dados.get(3) == dados.get(4))
            possibilidades.add("FullHand");
        
        // Verifica sequência ALTA e BAIXA
        if(dados.get(0) == 1 &&
           dados.get(1) == 2 &&
           dados.get(2) == 3 &&
           dados.get(3) == 4 &&
           dados.get(4) == 5){
            possibilidades.add("Seq.Baixa");
        }else if(dados.get(0) == 2 &&
           dados.get(1) == 3 &&
           dados.get(2) == 4 &&
           dados.get(3) == 5 &&
           dados.get(4) == 6){
            possibilidades.add("Seq.Alta");
        }
        
        return possibilidades;
        
    }
        
    public int [] calcularFrequenciaNumeros(ArrayList<Integer> dados){
        int [] frequencia;
        
        frequencia = new int [6];
        
        for(int num:dados){
            frequencia[num -1] ++;
        }
        
        return frequencia;
    }
    
    public int calcularNumerosIguais(int [] numero){
        int qtdNumerosIguais = 0;
        
        for(int num:numero){
            if(num > qtdNumerosIguais){
                qtdNumerosIguais = num;
            }
        }
        
        return qtdNumerosIguais;
    }
    
}