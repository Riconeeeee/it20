/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MultidimensionalArray;

/**
 *
 * @author User
 */
public class MultidimensionalArray {
    public static void main(String[] args) {
     String [][] motors = {{"Skygo ", "Rusi ", "Bajaj ", "Xrm ", "Stx "}};
     for (int i = 0;i <motors.length; i++){
         for (int j = 0;j <motors[i].length; j++){
         System.out.println(motors[i][j] + "");
         }
         System.out.println();
         
     }
            
    }
}
