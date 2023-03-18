package Arul;

public class Eksplorasi {

    private static String encrypt(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (Character.isLetter(c)) {
                int asciiValue = (int) c + 10;
                char shiftedChar = (char) asciiValue;
                if (!Character.isLetter(shiftedChar)) {
                    shiftedChar = (char) (asciiValue - 26);
                }
                sb.append(shiftedChar);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    //TODO: complete this code

    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encrypt("ALTERRA ACADEMy")); // KVDOBBK KMKNOWI
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }
}
