public class Kø {
    public Liste liste = new Liste();

    public Node add(String s) {
        return liste.insetFromTail(s);
    }
    public Node pull() {
        return liste.removeFromHead();
    }

    public void showQueue() {
        System.out.println(liste.printFromHead());
    }
}
