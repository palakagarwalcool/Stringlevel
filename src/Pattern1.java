/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Palak
 */
public class Pattern1 {
    public static void main(String[] args){
    String s="JAVA";
    int i,j;
    for(i=0;i<s.length();i++)
    {
        for(j=0;j<=i;j++)
        {
            System.out.print(s.charAt(j));
        }
        System.out.println();
    }
    }
    
}
