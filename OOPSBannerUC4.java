public class OOPSBannerUC4 {

    public static void main(String[] args) {
        String[] banner = createBanner();
        printBanner(banner);
    }

    // Method to create banner
    public static String[] createBanner() {

        return new String[] {

            String.join("", " **  ", " **  ", " **  ", " **  "),
            String.join("", "*     * ", "*     * ", "*     * ", "*     * "),
            String.join("", "*     * ", "*     * ", "*     * ", "*     * "),
            String.join("", "*     * ", "*     * ", " **  ", " **  "),
            String.join("", "*     * ", "*     * ", "*       ", "*       "),
            String.join("", "*     * ", "*     * ", "*       ", "*       "),
            String.join("", " **  ", " **  ", "*       ", " ***  ")
        };
    }

    // Method to print banner
    public static void printBanner(String[] banner) {
        for (String line : banner) {
            System.out.println(line);
        }
    }
}