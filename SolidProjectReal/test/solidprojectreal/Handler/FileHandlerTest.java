/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidprojectreal.Handler;

import javax.swing.JList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emil
 */
public class FileHandlerTest {
    
    public FileHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of writeToFile method, of class FileHandler.
     */
    @Test
    public void testWriteToFile() {
        System.out.println("writeToFile");
        String scoreStr = "";
        FileHandler instance = new FileHandler();
        instance.writeToFile(scoreStr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readWordFileEasy method, of class FileHandler.
     */
    @Test
    public void testReadWordFileEasy() throws Exception {
        System.out.println("readWordFileEasy");
        int i = 0;
        FileHandler instance = new FileHandler();
        instance.readWordFileEasy(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readWordFileMedium method, of class FileHandler.
     */
    @Test
    public void testReadWordFileMedium() throws Exception {
        System.out.println("readWordFileMedium");
        int i = 0;
        FileHandler instance = new FileHandler();
        instance.readWordFileMedium(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readWordFileHard method, of class FileHandler.
     */
    @Test
    public void testReadWordFileHard() throws Exception {
        System.out.println("readWordFileHard");
        int i = 0;
        FileHandler instance = new FileHandler();
        instance.readWordFileHard(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readScore method, of class FileHandler.
     */
    @Test
    public void testReadScore() {
        System.out.println("readScore");
        FileHandler instance = new FileHandler();
        instance.readScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addWord method, of class FileHandler.
     */
    @Test
    public void testAddWord() {
        System.out.println("addWord");
        String danishWord = "";
        String englishWord = "";
        String difficulty = "";
        FileHandler instance = new FileHandler();
        instance.addWord(danishWord, englishWord, difficulty);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showWords method, of class FileHandler.
     */
    @Test
    public void testShowWords() {
        System.out.println("showWords");
        String file = "";
        JList<String> list = null;
        FileHandler instance = new FileHandler();
        instance.showWords(file, list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lookUpWord method, of class FileHandler.
     */
    @Test
    public void testLookUpWord() {
        System.out.println("lookUpWord");
        String lookUp = "";
        FileHandler instance = new FileHandler();
        instance.lookUpWord(lookUp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToList method, of class FileHandler.
     */
    @Test
    public void testAddToList() {
        System.out.println("addToList");
        FileHandler instance = new FileHandler();
        instance.addToList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScoreFile method, of class FileHandler.
     */
    @Test
    public void testGetScoreFile() {
        System.out.println("getScoreFile");
        FileHandler instance = new FileHandler();
        int expResult = 0;
        int result = instance.getScoreFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScoreFile method, of class FileHandler.
     */
    @Test
    public void testSetScoreFile() {
        System.out.println("setScoreFile");
        int scoreFile = 0;
        FileHandler instance = new FileHandler();
        instance.setScoreFile(scoreFile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDanishWord method, of class FileHandler.
     */
    @Test
    public void testGetDanishWord() {
        System.out.println("getDanishWord");
        FileHandler instance = new FileHandler();
        String expResult = "";
        String result = instance.getDanishWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDanishWord method, of class FileHandler.
     */
    @Test
    public void testSetDanishWord() {
        System.out.println("setDanishWord");
        String danishWord = "";
        FileHandler instance = new FileHandler();
        instance.setDanishWord(danishWord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnglishWord method, of class FileHandler.
     */
    @Test
    public void testGetEnglishWord() {
        System.out.println("getEnglishWord");
        FileHandler instance = new FileHandler();
        String expResult = "";
        String result = instance.getEnglishWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnglishWord method, of class FileHandler.
     */
    @Test
    public void testSetEnglishWord() {
        System.out.println("setEnglishWord");
        String englishWord = "";
        FileHandler instance = new FileHandler();
        instance.setEnglishWord(englishWord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
