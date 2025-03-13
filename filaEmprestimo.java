import java.util.LinkedList;

class ReaderQueue {
    private LinkedList<String> listReader = new LinkedList<>();

    public void addReader(String name) {
        listReader.addLast(name);
    }

    public String removeReader() {
        if(!isQueueEmpty()){
            return listReader.removeFirst();
        } else {
            System.out.println("A fila de emprestimo está vazia.");
            return "";
        }
    }

    public boolean isQueueEmpty() {
        return listReader.isEmpty();
    }
}

public class filaEmprestimo {
    public static void main(String[] args) {
        ReaderQueue queue = new ReaderQueue();
        queue.addReader("João");
        queue.addReader("Vitoria");
        queue.addReader("José");
        queue.addReader("Ana");
        queue.addReader("Maria");

        while(!queue.isQueueEmpty()) {
            String firstInQueue = queue.removeReader();
            System.out.println("O primeiro da fila é: " + firstInQueue);
        }
    }
}
