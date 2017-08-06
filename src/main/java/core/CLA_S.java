package core;

public class CLA_S {
public static void main(String[] args) {
	if (args.length == 0) {System.err.println("You Should Add Some Argument!"); System.exit(0);}
	System.out.println("Hello " + args[0]);
}
}
