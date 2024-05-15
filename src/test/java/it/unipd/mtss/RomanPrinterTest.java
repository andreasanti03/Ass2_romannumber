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
}
