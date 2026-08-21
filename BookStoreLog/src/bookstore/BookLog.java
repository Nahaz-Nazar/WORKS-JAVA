package bookstore;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BookLog {

    public static void main(String[] args) {

        String fileName = "log.txt";
        String message = "Book order placed at 10:30 AM";

        // Create file and write message
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(message);
            writer.close();

            System.out.println("Success: File created and message written successfully.");

        } catch (IOException e) {
            System.out.println("Error: Could not create or write to the file.");
            return;
        }

        // Read message from file
        try {
            FileReader reader = new FileReader(fileName);
            StringBuilder content = new StringBuilder();

            int character;

            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }

            reader.close();

            System.out.println("Success: File read successfully.");
            System.out.println("Message: " + content);

        } catch (IOException e) {
            System.out.println("Error: Could not read the file.");
        }

        // Delete the file
        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("Success: File deleted successfully.");
        } else {
            System.out.println("Error: Could not delete the file.");
        }
    }
}