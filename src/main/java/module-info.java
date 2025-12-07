module com.groupeisi.aidejavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens com.groupeisi.aidejavafx to javafx.fxml;
    exports com.groupeisi.aidejavafx;
    exports com.groupeisi.aidejavafx.controllers;
    opens com.groupeisi.aidejavafx.controllers to javafx.fxml;
}