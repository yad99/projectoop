/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1task1;
import java.io.FileInputStream;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class FileManager{

void copy(String SourceFile,String TargetFile) throws Exception{
  FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream(SourceFile);
         out = new FileOutputStream(TargetFile);
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }}
}

}

public class Lab1Task1 {

   
 public static void main(String[] args) throws Exception {

       FileManager FileManager=new FileManager();
       
        Scanner x=new Scanner(System.in);
        System.out.println("write name file you are went copy");
        String namefile=x.nextLine();
        System.out.println("write name file you are went pase in:");
        String namefile1=x.nextLine();
       
        FileManager.copy(namefile, namefile1);
        

   }
    
}
