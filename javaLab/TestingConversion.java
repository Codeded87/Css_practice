public class TestingConversion{
    public static void main(String args[]){
        int z;
        byte b;
        for(int i=0;i<1000;i++){

            System.out.print("before conversion "+ i);
            System.out.print("    After conversion "+(byte)i);
            System.out.println("");
        }
    }
}