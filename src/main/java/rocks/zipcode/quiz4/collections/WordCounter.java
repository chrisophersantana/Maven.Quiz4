package rocks.zipcode.quiz4.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> mapper;

    public WordCounter(String... strings) {
        mapper = new LinkedHashMap<>();

        for (String string : strings) {
            if (mapper.containsKey(string)) {
                mapper.replace(string, mapper.get(string) + 1);
            } else {
                mapper.put(string, 1);
            }
        }
    }

    public Map<String, Integer> getWordCountMap() {


        return mapper;
    }
}
