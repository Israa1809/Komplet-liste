public class Stack {

    private Liste liste = new Liste();

    public Node push(String s){
        return liste.insertFromhead(s);
    }

    public Node pop(){
        return liste.removeFromHead();
    }

    public String showStack(){
        String res = liste.printFromHead();
        String [] string = res.split(" ");

        for (String s : string) {
            System.out.println(s);
        }
        System.out.println(" ");
    return res;
    }

}
