/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class One {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Answer for question1: Jahna Sri Aneela Ankam");
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
        list.add(in.nextInt());
        }
    removeDuplicate(list);

    System.out.print("The distinct integers are ");
    for (int i = 0; i < list.size(); i++) {
    System.out.print(list.get(i) + " ");
    }
    System.out.println();
        }

    public static void removeDuplicate(ArrayList<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
    for (int j = i + 1; j < list.size(); j++) {
    if (list.get(i) == list.get(j))
    list.remove(j);
    }
    }
    }
}

    

