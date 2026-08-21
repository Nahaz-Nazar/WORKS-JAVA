package filehandlings;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment {

    public static void main(String[] args) {

        String fileName = "assignment.txt";
        String content = "Java File Handling Practice";

        // 1. Create file and write content
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();

            System.out.println("Success: File created and content written successfully.");

        } catch (IOException e) {
            System.out.println("Error: Could not create or write to the file.");
            return;
        }

        // 2. Read content from file
        try {
            FileReader reader = new FileReader(fileName);

            StringBuilder fileContent = new StringBuilder();

            int character;

            while ((character = reader.read()) != -1) {
                fileContent.append((char) character);
            }

            reader.close();

            System.out.println("Success: File read successfully.");
            System.out.println("Content: " + fileContent);

        } catch (IOException e) {
            System.out.println("Error: Could not read the file.");
        }

        // 3. Delete the file
        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("Success: File deleted successfully.");
        } else {
            System.out.println("Error: Could not delete the file.");
        }
    }
}