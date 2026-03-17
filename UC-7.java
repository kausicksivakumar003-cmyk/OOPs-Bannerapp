/**
 * OOPS Banner App - UC7: Store Character Pattern in a Class
 * Focus: Encapsulation, Modularity, Reusability using Static Inner Class
 */
public class BannerApp {

    /**
     * Static Inner Class that stores a character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character character to represent
         * @param pattern banner pattern of 7 lines
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return 7 line banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to fetch pattern for a given character
     * @param ch character to search
     * @param patterns array of CharacterPatternMap
     * @return pattern for the character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {

        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        // Define patterns
        String[] patternO = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] patternP = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] patternS = {
                "  **** ",
                " *     ",
                " *     ",
                "  **** ",
                "      *",
                "      *",
                "  **** "
        };

        // Create CharacterPatternMap objects
        CharacterPatternMap charO = new CharacterPatternMap('O', patternO);
        CharacterPatternMap charP = new CharacterPatternMap('P', patternP);
        CharacterPatternMap charS = new CharacterPatternMap('S', patternS);

        // Store objects in array
        CharacterPatternMap[] patterns = {charO, charP, charS};

        String word = "OOPS";

        // Banner output (7 rows)
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, patterns);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }
}
