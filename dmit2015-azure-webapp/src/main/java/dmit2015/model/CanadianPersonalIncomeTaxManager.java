package dmit2015.model;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class CanadianPersonalIncomeTaxManager {
    public static void main(String[] args) {
        try {
            // Use the following code to access a resource file located in the `resources` folder your project.
            // Your code must handle a `URISyntaxException` thrown the get `getResource()` method.
            Path csvPath = Path.of(Thread.currentThread().getContextClassLoader().getResource("data/CanadianPersonalIncomeTaxRates.csv").toURI());
            // Use the `Files.readAllLines()` method to read all lines from a file as a List.
            System.out.println("I am reading all the lines from the csv file into a list of String.");
            List allLines = Files.readAllLines(csvPath);
            System.out.println("I am printing each line read from the list.");
            allLines.forEach(System.out::println);
            System.out.println("\n\n");

            // Use the `Files.readString()` method to reads all content from a file into a String,
            System.out.println("I am reading all content from the csv file into a String.");
            String fileContent = Files.readString(csvPath);
            System.out.println("I am printing the String content.");
            System.out.println(fileContent);
            System.out.println("\n\n");

            // Use the `Files.lines()` method to read all lines from a file as a Stream.
            System.out.println("I am reading all lines from the csv file as a Stream.");
            Stream linesStream = Files.lines(csvPath);
            System.out.println("I am printing all lines from the Stream.");
            linesStream.forEach(System.out::println);
            System.out.println("\n\n");

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
