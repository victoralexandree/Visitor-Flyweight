public class CharacterGlyph implements Glyph {
    private final char symbol; // estado intrínseco
    private final String font;

    public CharacterGlyph(char symbol, String font) {
        this.symbol = symbol;
        this.font = font;
    }

    @Override
    public void draw(String context) {
        System.out.println("Desenhando '" + symbol + "' com fonte '" + font + "' no contexto: " + context);
    }
}
