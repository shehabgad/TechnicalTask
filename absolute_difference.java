package com.meme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static int absoluteDifference(ArrayList<Integer> array)
    {
        Collections.sort(array);
        int minDiff = array.get(array.size() - 1) - array.get(0);
        for(int i = 0; i < array.size() - 1; i++)
        {
            int a = array.get(i);
            int b = array.get(i + 1);
            if(b - a < minDiff)
                minDiff = b - a;
        }
        return minDiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            array.add(num);
        }
        int ans = absoluteDifference(array);
        System.out.println(ans);
    }
}
