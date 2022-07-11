package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("splchkr")
public class SpellChecker {

	public void checkSpellingMistakes(String document) {
		System.out.println("some code here for checking spelling mistakes in " + document);
	}
}
