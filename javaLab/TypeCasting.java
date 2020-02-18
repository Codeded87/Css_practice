public class TypeCasting{
    public static void main(String args[]){
        byte b;
        int  a = 257;
        double d =  443.5554;/*
        System.out.println("Before conversion of the int value"+ a);
        b = (byte)a;
        System.out.println("After conversion  of int to byte"+ b);

        System.out.println("Before conversion of the value of the double"+ d);

        a = (int)d;

        System.out.println("After conversion of the value of the double "+a);

        d =67006;
        System.out.println("Before conversion " + d);
        b =  (byte)d;
        System.out.println("Value out of the range of the int "+b);
    */
        System.out.println("Before the conversion of double to byte"+d);
        b = (byte)d;
        System.out.println("After the conversion of double to byte"+b);

    }
}