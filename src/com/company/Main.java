package com.company;

public class Main {

    public static void main(String[] args) {
	int [] array1 = {1,2,3,4,5};
    int [] array2 = {6,7,8,9,0};
    int [] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array3.length; i++) {
            if (i<= array1.length-1){
                array3[i] = array1[i];
            }
            if (i > array1.length-1){
               array3[i]=array2[i- array1.length];
                }
            }
        for(int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
        }
        }

    }

