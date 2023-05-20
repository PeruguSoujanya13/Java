package Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filehandling {

	 public static void main(String[] args) {
		
		   // Define file path and name
        String filePath = "filehandling.txt";
        
        // Write to file
        writeToFile(filePath, "Good morning!");
        
        // Read from file
        String content = readFromFile(filePath);
        System.out.println("File content for the read the file: " + content);
        
        // Append to file
        appendToFile(filePath, "\nThis is a new line.");
        
        // Read from file again to see the appended content
        content = readFromFile(filePath);
        System.out.println("File content after appending: " + content);
    }
    
    private static void writeToFile(String filePath, String content) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
       } 
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private static String readFromFile(String filePath) {
        String content = "";
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                content += scanner.nextLine() + "\n";
            }
            scanner.close();
            System.out.println("Successfully read from the file.");
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
        return content;
    }
    
    private static void appendToFile(String filePath, String content) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Successfully appended to the file.");
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }

	}


