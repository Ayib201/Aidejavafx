module com.groupeisi.aidejavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires jakarta.persistence;


    opens com.groupeisi.aidejavafx to javafx.fxml;
    exports com.groupeisi.aidejavafx;
    exports com.groupeisi.aidejavafx.controllers;
    opens com.groupeisi.aidejavafx.controllers to javafx.fxml;
    exports com.groupeisi.aidejavafx.config;
    opens com.groupeisi.aidejavafx.config to javafx.fxml;
}