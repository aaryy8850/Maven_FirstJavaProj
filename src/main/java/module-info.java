module com.example.maven_firstjavaproj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.maven_firstjavaproj to javafx.fxml;
    exports com.example.maven_firstjavaproj;
}