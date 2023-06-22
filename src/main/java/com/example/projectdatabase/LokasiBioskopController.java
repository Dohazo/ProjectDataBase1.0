package com.example.projectdatabase;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalTime;

public class LokasiBioskopController {
    @FXML
    TableView<LokasiBioskop> tblLokasiBioskop;
    @FXML
    TableColumn<LokasiBioskop, String> tblIdMovie;
    @FXML
    TableColumn<LokasiBioskop, String> tblTempat;
    @FXML
    TableColumn<LokasiBioskop, String> tblAlamat;
    @FXML
    TextField fieldIdMovie;
    @FXML
    TextField fieldTempat;
    @FXML
    TextField fieldAlamat;
    @FXML
    ObservableList<LokasiBioskop> listLokasiBioskop = FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        tblIdMovie.setCellValueFactory(new PropertyValueFactory<LokasiBioskop, String>("id_bioskop"));
        tblTempat.setCellValueFactory(new PropertyValueFactory<LokasiBioskop, String>("tempat"));
        tblAlamat.setCellValueFactory(new PropertyValueFactory<LokasiBioskop, String>("alamat"));
    }
    @FXML
    private void onClrBtn(){
        fieldIdMovie.setText("");
        fieldAlamat.setText("");
        fieldTempat.setText("");
    }
    @FXML
    private void onAddBtn(){

        listLokasiBioskop.add(new LokasiBioskop(fieldIdMovie.getText(),fieldTempat.getText(),fieldAlamat.getText()));
        tblLokasiBioskop.setItems(listLokasiBioskop);
        fieldIdMovie.setText("");
        fieldAlamat.setText("");
        fieldTempat.setText("");
    }
    @FXML
    private void onDeleteBtn(){
        int index = tblLokasiBioskop.getSelectionModel().getSelectedIndex();
        listLokasiBioskop.remove(index);
    }
}
