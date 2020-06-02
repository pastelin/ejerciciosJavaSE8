package cast.wrapper;

public class Wrapper {

    public static void main(String[] args) {
        
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2; 
        
        // genera un error porque no son tipos compatibles
        // String s4 = (String) (s3 * s2);
        
    }


    
}
