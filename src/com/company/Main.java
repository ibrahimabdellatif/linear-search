package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//      int [] arr = new int[] {10,20,30,40,50};
//      int key = 10;
//        System.out.println(LinearSearch(arr ,key));
        System.out.println("please int number of element ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter element of " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Please Enter The Number That You Searched For ");
        int key = sc.nextInt();
        linearSearch(arr , key);
    }
    public static int  linearSearch(int[]arr , int key){
        boolean isFound = false;
        for (int i=0 ; i<arr.length ;i++){
            if (arr[i]==key){
                isFound =true;
                System.out.println("Element is Found There Index = "+ i);
            }
        }
        if (!isFound){
            System.out.println("element is not found !");
        }
        return -1;
    }
}
