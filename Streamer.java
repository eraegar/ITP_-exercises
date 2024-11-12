import java.io.*;

public class Streamer {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try (FileInputStream in = new FileInputStream(inputFile);
             FileOutputStream out = new FileOutputStream(outputFile)) {


            byte[] buffer = new byte[1024];  // Read in chunks of 1024 bytes
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File doesn't exist. Creating the file...");
            try {
                if (inputFile.createNewFile()) {
                    System.out.println("Input file created.");
                } else {
                    System.out.println("Failed to create input file.");
                }
            } catch (IOException e) {
                System.out.println("Error creating input file: " + e.getMessage());
            }
        } catch (IOException ex) {
            System.out.println("An error occurred while reading or writing to the file.");
            ex.printStackTrace();

            if (!outputFile.canWrite()) {
                System.out.println("You do not have write permission to the output file.");
            }
        }
    }
}
