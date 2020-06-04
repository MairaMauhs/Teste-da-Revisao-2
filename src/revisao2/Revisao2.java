/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao2;

/**
 *
 * @author AliraMaria
 */
public class Revisao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // A granja Frangotech possui um controle automatizado de cada frango da sua produção.
     //No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são 
     //dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel 
     //com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para calcular 
     //o gasto total da granja para marcar todos os seus frangos.
    
    
      double peD , peE, galo, galo2; //peD= pé direito e peE= pé esquerdo
      peD = 4.00;
      peE = 7.00; //Na verdade é duas vezea de 3,50 por isso 7 (3,50 + 3,50)

      
      Scanner ler =new Scanner(System.in);
      
      System.out.println("Diga por favor quantos galos:");
      galo galos = scanner.nextDouble();
      galo = peD + peE;
      
      galo2= galo*(peE+peD);
      
      System.out.println("O gasto total é de: R$ "+galo2);
      
    }
    
}
