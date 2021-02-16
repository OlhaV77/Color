package Objekts;

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

    static Color[] colors = new Color[5];

    public static void main(String[] args) {
        String[] array = {"red", "grean"};
//        for(int i =0; i< array.length;i++) {
//            colors[i].name = array[i];
//        }
        colors[0] = new Color("Red");
        colors[1] = new Color("Grean");
        colors[2] = new Color("Black");
        colors[3] = new Color("Whit");
        colors[4] = new Color("Blue");

        int[] firstColorField = {1, 0, 1, 0, 0};
        int[] secondColorField = {53, 0, 02, 64, 51};
        int[] thirdColorField = {255, 255, 255, 000, 255};

        for (int i = 0; i < firstColorField.length; i++) {
            System.out.println(colors[i].name + ": " + (firstColorField[i] + " " + secondColorField[i] + " " + thirdColorField[i]));
        }
    }
}


class Color {
    String name;

    public Color(String name) {
        this.name = name;
    }
}


