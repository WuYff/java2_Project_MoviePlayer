package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private StringProperty LogoMessage = new SimpleStringProperty("塘朗国际航空");

    public String getLogoMessage() {
        return LogoMessage.get();
    }

    public void setLogoMessage(String logoMessage) {
        this.LogoMessage.set(logoMessage);
    }

    public StringProperty logoMessageProperty() {
        return LogoMessage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
