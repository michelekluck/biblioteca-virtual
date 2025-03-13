import java.util.LinkedList;

public class listaLivros {
    public static void main(String[] args) {
        LinkedList<String[]> linkedList= new LinkedList<>();

        linkedList.add(new String[] {"Trono de vidro", "Sarah J. Maas", "2013"});
        linkedList.add(new String[]{"O povo brasileiro", "Darcy Ribeiro", "2015"});
        linkedList.add(new String[]{"Pessoas normais", "Sally Rooney", "2019"});

        printLinkedList(linkedList);
    }

    public static void printLinkedList(LinkedList<String[]> linkedList) {
        for (String[] infoLivro : linkedList) {
            System.out.println(String.join(" | ", infoLivro));
        }
    }
}