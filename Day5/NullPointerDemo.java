public class NullPointerDemo {

    public static void main(String[] args) {
        // Firstly call the method to generate the Exception
        generateNullPointerException();

        // Refactor the code to handle the Exception
        handleNullPointerException();
    }

    // Method to generate the NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        // This will generate a NullPointerException
        System.out.println(text.length());
    }

    // Method to handle the NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            // This will generate a NullPointerException
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: The variable 'text' is null.");
        }
    }
}
