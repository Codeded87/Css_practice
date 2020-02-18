public class ScopeVariable{
    public static void main(String args[]){
       
        int x = 10;

        if(x == 10){
            int x = 100;
            int y = 20;
            x = y * 2;
            System.out.println("X and y " + x + " " + y);
        }
        // y = 100; scope of the variable is not exists so it will be error
        System.out.println("value of x  is "+x);
    }
}