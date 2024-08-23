
public class StringBasics {
    public static void main(String[] args) {
        String name = "Dip"; //By String literal
        String sameName = "Dip";
        String newName = new String("Dip"); //By new kwyword
        String newName2 = new String("dip");
        
        // == always checks for reference equality
        if (name == sameName) {
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are not same");
        }

        if (name == newName) {
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are not same");
        }

        if (name.equals(newName) ) {
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are not same");
        }

        if (name.equalsIgnoreCase(newName2) ) {
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are not same");
        }
    }
}
