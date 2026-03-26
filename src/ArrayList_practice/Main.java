package ArrayList_practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        ArrayList = A resizable array that stores objects(autoboxing).
//                Arrats are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList();
        list.add(3);
        list.add(23);
        list.add(31);
        list.add(21);
        //list.remove(1);
        list.set(0, 22);
        System.out.println(list);
        System.out.println(list.get(2));
        Collections.sort(list);
        System.out.println(list);
        for(int num: list){
            System.out.println(num);
        }


        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the number of food you would like ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i <= numOfFood; i++){
            System.out.println("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
        scanner.close();
    }
}
