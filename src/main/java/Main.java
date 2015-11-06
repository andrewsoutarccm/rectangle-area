// Rectangle Area
// Author: Andrew Soutar
// CMP128-80229: Computer Science I
// County College of Morris
// Date Modified: Fri. 11/06/2015

/* Copyright (c) Andrew Soutar <andrew@andrewsoutar.com>
 *
 * See the LICENSE file for details.
 */

// github.com/andrewsoutarccm/utilities
import com.andrewsoutar.cmp128.Utilities;
import com.andrewsoutar.cmp128.Utilities.GenericScanner;
import com.andrewsoutar.cmp128.Utilities.UnaryFunction;

public class Main {
    private static GenericScanner kbdScanner;

    private static void welcomeBanner () {
        Utilities.printBordered (new String [] {
                "Welcome to the Rectangle Area App",
                "Version 1.0. Last Modified: Fri. 11/06/2015",
                "Author: Andrew Soutar <andrew@andrewsoutar.com>"
            });
    }

    private static double doPromptPositive (String param) {
        return (kbdScanner.<Double, Double>
                prompt (Double.class, "Enter the rectangle's " + param,
                        new UnaryFunction <Double, Double> () {
                            public Double call (Double input) {
                                if (input > 0) {
                                    return (input);
                                }
                                return (null);
                            }
                        }));
    }

    private static double getLength () {
        return (doPromptPositive ("length"));
    }

    private static double getWidth () {
        return (doPromptPositive ("width"));
    }

    private static double getArea (double length, double width) {
        return (length * width);
    }

    private static void displayData (double length, double width, double area) {
        System.out.format ("The rectangle's length is %g%n", length);
        System.out.format ("The rectangle's width is %g%n", width);
        System.out.format ("The rectangle's area is %g%n", area);
    }
    public static void main (String... args) {
        kbdScanner = new GenericScanner ();
        welcomeBanner ();
        double length = getLength ();
        double width = getWidth ();
        displayData (length, width, getArea (length, width));
    }
}
