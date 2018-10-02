/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b.pkgtry.txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;



/**
 *
 * @author smohammadzai
 */
public class BTryTxt {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // To open CSV File
        String fileName = "A.csv";
       
        File file = new File(fileName);
        //Scanner content=new scanner(C:\Users\smohammadzai\Desktop\Network Programming\b try.txt\src);
       // PrintStream o =new PrintStream(new File("Users/smohammadzai/Desktop/Network Programming/B.txt"));
        try
        {
            try (Scanner inputStream = new Scanner(file)) {
                while (inputStream.hasNext()){
                    String A =inputStream.next();
                    System.out.println(A);
                    String data = inputStream.next();
      
                    Scanner read = new Scanner (System.in);
                    String reverse = "";
                    int l = 0;
                    for(int i = A.length()-l; i>=0; i--)
                    { reverse = reverse + A.charAt(i);
                    
                    } 
                    
                    System.out.printIn(reverse); 
                
                }
                inputStream.close();
        }
        }catch (FileNotFoundException e){
       
                        
    }
    //close reader

  
    }
  
}
