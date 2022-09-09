public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("virker");
        stack.showStack();
        stack.push("det");
        stack.showStack();
        stack.push("her");
        stack.showStack();
        stack.push("mon?");

        System.out.println("nu udskriver vi stakken");

        stack.showStack();
        stack.pop();
        stack.showStack();
        stack.pop();
        stack.showStack();
    }
}