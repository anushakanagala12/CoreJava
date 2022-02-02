import com.sun.corba.se.impl.encoding.CDROutputObject;
import com.sun.org.apache.xpath.internal.operations.Bool;

public class Conversions {
    public static void main(String[] args) {
        //String to int
        String a = "200";
        String b = "100";

        int i = Integer.parseInt(a);
        int j = Integer.parseInt(b);

        System.out.println("Addition after conversion - " + (i+j));

        //Integer to String
        int c = 3;
        String d = String.valueOf(c);
        String e = Integer.toString(c);
        String f = String.format("%d" , + c);
        System.out.println(d + " "+ e + " " + f);

        //String to Long
        String g = "13456";
        Long l = Long.parseLong(g);
        System.out.println(l);

        //Long to String
        long h = 97487;
        String k = String.valueOf(h);
        String m = Long.toString(h);
        System.out.println(k);
        System.out.println(m);

        //String to Float
        String n = "24.7";
        Float fl = Float.parseFloat(n);
        System.out.println(fl);

        //Float to String
        float ft = 56.2f;
        String st1 = String.valueOf(ft);
        String st2 = Float.toString(ft);
        System.out.println(st1);
        System.out.println(st2);

        //String to Double
        String x = "24.7";
        Double dlb = Double.parseDouble(x);
        System.out.println(dlb);

        //Double to String
        double dl = 56.2d;
        String st3 = String.valueOf(dl);
        String st4 = Double.toString(dl);
        System.out.println(st3);
        System.out.println(st4);

        //String to Boolean
        String y = "true";
        String z = "TRue";
        String res = "ok";
        Boolean bl = Boolean.parseBoolean(y);
        Boolean bl1 = Boolean.parseBoolean(z);
        Boolean bl2 = Boolean.parseBoolean(res);
        System.out.println(bl);
        System.out.println(bl1);
        System.out.println(bl2);

        //Boolean to String
        boolean bl3 = true;
        boolean bl4 = false;
        String st5 = String.valueOf(bl3);
        String st6 = Boolean.toString(bl4);
        System.out.println(st5);
        System.out.println(st6);

        // int to long
        int i1 = 4;
        int i2 = 5;
        int i3 = 6;
        Long l1 = Long.valueOf(i1);
        Long l2 = new Long(i2);
        long l3 = i3;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        //long to int
        long l4 = 78l;
        int i5 = (int)l4; //type-casting
        Long l5 = new Long(l4);
        int i6 = l5.intValue();
        System.out.println(i5);
        System.out.println(i6);

        //int to Double
        int i7 = 4;
        int i8 = 5;
        int i9 = 6;
        Double d1 = Double.valueOf(i7);
        Double d2 = new Double(i8);
        double d3 = i9;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        //Double to int
        double d4 = 78d;
        int i10 = (int)d4; //type-casting
        Double d5 = new Double(d4);
        int i11 = d5.intValue();
        System.out.println(i10);
        System.out.println(i11);

        //int to character
        int i12 = 65;
        char c1 = (char)i12;//type-casting
        System.out.println(c1);

        //Character to int
        char c2 = 'A';
        char c3 = '1';
        int x1 = c2;
        int x2 = c3;
        System.out.println(x1);
        System.out.println(x2);
        int x3 = Character.getNumericValue(c2);
        int x4 = Integer.parseInt(String.valueOf(c3));
        System.out.println(x3);
        System.out.println(x4);

        // Binary to Decimal
        System.out.println("Binary to Decimal - " + Integer.parseInt("1010", 2));
        //1x2^3 + 0x2^2 + 1X2^1 + 1X2^0 = 10

        //Decimal to Binary
        System.out.println("Decimal to Binary - " + Integer.toBinaryString(10));
        // 10%2 = 0 ,5%2 = 1, 2%2 =0 1%2 = 1 --> 1010

        //Hexa to Decimal
        System.out.println("Hexa to Deci - " + Integer.parseInt("Ab", 16));
        // 10x16^1 + 11x16^0 = 160+11 =171

        //Decimal to Hexa
        System.out.println("Deci to Hexa - " + Integer.toHexString(121));
        //121%16 = 9, 9%16 = 7 -> 79

        //Octal to Decimal
        System.out.println("Octal to Deci - " + Integer.parseInt("121",8));
        //1x8^2 + 2x8^1 + 1x8^0 = 81

        //Decimal to octal
        System.out.println("Decimal to Octal - " + Integer.toOctalString(81));
        //81%8 = 1 , 10%8 = 2, 1%8 = 1 -> 121 in the reverse order
    }
}
