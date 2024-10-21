import java.util.Objects;
import java.util.UUID;
import java.util.ArrayList;
public class User {
    private UUID id ;
    private String name;
    private String email;
    private ArrayList<Transactions> transactions;

    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transactions> transactions) {
        this.transactions = transactions;
    }

    public User(String name, String email) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.transactions = new ArrayList<>();
    }
    public void ajoutTransaction(Transactions t){
        transactions.add(t);

    }
    public void modifieTransaction(Transactions t) {
        for (int i = 0; i < transactions.size(); i++) {
            if (transactions.get(i).getId().equals(t.getId())) {
                transactions.set(i, t);  // Modify the transaction by ID
                return;
            }
        }
        System.out.println("Transaction not found");
    }


    public void supprimerTransaction(Transactions t) {
        transactions.removeIf(transaction -> transaction.getId().equals(t.getId()));  // Remove by ID
    }


    public void consulterTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            for (Transactions t : transactions) {
                System.out.println("Transaction ID: " + t.getId());
                System.out.println("Amount: " + t.getAmount());
                System.out.println("Description: " + t.getDescription());
                System.out.println("Date: " + t.getDate());
                System.out.println("Type: " + t.getType());
                System.out.println("------------------------");
            }
        }
    }


    public void definirObjectifBudget(Category c,double value){
        c.setLimitExpense(value);

    }
}

