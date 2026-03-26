package write_file;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        //FileWriter = Good for small or medium-sized text files
        //BufferedWriter = Better performance for large amount of text
        //PrintWriter = Best for structured data, like reports or logs
        //FileOutputSteam = Best for binary files(e.g. images, audio files)
        String filePath = "/Users/jackiechen/Desktop/learningJava/Project1/src/write_file/test.txt";
        String fileContent = """
                Who lives in pineapple under the sea
                SpongeBob square pants
                READY?
                """;
        try(FileWriter writer = new FileWriter(filePath);){
            writer.write(fileContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not loacte the file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
