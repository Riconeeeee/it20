/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Displayviaforloop;

/**
 *
 * @author User
 */
public class Displayviaforloop {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        
        System.out.println("Numbers that are divisible by 5:");
        for (int i = 0; i < numbers.length; i++){
         System.out.println("Element at index" + i + ":" + numbers[i]);
        }
    }
}
