public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        // Call method to generate the exception
        generateNullPointerException();
        
        // Call method to handle the exception
        handleNullPointerException();
    }
    
    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length());
    }
    
    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
