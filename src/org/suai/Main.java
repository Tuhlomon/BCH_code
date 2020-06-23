package org.suai;

public class Main {

    public static void main(String[] args) {
        BCH bch = new BCH(31, 9);
        String m;
        String c;
        int length_m = bch.getM_length();
        //System.out.println("Decoded message: " + bch.decodingBM("110000001110010"));
        //System.out.println("Decoded message: " + bch.decodingBM("01111110001000"));
        //m = "00011";
        //c = bch.encoding(m);
        //System.out.println("c = " + c);
        //System.out.println("Decoded m = " + bch.decoding(c));

        for (int i = 0; i < 10; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length_m; j++)
                sb.append((int)(Math.random() + 0.5));
            m = sb.toString();
            sb = new StringBuilder();
            System.out.println("\n               Сообщение = " + m);
            c = bch.encoding(m);
            System.out.println("           Кодовое слово = " + c);
            char[] chars = c.toCharArray();
            for (int j = 0; j < c.length(); j++)
                sb.append((Math.random() > 0.85 ? (chars[j] == '1' ? '0' : '1') : chars[j]));
            String newC = sb.toString();
            System.out.println("  Принятое кодовое слово = " + newC);
            System.out.println("Декодированное сообщение = " + bch.decodingBM(newC));
        }

    }
}
