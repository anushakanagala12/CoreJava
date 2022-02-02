public class WrapperClass {

    public static void main(String[] args) {
        // Wrapper Class - used to convert primitive datatype to object and vice-versa
        // wrapper class is immutable
        byte b = 10;
        short s = 20;
        int i = 30;
        float f = 40f;
        double d = 50d;
        char c = 'C';
        long l = 60L;
        boolean bl = true;

        //Auto-Boxing -> convert primitive data types into objects
        Byte by = b;
        Short sh = s;
        Integer in = i;
        Float fl = f;
        Double dl = d;
        Character ch = c;
        Long lg = l;
        Boolean bln = bl;

        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(fl);
        System.out.println(dl);
        System.out.println(ch);
        System.out.println(lg);
        System.out.println(bln);

        // If we want to do equals two objects
        System.out.println(in.equals(sh));

        // If we want to convert integer to String
        String name = Integer.toString(i);
        System.out.printf(name + " " + name.getClass());

        //Un-Boxing -> convert object into primitive data types

        byte byt = by;
        short sht = sh;
        int ing = in;
        float flt = fl;
        double dbl = dl;
        long  lng = lg;
        char chr = ch;
        boolean blen = bln;

        System.out.println(byt);
        System.out.println(sht);
        System.out.println(ing);
        System.out.println(flt);
        System.out.println(dbl);
        System.out.println(lng);
        System.out.println(chr);
        System.out.println(blen);

    }
}
