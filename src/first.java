import sun.reflect.generics.tree.Tree;

import java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String arr[] = w.split(" ");
        Map<Integer,Integer> weight = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            String temp[] = arr[i].split("");
            int sum = 0;
            for(int j = 0; j < temp.length; j++){
                sum += Integer.parseInt(temp[j]);
            }
            weight.put(num,sum);
        }
        System.out.println("new things added");


    }
}




