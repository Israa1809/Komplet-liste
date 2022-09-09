public class Stack {

    private Liste liste = new Liste();

    public Node push(String s){
        return liste.insertFromhead(s);
    }

    public Node pop(){
        return liste.removeFromHead();
    }

    public void showStack(){
        String[] string = liste.printFromHead().split(" ");

        for (String s : string) {
            System.out.println(s);
        }
        System.out.println(" ");
    }

}
