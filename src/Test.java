public class Test {
    private static final String[] valid = {"C0220H","C0220G","C0220M","C0220C"};
    private static final String[] invalid = {"A5432K","!433%54C","F7532/","645A53"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        boolean isValid;
        for (String name : valid){
            isValid = className.isClassName(name);
            System.out.println("Class name: " + name + " is valid: " + isValid);
        }
        for (String name : invalid){
            isValid = className.isClassName(name);
            System.out.println("Class name: " + name + " is valid: " + isValid);
        }
    }
}
