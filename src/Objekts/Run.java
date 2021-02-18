package Objekts;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

class Run {
    /*
    Array of size 5, which will contain colors (color object)!
    Each color will have a name and 3 color fields (integers from 0 to 255): red, green, blue (RGB)

    Output - 5 colors with their name and RGB value
    Example:
    Red - 255 0 0
    Blue - 0 0 255
    Green - 0 255 0
 */
    static int scannerRedColorField() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Red color field 0 - 255 : ");
        return scan.nextInt();
    }

    static int scannerBlueColorField() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Green color field 0 - 255 : ");
        return scan.nextInt();
    }

    static int scannerGreenColorField() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Blue color field 0 - 255: ");
        return scan.nextInt();
    }

    public static void main(String[] args) {
        Color[] colors = new Color[5];
        String[] names = {"Red", "Blue", "Green", "White", "Orange"};

        int redColorField = scannerRedColorField();
        int greenColorField = scannerGreenColorField();
        int blueColorField = scannerBlueColorField();
        System.out.println();


        for (int i = 0; i < names.length; i++) {
            colors[i] = new Color(names[i]);
            if (redColorField <= 255) {
                if (greenColorField <= 255) {
                    if (blueColorField <= 255) {
                        colors[i].names = new String(String.valueOf(colors[i].names + ": " + redColorField + " " + greenColorField + " " + blueColorField));
                   System.out.println(colors[i].names);
                }
            }
        }
            continue;
        }
    }

}


class Color {
    String names;

    public Color(String name) {
        this.names = name;
    }

    int[] redColorField;
    int[] greenColorField;
    int[] blueColorField;

    Color(int[] firstColor, int[] secondColor, int[] thirdColor) {
        redColorField = firstColor;
        greenColorField = secondColor;
        blueColorField = thirdColor;
    }


}



