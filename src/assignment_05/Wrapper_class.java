package assignment_05;
public class Wrapper_class {
    public static void main(String[] args) {
        System.out.println("|---- \t Java Wrapper Classes \t---|");

        byte a = 1;
        Byte byteobj = new Byte(a);
        System.out.println(byteobj.getClass());

        int intA  =  123;
       Integer intObj = new Integer(intA);
        System.out.println(intObj.intValue());

        boolean bo = false;
        Boolean boObj =  new Boolean(bo);
        System.out.println(boObj.booleanValue());

        char ch = 'a';
        Character chObj = new Character(ch);
        System.out.println(chObj.charValue());

        double d =  2.30;
        Double doubleInt = new Double(d);
        System.out.println(doubleInt.doubleValue());

        float fl = 28.9F;
        Float flObj = new Float(fl);
        System.out.println(flObj.floatValue());

        long l = 99L;
        Long lObj =  new Long(l);
        System.out.println(lObj.longValue());

        short sh = 2222;
        Short shObj = new Short(sh);
        System.out.println(shObj);
    }
}
