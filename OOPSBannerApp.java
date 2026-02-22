public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = createBanner();

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String[] createBanner() {

        String[] lines = new String[7];

        lines[0] = String.join("   ", " ***** ", " ***** ", " ******", " ******");
        lines[1] = String.join("   ", "*     *", "*     *", "*     *", "*     *");
        lines[2] = String.join("   ", "*     *", "*     *", "*     *", "*      ");
        lines[3] = String.join("   ", "*     *", "*     *", "****** ", " ***** ");
        lines[4] = String.join("   ", "*     *", "*     *", "*      ", "      *");
        lines[5] = String.join("   ", "*     *", "*     *", "*      ", "*     *");
        lines[6] = String.join("   ", " ***** ", " ***** ", "*      ", " ******");

        return lines;
    }
}