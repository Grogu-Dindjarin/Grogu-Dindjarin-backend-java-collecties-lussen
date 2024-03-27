import java.util.HashMap;

public class Translator {

    private HashMap<Integer,String> numericAlpha;
    private String[] alphabetic;
    private Integer[] numeric;

    public Translator(String[] alphabetic, Integer[] numeric) {
        this.alphabetic = alphabetic;
        this.numeric = numeric;

        this.numericAlpha = new HashMap<>();

        for (int i = 0; i < numeric.length; i++) {
            this.numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }

    public String translate(Integer number) {
        return this.numericAlpha.get(number);
    }
}
