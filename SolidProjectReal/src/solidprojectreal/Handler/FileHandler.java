/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidprojectreal.Handler;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author William
 */
public class FileHandler {
    public int scoreFile;
    public String danishWord;
    public String englishWord;

    
    public void writeToFile(String scoreStr) {
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("score.txt"), "utf-8"));
            writer.write(scoreStr);
        } catch (IOException ex) {
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {
            }
        }
    }
    
    public void readWordFile(int i) throws IOException{
     
       //Name of the file
       String fileName="language.txt";
       try{

        
          FileReader inputFile = new FileReader(fileName);

   
          BufferedReader bufferReader = new BufferedReader(inputFile);

          
          String line;

         
          while ((line = bufferReader.readLine()) != null)   {
           
            String split[] = line.split(",");
         
            danishWord = "" + split[i];
            englishWord = "" + split[i+1];
              System.out.println(split.length);
              System.out.println(danishWord);
              System.out.println(englishWord);
            
            
            
            }
         
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Fejl ved linje:" + e.getMessage());                      
       }
    }
    
    public void readScore(){
        
       //Name of the file
       String fileName="score.txt";
       try{

        
          FileReader inputFile = new FileReader(fileName);

   
          BufferedReader bufferReader = new BufferedReader(inputFile);

          
          String line;

         
          while ((line = bufferReader.readLine()) != null)   {
           
              scoreFile = Integer.parseInt(line);

            }
         
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Fejl ved linje:" + e.getMessage());                      
       }
    }
    
    public void addToList(){
        
    }
    public int getScoreFile() {
        return scoreFile;
    }

    public void setScoreFile(int scoreFile) {
        this.scoreFile = scoreFile;
    }

    public String getDanishWord() {
        return danishWord;
    }

    public void setDanishWord(String danishWord) {
        this.danishWord = danishWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }
}
