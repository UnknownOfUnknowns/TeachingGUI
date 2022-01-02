package bank;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TransferWidget extends GridPane {
    private Label transferAmmount;
    private TextField ammount;
    private Label receiverName;
    private TextField receiver;
    private Button confirm;

    public TransferWidget(){
        transferAmmount = new Label("Overfør: ");
        ammount = new TextField();
        receiverName = new Label("Modtager: ");
        receiver = new TextField();
        confirm = new Button("Ok");
        add(transferAmmount,0,0);
        add(ammount,1,0);
        add(receiverName,2,0);
        add(receiver,3,0);
        add(confirm,4,0);
    }
}
