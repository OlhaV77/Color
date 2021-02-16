package Objekts;

class Color {
    static ColorInfo[] color = new ColorInfo[5];

    public static void main(String[] args) {
        color[0] = new ColorInfo("Red");
        color[1] = new ColorInfo("Grean");
        color[2] = new ColorInfo("Black");
        color[3] = new ColorInfo("Whit");
        color[4] = new ColorInfo("Blue");

        int[] firstColorField = {1, 0, 1, 0, 0};
        int[] secondColorField = {53, 0, 02, 64, 51};
        int[] thirdColorField = {255, 255, 255, 000, 255};

        for (int i = 0; i < firstColorField.length; i++) {
            System.out.println(color[i].color + ": " + (firstColorField[i] + " " + secondColorField[i] + " " + thirdColorField[i]));
        }
    }
}


class ColorInfo {
    String color;

    public ColorInfo(String color) {
        this.color = color;
    }
}


