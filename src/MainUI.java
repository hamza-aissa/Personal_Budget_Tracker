import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainUI extends BorderPane {

    public MainUI() {
        // Sidebar setup
        VBox sidebar = new VBox();
        sidebar.setPadding(new Insets(10));
        sidebar.setSpacing(10);
        sidebar.setStyle("-fx-background-color: #000000;");

        Button btnDashboard = new Button("Dashboard");
        Button btnTransactions = new Button("Transactions");
        Button btnBudgets = new Button("Budgets");
        Button btnSettings = new Button("Settings");

        btnDashboard.getStyleClass().add("sidebar-button");
        btnTransactions.getStyleClass().add("sidebar-button");
        btnBudgets.getStyleClass().add("sidebar-button");
        btnSettings.getStyleClass().add("sidebar-button");

        sidebar.getChildren().addAll(btnDashboard, btnTransactions, btnBudgets, btnSettings);

        // Transaction area
        ListView<String> transactionsList = new ListView<>();
        transactionsList.getItems().addAll("Transaction 1", "Transaction 2", "Transaction 3");
        transactionsList.setStyle("-fx-background-color: #ffffff; -fx-border-color: #000000;");

        // Header area
        HBox header = new HBox();
        header.setPadding(new Insets(15));
        header.setStyle("-fx-background-color: #000000;");
        Label titleLabel = new Label("Personal Finance Overview");
        titleLabel.setStyle("-fx-text-fill: #ffffff; -fx-font-size: 24px;");
        header.getChildren().add(titleLabel);

        // Add the components to the BorderPane
        this.setLeft(sidebar);
        this.setCenter(transactionsList);
        this.setTop(header);
    }
}
