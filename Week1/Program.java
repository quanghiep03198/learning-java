package Week1;

import java.util.Scanner;
import java.util.Arrays;

public class Program {

   public static void main(String[] args) {
      String unstandardizedName = " TrUong   QuAnG     HIep";
      unstandardizedName = unstandardizedName.trim().replaceAll("\\s+", " ");
      String[] subNames = unstandardizedName.split(" ");

      String[] standardizedSubNames = Arrays.stream(subNames)
            .map(name -> name.substring(0).toUpperCase() + name.substring(1).toLowerCase()).toArray(String[]::new);
      String standardizedName = String.join(" ", standardizedSubNames);

      System.out.println("My name: " + standardizedName);
      // int[] arr = { 1, 2, 3, 4, 5 };

      // int[] mappedArr = Arrays.stream(arr).map(item -> item * 2).toArray();

      System.out.println("My name: " + standardizedName);

   }

}