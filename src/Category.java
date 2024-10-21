import java.util.Date;
import java.util.UUID;

public class Category  {
    private UUID id;
    private String categoryName;
    private double limitExpense;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getLimitExpense() {
        return limitExpense;
    }

    public void setLimitExpense(double limitExpense) {
        this.limitExpense = limitExpense;
    }

    public Category( String categoryName, double limitExpense) {
        this.id = UUID.randomUUID();
        this.categoryName = categoryName;
        this.limitExpense = limitExpense;
    }

}
