public class Kø {
    public Liste liste = new Liste();

    public Node add(String s) {
        return liste.insetFromTail(s);
    }
    public Node pull() {
        return liste.removeFromHead();
    }

    public String showQueue() {
        String res = liste.printFromHead();
        return res;
    }
}
