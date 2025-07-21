public class Main {
    public static void main(String[] args) {
        GlyphFactory factory = new GlyphFactory();

        // Simulando um texto com letras repetidas
        String texto = "banana";
        String font = "Arial";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            Glyph glyph = factory.getGlyph(c, font);

            // Passando estado extrínseco (posição)
            glyph.draw("posição: " + i);
        }
    }
}
