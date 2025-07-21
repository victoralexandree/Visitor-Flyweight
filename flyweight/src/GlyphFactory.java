import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
    private final Map<String, Glyph> pool = new HashMap<>();

    public Glyph getGlyph(char symbol, String font) {
        String key = symbol + "_" + font;
        if (!pool.containsKey(key)) {
            pool.put(key, new CharacterGlyph(symbol, font));
        }
        return pool.get(key);
    }
}
