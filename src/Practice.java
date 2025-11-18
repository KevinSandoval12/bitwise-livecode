public class Practice {
    public static void main(String[] args) {
        int color = 0xc4246D;
        int blueMask = 0x0000FF;

        int blue = color & blueMask;

        int greenMask = 0x00FF00;

        int green = (color & greenMask) >> 8;

        // System.out.println(Integer.toHexString(blue));
        System.out.println(Integer.toHexString(green));

        // int x = 0b10101;
        // int p = 0b11001;

        // int q = x & p;

        // int y = 0xcf4e;
        // int z = 94;

        // System.out.println(Integer.toBinaryString(q));

        // System.out.println(Integer.toBinaryString(z));
        // System.out.println(Integer.toHexString(z));


    }
}