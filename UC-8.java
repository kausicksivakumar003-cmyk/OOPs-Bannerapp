import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8: Use Map for Character Patterns and Render via Function
 * Focus: Collections Framework, Modularity, Reusability
 */
public class BannerApp {

    /**
     * Builds and returns the character pattern map
     * @return Map containing character patterns
     */
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                "  **** ",
                " *     ",
                " *     ",
                "  **** ",
                "      *",
                "      *",
                "  **** "
        });

        return patternMap;
    }

    /**
     * Renders banner text using character patterns
     * @param message text to display
     * @param patternMap map of character patterns
     */
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        int rows = 7;

        for (int row = 0; row < rows; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        // Build the pattern map
        Map<Character, String[]> patternMap = buildCharacterPatterns();

        // Message to display
        String message = "OOPS";

        // Render banner
        renderBanner(message, patternMap);
    }
}
