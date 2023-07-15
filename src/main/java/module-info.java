module com.twitter.twitterclone {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.twitter.twitterclone to javafx.fxml;
    exports com.twitter.twitterclone;
    exports com.twitter.controllers;
    opens com.twitter.controllers to javafx.fxml;
}