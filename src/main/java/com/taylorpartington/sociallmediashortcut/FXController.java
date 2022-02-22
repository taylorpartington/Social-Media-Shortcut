package com.taylorpartington.sociallmediashortcut;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


public class FXController {
    Desktop desk = Desktop.getDesktop();
    URL path = FXController.class.getResource("README.md");


    @FXML
    private Label welcomeText;

    @FXML
    protected void OpenReadme() {desk.open(path);}
    @FXML
    protected void OpenLinkedIn() throws URISyntaxException, IOException {desk.browse(new URI("https://www.linkedin.com/"));}
    @FXML
    protected void OpenFacebook() throws URISyntaxException, IOException {desk.browse(new URI("https://www.facebook.com/"));}
    @FXML
    protected void OpenGitHub() throws URISyntaxException, IOException {desk.browse(new URI("https://www.github.com/"));}
    @FXML
    protected void OpenUdemy() throws URISyntaxException, IOException {desk.browse(new URI("https://www.udemy.com/"));}
    @FXML
    protected void OpenInstagram() throws URISyntaxException, IOException {desk.browse(new URI("https://www.instagram.com/"));}
    @FXML
    protected void OpenYoutube() throws URISyntaxException, IOException {desk.browse(new URI("https://www.youtube.com/"));}

}
