public class OOPSBannerApp {

    public static void main(String[] args) {

        printLine(" ***** ", " ***** ", " ******", " ******");
        printLine("*     *", "*     *", "*     *", "*     *");
        printLine("*     *", "*     *", "*     *", "*      ");
        printLine("*     *", "*     *", "****** ", " ***** ");
        printLine("*     *", "*     *", "*      ", "      *");
        printLine("*     *", "*     *", "*      ", "*     *");
        printLine(" ***** ", " ***** ", "*      ", " ******");

    }

    public static void printLine(String part1, String part2, String part3, String part4) {
        System.out.println(String.join("   ", part1, part2, part3, part4));
    }
}