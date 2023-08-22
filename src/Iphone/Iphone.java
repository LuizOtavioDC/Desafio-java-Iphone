/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iphone;

import desafio.java.iphone.interfaces.AparelhoTelefonico;
import desafio.java.iphone.interfaces.Navegador;
import desafio.java.iphone.interfaces.ReprodutorMusical;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Luiz Otavio
 */
public class Iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical{

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iphone I = new Iphone();
        
        I.menu();
        
    }
    
    public void menu(){
       Scanner scan = new Scanner(System.in);
       int escolha;
       int subEscolha;
       System.out.println("Você esta no seu Iphone o que gostaria de Fazer");
       System.out.println("1 - Navegar");
       System.out.println("2 - Usar a função de telefone");
       System.out.println("3 - Escutar musica"); 
       System.out.println("4 - Sair");
       System.out.print("Digite a opção desejada: ");
       escolha = scan.nextInt();
       switch (escolha){
           case 1:
                System.out.println("Você esta no seu Navegador o que gostaria de Fazer");
                System.out.println("1 - Exibir pagina");
                System.out.println("2 - Adicionar nova aba");
                System.out.println("3 - atualizar pagina"); 
                System.out.println("4 - Voltar"); 
                System.out.print("Digite a opção desejada: ");
                subEscolha = scan.nextInt();
                switch (subEscolha){
                    case 1:
                        exibirPagina();
                        menu();
                    break;
                    case 2:
                        adicionarNovaAba();
                        menu();
                    break;
                    case 3:
                        atualizarPagina();
                        menu();
                    break;
                    case 4:
                        menu();
                    break;
                }
           break;
           case 2:
               System.out.println("Você esta no seu telefone o que gostaria de Fazer");
                System.out.println("1 - Ligar");
                System.out.println("2 - Atender");
                System.out.println("3 - Correio de voz"); 
                System.out.println("4 - Voltar"); 
                System.out.print("Digite a opção desejada: ");
                subEscolha = scan.nextInt();
                switch (subEscolha){
                    case 1:
                        ligar();
                        menu();
                    break;
                    case 2:
                        atender();
                        menu();
                    break;
                    case 3:
                         iniciarCorrerioVoz();
                         menu();
                    break;
                    case 4:
                        menu();
                        
                    break;
                }
           break;
           case 3:
               System.out.println("Você esta no seu reprodutor de musica o que gostaria de Fazer");
                System.out.println("1 - Tocar");
                System.out.println("2 - Pausar");
                System.out.println("3 - Selecinar uma musica"); 
                System.out.println("4 - Voltar"); 
                System.out.print("Digite a opção desejada: ");      
                subEscolha = scan.nextInt();
                switch (subEscolha){
                    case 1:
                        tocar();
                        menu();
                    break;
                    case 2:
                        pausar();
                        menu();
                    break;
                    case 3:
                        selecionarMusica();
                        menu();
                    break;
                    case 4:
                        menu();
                    break;
                }
           break;
           case 4:
               System.out.println("Saindo");
           break;
       }
    }

    @Override
    public void ligar() {
    try {
            System.out.print("Ligando."); 
             Thread.sleep(1000);
             System.out.print(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
         } catch (InterruptedException ex) {
            Logger.getLogger(Iphone.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void atender() {
    try {
            System.out.print("Você esta recebendo uma ligação.");
            System.out.print("Atendendo a Ligação."); 
             Thread.sleep(1000);
             System.out.print(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
            System.out.println("Você atendeu a ligação");
         } catch (InterruptedException ex) {
            Logger.getLogger(Iphone.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void iniciarCorrerioVoz() {
       try {
            System.out.print("Carregando correio de voz."); 
             Thread.sleep(100);
             System.out.print(".");
            Thread.sleep(100);
            System.out.println(".");
            Thread.sleep(100);
            System.out.println("Você tem varias mensagens disponivel");
         } catch (InterruptedException ex) {
            Logger.getLogger(Iphone.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void exibirPagina() {
        System.out.println("Você esta vendo uma pagina na web");
    }

    @Override
    public void adicionarNovaAba() {
     try {
            System.out.print("Adicionando Nova Aba no Navegaro."); 
             Thread.sleep(100);
             System.out.print(".");
            Thread.sleep(100);
            System.out.println(".");
            Thread.sleep(100);
            System.out.println("Nova Aba Criada");
         } catch (InterruptedException ex) {
            Logger.getLogger(Iphone.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void atualizarPagina() {
    try {
            System.out.print("Atualizando Pagina."); 
             Thread.sleep(100);
             System.out.print(".");
            Thread.sleep(100);
            System.out.println(".");
            Thread.sleep(100);
            System.out.println("Pagina Atualizada");
         } catch (InterruptedException ex) {
            Logger.getLogger(Iphone.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Você pausou a musica");    
    }

    @Override
    public void selecionarMusica() {
        try {
            System.out.print("Selecionado uma musica."); 
             Thread.sleep(1000);
             System.out.print(".");
            Thread.sleep(1000);
            System.out.println(".");
            Thread.sleep(1000);
            System.out.println("Você selecinou uma musica");
         } catch (InterruptedException ex) {
            Logger.getLogger(Iphone.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
