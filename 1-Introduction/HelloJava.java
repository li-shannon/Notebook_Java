// The name of the file must match with the class name
public class HelloJava {
    public static void main(String[] args) {
        System.out.print("Hi ");

        // arg[0] is the first command-line argument that you type after the program name in the command line,
        // arg[1] is the second, and so on.
        System.out.print(args[0] + ", ");
        System.out.print(args[1] + ", and ");
        System.out.print(args[2] + ".");
    }
    
}