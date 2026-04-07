module com.example.movieticketbookingmanage {
    requires javafx.controls;
    requires javafx.fxml;
    requires fontawesomefx;
    requires java.desktop;
    requires java.sql;


    opens com.example.movieticketbookingmanage to javafx.fxml;
    exports com.example.movieticketbookingmanage;
}