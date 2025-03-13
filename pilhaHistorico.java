import java.util.LinkedList;

class stackHistory {
    private LinkedList<String> historyList = new LinkedList<>();

    public void addHistory(String history) {
        historyList.addLast(history);
    }

    public String returnHistory(){
        if (!isStackEmpty()) {
            return historyList.removeLast();
        } else {
            System.out.println("O historico está vazio.");
            return "";
        }
    }

    public boolean isStackEmpty() {
        return historyList.isEmpty();
    }
}

public class pilhaHistorico {
    public static void main (String[] args) {
        stackHistory stack = new stackHistory();
        stack.addHistory("Trono de Vidro");
        stack.addHistory("O Povo Brasileiro");
        stack.addHistory("Pessoas Normais");

        while(!stack.isStackEmpty()) {
            String lastHistory = stack.returnHistory();
            System.out.println("A ultima visualização foi: " + lastHistory);
        }
    }
}
