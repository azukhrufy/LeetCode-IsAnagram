/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isanagram;

import java.util.Arrays;

/**
 *
 * @author zukhruf
 */
public class IsAnagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "MotherInLaw";
        String t = "HitlerWoman";
        System.out.println(isAnagram(s,t));
    }
    static boolean isAnagram(String s, String t) {
        String s1 = s.replaceAll("\\s","");
        String s2 = t.replaceAll("\\s","");
        boolean result = true;
        //first check the lengh of each string
        if(s1.length() != s2.length()){
            result = false;
        }else{
            char[] arrays1 = s1.toLowerCase().toCharArray();
            char[] arrays2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arrays1);
            Arrays.sort(arrays2);
            result = Arrays.equals(arrays1,arrays2);
        }
        return result;
    }
    
}
