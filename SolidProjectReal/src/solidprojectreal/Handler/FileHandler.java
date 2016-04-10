package solidprojectreal.Handler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 * @author Emil Elkjær Nielsen
 * @author William Pfaffe
 */

public class FileHandler {

    public int scoreFile;
    public int scoreFileMedium;
    public int scoreFileHard;
    public boolean easy;
    public boolean medium;
    public boolean hard;
    public String danishWord;
    public String englishWord;
    public JList<String> easyWordTemp;
    public JList<String> mediumWordTemp;
    public JList<String> hardWordTemp;

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

    public void readWordFileEasy(int i) throws IOException {

        //Name of the file
        String fileName = "languageEasy.txt";
        try {

            FileReader inputFile = new FileReader(fileName);

            BufferedReader bufferReader = new BufferedReader(inputFile);

            String line;

            while ((line = bufferReader.readLine()) != null) {

                String split[] = line.split(",");

                danishWord = "" + split[i];
                englishWord = "" + split[i + 1];
                System.out.println(split.length);
                System.out.println(danishWord);
                System.out.println(englishWord);

            }

            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Fejl ved linje:" + e.getMessage());
        }
    }

    public void readWordFileMedium(int i) throws IOException {

        //Name of the file
        String fileName = "languageMedium.txt";
        try {

            FileReader inputFile = new FileReader(fileName);

            BufferedReader bufferReader = new BufferedReader(inputFile);

            String line;

            while ((line = bufferReader.readLine()) != null) {

                String split[] = line.split(",");

                danishWord = "" + split[i];
                englishWord = "" + split[i + 1];
                System.out.println(split.length);
                System.out.println(danishWord);
                System.out.println(englishWord);

            }

            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Fejl ved linje:" + e.getMessage());
        }
    }

    public void readWordFileHard(int i) throws IOException {

        //Name of the file
        String fileName = "languageHard.txt";
        try {

            FileReader inputFile = new FileReader(fileName);

            BufferedReader bufferReader = new BufferedReader(inputFile);

            String line;

            while ((line = bufferReader.readLine()) != null) {

                String split[] = line.split(",");

                danishWord = "" + split[i];
                englishWord = "" + split[i + 1];
                System.out.println(split.length);
                System.out.println(danishWord);
                System.out.println(englishWord);

            }

            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Fejl ved linje:" + e.getMessage());
        }
    }

    public void readScore() {

        //Name of the file
        String fileName = "score.txt";
        try {

            FileReader inputFile = new FileReader(fileName);

            BufferedReader bufferReader = new BufferedReader(inputFile);

            String line;

            while ((line = bufferReader.readLine()) != null) {

                scoreFile = Integer.parseInt(line);

            }

            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Fejl ved linje:" + e.getMessage());
        }
    }

    public void addWord(String danishWord, String englishWord, String difficulty) {

        PrintWriter bw = null;

        try {

            bw = new PrintWriter(new FileWriter("language" + difficulty + ".txt", true));
            bw.write(danishWord + "," + englishWord + ",");

            bw.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (bw != null) {
                JOptionPane.showMessageDialog(null, "Following word has been added: "
                        + "\n\n" + danishWord + "\n\n "
                        + "And it's English translation is: \n\n "
                        + englishWord + "\n\n Difficulty: " + difficulty);
                bw.close();
            }
        }
    }

    public void showWords(String file, JList<String> list) {
        DefaultListModel<String> model = new DefaultListModel<>();
        String fileName = "language" + file + ".txt";
        try {

            FileReader inputFile = new FileReader(fileName);

            BufferedReader bufferReader = new BufferedReader(inputFile);

            String line;

            while ((line = bufferReader.readLine()) != null) {
                String split[] = line.split(",");
                for (int i = 0; i < split.length; i += 2) {

                    danishWord = "" + split[i];
                    englishWord = "" + split[i + 1];

                    model.addElement(danishWord);
                    model.addElement(englishWord);

                    list.setModel(model);

                }

            }

            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Fejl ved linje:" + e.getMessage());
        }
    }

    public void lookUpWord(String lookUp) {

        String fileName = "dictionary.txt";
        try {

            FileReader inputFile = new FileReader(fileName);

            BufferedReader bufferReader = new BufferedReader(inputFile);
            String line;
            String allWords;
            ArrayList<String> list = new ArrayList<String>();
            while ((line = bufferReader.readLine()) != null) {
                String split[] = line.split(",");
                for (int i = 0; i < split.length; i++) {
                    allWords = "" + split[i];
                    list.add(allWords);
                    String[] allWordArray = list.toArray(new String[list.size()]);
                    for (String d : allWordArray) {
                        if (d.equalsIgnoreCase(lookUp)) {
                            JOptionPane.showMessageDialog(null, "Dictionary Says: " + split[i + 1]);
                        } else {
                            JOptionPane.showMessageDialog(null, "Sorry but this word hasn't been defined yet!");
                        }
                    }

                }

            }

            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Fejl ved linje:" + e.getMessage());
        }
    }

    public void addToList() {

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
