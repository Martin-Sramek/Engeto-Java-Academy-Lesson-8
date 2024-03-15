package cz.engeto.sramekmartin.jal8.services;

import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FileService {

    public String readFile(String fileName) {
        try (FileReader fileReader = new FileReader("src/main/resources/static/" + fileName + ".txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             Stream<String> lines = bufferedReader.lines();)
        { return lines.collect(Collectors.joining());
        } catch (IOException ex) {
            return "File " + fileName + ".txt does not exist!";
        }
    }
}
