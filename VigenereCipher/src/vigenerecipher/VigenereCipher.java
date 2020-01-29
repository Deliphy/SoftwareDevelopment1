/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vigenerecipher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Character;
import java.util.StringTokenizer;

/**
 *University of Central Florida
 * CIS3360 - Fall 2017
 * Program Author: Michael Bruen George and Sean Simpson
 */
public class VigenereCipher {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
     {
         StringBuilder inputText = new StringBuilder();
         
         if(args.length != 3)
         {
             System.out.println("Program must have 3 arguments. 1. Text file 2. Keyword 3. Initialization Vector (must be same length as key)");
             System.exit(0);
         }
          try
        {
           File textFile = new File(args[0]);
           Scanner input = new Scanner(new FileInputStream(textFile));
           int count = 0;
        
           while( input.hasNext() )
           {
            inputText.append(input.nextLine());
           }
          
          
        } catch(FileNotFoundException fnfe)
         {
            System.out.println("File not found!");
         }
          
     
        String text = inputText.toString();
        String key = args[1];
        String IV = args[2];
        
        if(key.length() != IV.length())
        {
           System.out.print("Error: Key and IV must be the same length");
           System.exit(0);
        }
        
        System.out.println("CBC Vigenere Cipher by: Michael Bruen George and Sean Simpson");
        System.out.println("Plaintext file name: " + args[0]);
        System.out.println("Vigenere keyword: " + args[1]);
        System.out.println("Initialization Vector: " + args[2]);
        System.out.println();
        System.out.println("Clean Plaintext: ");
        System.out.println();
        
        
        printer(Parse(text));
        System.out.println();
        System.out.println("Ciphertext: ");
        System.out.println();
        printer(Parse(text));
        System.out.println();
        System.out.println();
        System.out.println("Number of characters in clean plaintext file: " + Parse(text).length());
        System.out.println("Block size: " + IV.length());
        int pads = 0;
        //whoops 
        System.out.println("Number of pad characters added: " + pads);
        
        
      
    }
     
     
     
    static void printer(String input) {
        int counter = 0;
        for(int i=0;i<input.length();i++)
        {
           
           if(counter== 79){
               System.out.println();
               counter=0;
        }
         System.out.print(input.charAt(i));
         counter ++;
        }
   
        }
     
     static String Parse(String text)
     {
         
         StringBuilder parsedTxt = new StringBuilder();
         for (int i = 0, j = 0; i < text.length(); i++)
         {
            char c = text.charAt(i);
            c = Character.toLowerCase(c);
            if ((c < 'a' || c > 'z')) continue;
          
            parsedTxt.append(c);
         }
         return parsedTxt.toString();
     }
     
   /* WHOOPS
     static void CBC(String text, String key, String IV)
    {
        int i,j;
        int counter =-1;
        String block1 = new String();
        String[][] blocks = new String[(text.length()/IV.length())+1][IV.length()];
        for(i=0;i<IV.length();i++)
        
            block1 = 
        
        for(i=0;i<text.length();i++)
        {
           System.out.println(i + "This is i");
           if(i % IV.length() == 0)
           {
              counter += 1;
          
            for(j = 0; i< IV.length() ; i++)
        {
        }
        } 
           }
           }
    
        }
    }
     
     WHOOPS
 */
    
}
