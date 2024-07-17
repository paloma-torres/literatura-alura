module com.example.literaturaalura {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.literaturaalura to javafx.fxml;
    exports com.example.literaturaalura;
}