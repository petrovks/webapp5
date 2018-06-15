package lesson06;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

/**
 * GKislin
 * 23.01.2015.
 */
public class FileMain {
    public static void main(String[] args) throws IOException {
        System.out.println("\nBy stream iterator\n");
        Stream<String> lines = Files.lines(Paths.get("c:\\setup.log"), StandardCharsets.UTF_8);
        Iterator<String> it = lines.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\nBy stream lambde\n");
        Files.lines(Paths.get("c:\\setup.log"), StandardCharsets.UTF_8).forEach(System.out::println);

        System.out.println("\nBy BufferedReader\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\setup.log"), StandardCharsets.UTF_8));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
