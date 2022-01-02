package bank;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Customer extends GridPane {
    Label name;
    Label balance;
    TransferWidget transferWidget;

    public Customer(String name, String balance){
        super();
        this.name = new Label("Name: " + name);
        this.balance = new Label("Balance: " + balance);
        transferWidget = new TransferWidget();
        add(this.name, 0,0);
        add(this.balance, 0,1);
        add(transferWidget, 0,2);


    }
}
