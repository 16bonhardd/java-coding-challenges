package org.dbonhard.data.structures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tri {
    String word;
    Map<Character, Tri> next = new HashMap<>(26);

    public Tri(List<String> words) {
        words.forEach(this::add);
    }

    private Tri(String word) {
        this.word = word;
    }

    public void add(String word) {
        addHelper(word, 0);
    }

    private void addHelper(String word, Integer index) {
        if (word.length() == index) {
            this.word = word;
        }
        char key = word.charAt(index);
        if (!next.containsKey(key)) {
            next.put(key, new Tri(word));
            return;
        }

        Tri tri = next.get(key);
        tri.addHelper(word, index + 1);
    }

}
