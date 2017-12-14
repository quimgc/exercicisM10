/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compradorparellssenars;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author quim
 */
public class CompradorParellsSenars {

    public static void main(String[] args) throws FileNotFoundException {
        List <Integer> nums = new LinkedList();

        Scanner in = new Scanner(new FileReader("Numeros.txt"));
        

          while(in.hasNext()){
            Integer i = Integer.parseInt(in.nextLine());
            nums.add(i);
        }
        in.close();
        
        
        Collections.sort(nums, new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                        if(o1.intValue() % 2 == 0){
                            if(o2.intValue() %2==0){
                                return o1.compareTo(o2);
                            }else {
                                //System.out.println(Math.abs(o1.compareTo(o2)));
                                return -1 * Math.abs(o1.compareTo(o2));
                            }
                        } else {
                            return o1.compareTo(o2);
                        }
                }
        });
        
        //Collections.sort(nums,(Integer o1, Integer o2) ->o1.compareTo(o2));
       
       for (int i = 0; i < nums.size(); i++) {
                System.out.println(nums.get(i));
            }         
            
       
      
        
        
    }
}
