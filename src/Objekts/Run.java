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
        String[] names = {"Red", "Blue", "Green", "White", "Yellow"};

        for (int i = 0; i < 5; i++) {
            colors[i] = new Color(names[i]);
            colors[i].redColorField = new int[]{255, 0, 0, 255, 255};
            colors[i].blueColorField = new int[]{0, 255, 0, 255, 0};
            colors[i].greenColorField = new int[]{0, 0, 128, 255, 255};

            colors[i].name = new String(String.valueOf(colors[i].name + ": " + colors[i].redColorField[i] + " " + colors[i].greenColorField[i] + " " + colors[i].blueColorField[i]));
            System.out.println(colors[i].name);
        }
    }
}

class Color {
    String name;

    public Color(String names) {
        this.name = names;
    }

    int[] redColorField;
    int[] greenColorField;
    int[] blueColorField;
}



