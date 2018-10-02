/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c;
import static java.awt.SystemColor.text;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author smohammadzai
 */
public class bin {
    File file = new File("B.txt");
   Scanner sc = new Scanner(file);
   String word=sc.nextLine();
   String receivedBinary=stringToBinary(word);
   System.out.println();
   String receivedWord=BinaryToString(receivedBinary);

    private String stringToBinary(String word) {
        throw new UnsupportedOperationException("Not supported yet."); 
         String bString="";
     String temp="";
     for(int i=0;i<text.length();i++)
     {
         temp=Integer.toBinaryString(text.charAt(i));
         for(int j=temp.length();j<8;j++)
         {
             
}
         bString+=temp+" ";
    }
     
     System.out.println(bString);
     return bString;

    private String BinaryToString(String receivedBinary) {
        throw new UnsupportedOperationException("Not supported yet."); 
        String[] code = binaryCode.split(" ");
     String word="";
     for(int i=0;i<code.length;i++)
     {
         word+= (char)Integer.parseInt(code[i],2);
     }
     System.out.println(word);
     return word;
    }
    
}
