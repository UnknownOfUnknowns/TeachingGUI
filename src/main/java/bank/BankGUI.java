package bank;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BankGUI extends Application {

    Customer customer1;
    Customer customer2;
    @Override
    public void start(Stage stage) throws Exception {
        customer1 = new Customer("James", "1");
        customer2 = new Customer("Billy", "2");
        FlowPane root = new FlowPane(customer1, customer2);
        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("Bank");
        stage.setScene(scene);
        stage.show();
    }
}
