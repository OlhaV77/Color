package Objekts;

import java.util.Arrays;

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

/*

        for (int i = 0; i < 5; i++) {

            colors[i].name =  new String[]{"Red", "Blue", "Green", "White", "Yellow"};
            colors[i].redColorField =  new int[]{255, 0, 0, 255, 255};
            colors[i].blueColorField = new int[]{0, 255, 0, 255, 0};
            colors[i].greenColorField = new int[]{0, 0, 128, 255, 255};

            colors[i] = new Color(colors[i].name[i], colors[i].redColorField[i], colors[i].blueColorField[i], colors[i].greenColorField[i]);




 */


    public static void main(String[] args) {
        Color[] colors = new Color[5];

        colors[0] = new Color("Red", 255, 0, 0);
        colors[1] = new Color("Blue", 0, 255, 0);
        colors[2] = new Color("Green", 0, 0, 128);
        colors[3] = new Color("White", 255, 255, 255);
        colors[4] = new Color("Yellow", 255, 0, 255);


        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }
}

class Color {
    String name;
    int redColorField;
    int greenColorField;
    int blueColorField;

    public Color(String name, int redColorField, int greenColorField, int blueColorField) {
        this.name = name;
        this.redColorField = redColorField;
        this.greenColorField = greenColorField;
        this.blueColorField = blueColorField;
    }

    public String toString() {
        return "name='" + name + '\'' +
                ", redColorField=" + redColorField +
                ", greenColorField=" + greenColorField +
                ", blueColorField=" + blueColorField;
    }
}
