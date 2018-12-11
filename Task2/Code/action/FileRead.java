package com.mrmrmr7.figure.action;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class FileRead {	
	public ArrayList<String> readFile(String path) throws IOException {
		ArrayList<String> arr = new ArrayList<String>();
		Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(arr::add);
		return arr;
	}
}
