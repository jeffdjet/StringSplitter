/**
 * Class for splitting strings into lists of substrings. Constructor
 * can have one or more parameters specifying all separator characters
 * as an enum.
 *
 * Example #1:
 *    new StringSplitter(Separator.PERIOD).split(“foo.bar#baz”);
 *    returns: {“foo”, “bar#baz”}
 *
 * Example #2:
 *    new StringSplitter(Separator.PERIOD, Separator.HASH).split(“foo.bar#baz”);
 *    returns: {“foo”, “bar”, “baz”}
 *
 * IMPLEMENT FOLLOWING:
 *
 * (1) StringSplitter class and Separator enum supporting at two or
 *     more different separators.
 *
 * (2) Some tests for the StringSplitter. TestNG/JUnit approach is preferred
 *
 */

package tests;

public class StringSplitter {

    String separatorChars;
    public StringSplitter(String... separators) {
        String stringSeparator = "";
        for (String str : separators) {
            stringSeparator = stringSeparator + str;
        }
        this.separatorChars = stringSeparator;
    }

    public void split(String stringToSplit){
        String[] arrayOfString = stringToSplit.split("[" + separatorChars + "]+");
        System.out.println("----- String to split: [" + stringToSplit +"] with separator/s: [" + separatorChars + "]-----");

        for (String item : arrayOfString) {
            System.out.println(item);
        }
    }

    public enum Separator {
        // TODO: Code goes here
        PERIOD {
            @Override
            public String toString() {
                return ".";
            }
        },
        HASH {
            @Override
            public String toString() {
                return "#";
            }
        },
        ATSIGN {
            @Override
            public String toString() {
                return "@";
            }
        },
        COMMA {
            @Override
            public String toString() {
                return ",";
            }
        },
        SPACE {
            @Override
            public String toString() {
                return " ";
            }
        }
    }
}


