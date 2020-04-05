package com.sparrowwallet.sparrow.transaction;

import com.sparrowwallet.drongo.protocol.Transaction;
import com.sparrowwallet.drongo.psbt.PSBT;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

import java.io.IOException;

public class HeadersForm extends TransactionForm {
    public HeadersForm(PSBT psbt) {
        super(psbt);
    }

    public HeadersForm(Transaction transaction) {
        super(transaction);
    }

    public Node getContents() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("headers.fxml"));
        Node node = loader.load();
        HeadersController controller = loader.getController();
        controller.setModel(this);
        return node;
    }

    public String toString() {
        return "Tx [" + getTransaction().calculateTxId(false).toString().substring(0, 6) + "]";
    }
}
