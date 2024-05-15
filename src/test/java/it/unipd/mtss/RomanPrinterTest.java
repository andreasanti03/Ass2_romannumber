////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    @Ignore
    public void checkPrintPrimiCinquanta(){
        String var21 = "__  __ __  __  ___  \n" +
                "\\ \\/ / \\ \\/ / |_ _| \n" +
                " \\  /   \\  /   | |  \n" +
                " /  \\   /  \\   | |  \n" +
                "/_/\\_\\ /_/\\_\\ |___| \n";
        String var25 = "__  __ __  __ __     __ \n" +
                "\\ \\/ / \\ \\/ / \\ \\   / / \n" +
                " \\  /   \\  /   \\ \\ / /  \n" +
                " /  \\   /  \\    \\ V /   \n" +
                "/_/\\_\\ /_/\\_\\    \\_/    \n";
        String var32 = "__  __ __  __ __  __  ___   ___  \n" +
                "\\ \\/ / \\ \\/ / \\ \\/ / |_ _| |_ _| \n" +
                " \\  /   \\  /   \\  /   | |   | |  \n" +
                " /  \\   /  \\   /  \\   | |   | |  \n" +
                "/_/\\_\\ /_/\\_\\ /_/\\_\\ |___| |___| \n";
        String var37 = "__  __ __  __ __  __ __     __  ___   ___  \n" +
                "\\ \\/ / \\ \\/ / \\ \\/ / \\ \\   / / |_ _| |_ _| \n" +
                " \\  /   \\  /   \\  /   \\ \\ / /   | |   | |  \n" +
                " /  \\   /  \\   /  \\    \\ V /    | |   | |  \n" +
                "/_/\\_\\ /_/\\_\\ /_/\\_\\    \\_/    |___| |___| \n";
        String var46 = "__  __  _      __     __  ___  \n" +
                "\\ \\/ / | |     \\ \\   / / |_ _| \n" +
                " \\  /  | |      \\ \\ / /   | |  \n" +
                " /  \\  | |___    \\ V /    | |  \n" +
                "/_/\\_\\ |_____|    \\_/    |___| \n";
        String var49 = "__  __  _       ___  __  __ \n" +
                "\\ \\/ / | |     |_ _| \\ \\/ / \n" +
                " \\  /  | |      | |   \\  /  \n" +
                " /  \\  | |___   | |   /  \\  \n" +
                "/_/\\_\\ |_____| |___| /_/\\_\\ \n";
        String var50 = " _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |___  \n" +
                "|_____| \n";

        assertEquals(var21, RomanPrinter.print(21));
        assertEquals(var25, RomanPrinter.print(25));
        assertEquals(var32, RomanPrinter.print(32));
        assertEquals(var37, RomanPrinter.print(37));
        assertEquals(var46, RomanPrinter.print(46));
        assertEquals(var49, RomanPrinter.print(49));
        assertEquals(var50, RomanPrinter.print(50));
    }

    @Ignore
    public void checkPrintPrimiCento() {
        String var51 =" _       ___  \n" +
                "| |     |_ _| \n" +
                "| |      | |  \n" +
                "| |___   | |  \n" +
                "|_____| |___| \n";
        String var57 =" _      __     __  ___   ___  \n" +
                "| |     \\ \\   / / |_ _| |_ _| \n" +
                "| |      \\ \\ / /   | |   | |  \n" +
                "| |___    \\ V /    | |   | |  \n" +
                "|_____|    \\_/    |___| |___| \n";
        String var62 =" _      __  __  ___   ___  \n" +
                "| |     \\ \\/ / |_ _| |_ _| \n" +
                "| |      \\  /   | |   | |  \n" +
                "| |___   /  \\   | |   | |  \n" +
                "|_____| /_/\\_\\ |___| |___| \n";
        String var68 =" _      __  __ __     __  ___   ___   ___  \n" +
                "| |     \\ \\/ / \\ \\   / / |_ _| |_ _| |_ _| \n" +
                "| |      \\  /   \\ \\ / /   | |   | |   | |  \n" +
                "| |___   /  \\    \\ V /    | |   | |   | |  \n" +
                "|_____| /_/\\_\\    \\_/    |___| |___| |___| \n";
        String var70 =" _      __  __ __  __ \n" +
                "| |     \\ \\/ / \\ \\/ / \n" +
                "| |      \\  /   \\  /  \n" +
                "| |___   /  \\   /  \\  \n" +
                "|_____| /_/\\_\\ /_/\\_\\ \n";
        String var73 =" _      __  __ __  __  ___   ___   ___  \n" +
                "| |     \\ \\/ / \\ \\/ / |_ _| |_ _| |_ _| \n" +
                "| |      \\  /   \\  /   | |   | |   | |  \n" +
                "| |___   /  \\   /  \\   | |   | |   | |  \n" +
                "|_____| /_/\\_\\ /_/\\_\\ |___| |___| |___| \n";
        String var84 =" _      __  __ __  __ __  __  ___  __     __ \n" +
                "| |     \\ \\/ / \\ \\/ / \\ \\/ / |_ _| \\ \\   / / \n" +
                "| |      \\  /   \\  /   \\  /   | |   \\ \\ / /  \n" +
                "| |___   /  \\   /  \\   /  \\   | |    \\ V /   \n" +
                "|_____| /_/\\_\\ /_/\\_\\ /_/\\_\\ |___|    \\_/    \n";
        String var86 =" _      __  __ __  __ __  __ __     __  ___  \n" +
                "| |     \\ \\/ / \\ \\/ / \\ \\/ / \\ \\   / / |_ _| \n" +
                "| |      \\  /   \\  /   \\  /   \\ \\ / /   | |  \n" +
                "| |___   /  \\   /  \\   /  \\    \\ V /    | |  \n" +
                "|_____| /_/\\_\\ /_/\\_\\ /_/\\_\\    \\_/    |___| \n";
        String var95 ="__  __   ____  __     __ \n" +
                "\\ \\/ /  / ___| \\ \\   / / \n" +
                " \\  /  | |      \\ \\ / /  \n" +
                " /  \\  | |___    \\ V /   \n" +
                "/_/\\_\\  \\____|    \\_/    \n";
        String var99 ="__  __   ____   ___  __  __ \n" +
                "\\ \\/ /  / ___| |_ _| \\ \\/ / \n" +
                " \\  /  | |      | |   \\  /  \n" +
                " /  \\  | |___   | |   /  \\  \n" +
                "/_/\\_\\  \\____| |___| /_/\\_\\ \n";

        assertEquals(var51, RomanPrinter.print(51));
        assertEquals(var57, RomanPrinter.print(57));
        assertEquals(var62, RomanPrinter.print(62));
        assertEquals(var68, RomanPrinter.print(68));
        assertEquals(var70, RomanPrinter.print(70));
        assertEquals(var73, RomanPrinter.print(73));
        assertEquals(var84, RomanPrinter.print(84));
        assertEquals(var86, RomanPrinter.print(86));
        assertEquals(var95, RomanPrinter.print(95));
        assertEquals(var99, RomanPrinter.print(99));

    }

}
