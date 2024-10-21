import java.util.Date;
import java.util.UUID;

public class Transactions {
    private UUID id;
    private double amount;
    private String description;
    private Date date;
    private TransactionType type;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Transactions( double amount, String description, Date date, TransactionType type) {
        this.id = UUID.randomUUID();
        this.amount = amount;
        this.description = description;
        this.date = date;
        this.type = type;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Transactions that = (Transactions) obj;
        return id.equals(that.id);  // Compare by UUID
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }


}
