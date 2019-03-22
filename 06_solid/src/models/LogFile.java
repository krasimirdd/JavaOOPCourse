package models;

import intefaces.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LogFile implements File {

    private static final String DEFAULT_PATH_AND_NAME = "output.txt";

    private StringBuilder text;
    private int size;
    private String filePathAndName;

    public LogFile() {
        this.text = new StringBuilder();
        this.size = 0;
        this.filePathAndName = LogFile.DEFAULT_PATH_AND_NAME;
    }

    public LogFile(String fileInfo) {
        this();
        this.filePathAndName = fileInfo;
    }

    public void setFilePathAndName(String filePathAndName) {
        this.filePathAndName = filePathAndName;
    }

    @Override
    public boolean write() {

        try {
            Files.write(Paths.get(this.filePathAndName),
                    this.text.append(System.lineSeparator()).toString().getBytes(),
                    StandardOpenOption.APPEND
            );
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    private int calculateSize() {

        int size = 0;

        for (char c : this.text.toString().toCharArray()) {
            if (Character.isAlphabetic(c)) {
                size += c;
            }
        }

        return size;
//        return Stream.of(this.text.toString().toCharArray())
//                .map(String::valueOf)
//                .filter(s -> Character.isAlphabetic(s.charAt(0)))
//                .mapToInt(e -> e.charAt(0))
//                .sum();
    }

    @Override
    public int getSize() {
        return this.calculateSize();
    }

    @Override
    public void append(String text) {
        this.text.append(text);
    }

}
