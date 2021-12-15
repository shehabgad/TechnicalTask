package com.meme;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static boolean two_strings(String s1, String s2)
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        Set<Character> s1_s2Characters = new HashSet<Character>();
        for(int i = 0; i < s1.length(); i++)
            s1_s2Characters.add(s1.charAt(i));
        for(int i = 0; i < s2.length(); i++)
            if(s1_s2Characters.contains(s2.charAt(i)))
                return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        if(two_strings(s1,s2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
