module com.example.piechart {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.piechart to javafx.fxml;
    exports com.example.piechart;
}