package com.rationaleemotions;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class FileReader {
  List<String> contents = new ArrayList<>();

  public FileReader() {
    String file = "src/main/resources/book1";
    try {
      List<String> lines =  Files.readAllLines(new File(file).toPath(), Charset.defaultCharset());
      for (String line : lines) {
        contents.addAll(Arrays.asList(line.split(" ")));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
