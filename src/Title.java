/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Palak
 */
import java.util.Scanner;


public class Title{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("plz enter any String");
        String str,r = "";
        char ch;
        int l;
        str = sc.nextLine();
        //str = str.toLowerCase();
        str = " " + str;
        l = str.length();
        for(int i =0;i<l;i++)
        {
          ch = str.charAt(i);
          if(ch == ' ')
          {
             r = r + ch;
             i++;
             ch = Character.toUpperCase(str.charAt(i));
          }
          else
              ch = Character.toLowerCase(str.charAt(i));
          r = r + ch;
        }
        System.out.println(r.substring(1));
        

     }
    
}

