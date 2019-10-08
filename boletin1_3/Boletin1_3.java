
package boletin1_3;

import java.util.Scanner;


public class Boletin1_3 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("teclea la cantidad de euros:");
    float euros = sc.nextFloat();
    System.out.println("teclea el cambio");
    float cambio = sc.nextFloat();
    float dolares = euros*cambio;
    System.out.println(euros+" euros son "+dolares+" dolares");
    }
    
}
