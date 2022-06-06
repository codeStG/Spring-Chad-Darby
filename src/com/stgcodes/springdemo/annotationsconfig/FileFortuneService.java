package com.stgcodes.springdemo.annotationsconfig;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	Scanner scanner;
	Random randomNum;
	ArrayList<String> fortunes;
	File fortunesFile = new File("C:\\Users\\getorres.CORPORATE\\Documents\\workspace\\spring-demo-chad-darby\\src\\com\\stgcodes\\springdemo\\annotationsconfig\\config\\fortunes.txt");
	
	public FileFortuneService() {
		fortunes = new ArrayList<String>();
	}

	@Override
	public String getFortune() {
		readFortunesFromFile();
		
		if(fortunes.size() <= 0) {
			return "There was a problem reading the provided file. Please try again.";
		}
		
		String fortune = getRandomFortuneFromList(fortunes);
		return fortune;
	}
	
	@PostConstruct
	private void readFortunesFromFile() {
		try {
			scanner = new Scanner(fortunesFile).useDelimiter(",");
			
			while(scanner.hasNext()) {
				fortunes.add(scanner.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
	
	private String getRandomFortuneFromList(ArrayList<String> fortunes) {
		Random randomNum = new Random();
		int index = randomNum.nextInt(fortunes.size());
		String fortune = fortunes.get(index);
		
		return fortune;
	}

}
