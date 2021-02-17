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


    public static void main(String[] args) {
        Color[] colors = new Color[5];
        String[] names = {"red", "blue", "black", "white", "green"};
        int[] firstColorField = new int[]{1, 0, 1, 0, 0};
        int[] secondColorField = new int[]{53, 0, 02, 64, 51};
        int[] thirdColorField = new int[]{255, 255, 255, 000, 255};

        for (int i = 0; i < names.length; i++) {
            colors[i] = new Color(names[i]);
            colors[i].names = new String(String.valueOf(colors[i].names + ": " + firstColorField[i] + " " + secondColorField[i] + " " + thirdColorField[i]));
            System.out.println(colors[i].names);
        }
    }
}

class Color {
    String names;

    public Color(String name) {
        this.names = name;
    }

    int[] thirdColorField;
    int[] firstColorField;
    int[] secondColorField;

    Color(int[] firstColor, int[] secondColor, int[] thirdColor) {
        firstColorField = firstColor;
        secondColorField = secondColor;
        thirdColorField = thirdColor;
    }
}




