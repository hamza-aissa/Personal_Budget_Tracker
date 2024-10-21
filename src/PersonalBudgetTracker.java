import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PersonalBudgetTracker extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Set up the MainUI layout (this contains your sidebar, transactions, etc.)
        MainUI mainLayout = new MainUI();

        // Set up the scene with the MainUI
        Scene scene = new Scene(mainLayout, 800, 600);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        primaryStage.setTitle("Personal Finance Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
