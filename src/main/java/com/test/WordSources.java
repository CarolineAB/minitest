package com.test;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import com.test.entity.Word;

public class WordSources {

	
	private Map<Integer, String> map;
	
	public WordSources() {
		ArrayList<Word> arrayList = new ArrayList<>();
		arrayList.add(new Word(2, "abc"));
		arrayList.add(new Word(3, "def"));
		arrayList.add(new Word(4, "ghi"));
		arrayList.add(new Word(5, "jkl"));
		arrayList.add(new Word(6, "mno"));
		arrayList.add(new Word(7, "pqrs"));
		arrayList.add(new Word(8, "tuv"));
		arrayList.add(new Word(9, "wxyz"));
		
		
		map = arrayList.stream().collect(Collectors.toMap(Word::getNum, Word::getLetter));
	}
    public static class Holder {
        public static WordSources instance = new WordSources();
    }

    public static WordSources getInstance() {
        return Holder.instance;
    }
	public String get(Integer type) {
        return  map.get(type);
    }
	
	
}
