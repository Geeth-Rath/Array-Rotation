package org.example;

import java.util.Arrays;

public class ArrayRotation {
   String str = "ABCD";
   StringBuilder sb = new StringBuilder();
    public void getArrayRotate(int index){
        for (int i = index; i <= str.length()-1 ; i++) {
            sb.append(str.charAt(i));

        }
        for (int i = 0; i <= index-1; i++) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }

    public void reverseWithBubbleRotation(int index){
        char c [] = str.toCharArray();
        for (int j = 0; j <index ; j++) {
            for (int i = c.length-1; i > 0 ; i--) {

                char temp = c[i];
                c[i] = c[i-1];
                c[i-1] = temp;

            }
        }

        System.out.println("ABCD is rotated: " + Arrays.toString(c));
    }
    public void reverseWithSpliting(int index){
       String first =  str.substring(0,index);
       String second = str.substring(index, str.length()-1);
       String firstReverse = reverseWord(first);
       String secondReverse = reverseWord(second);
        System.out.println(firstReverse+ secondReverse);


//       System.out.println(first);


    }
    public String reverseWord(String s){
        char [] sc = s.toCharArray();
        int start = 0;
        int end = sc.length-1;

        while(start < end){
            System.out.println("dd:"+ end);
            char temp = sc[start];
            sc[start] = sc[start+1];
            sc[start+1] = temp;
            start++;
        }
        return String.valueOf(sc);
    }
}
