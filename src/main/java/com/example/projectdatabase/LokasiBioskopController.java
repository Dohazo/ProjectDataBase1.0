package com.example.projectdatabase;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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
    Button updateBtn;
    @FXML
    Button deleteBtn;

    @FXML
    public void initialize(){
        deleteBtn.setVisible(false);
        updateBtn.setVisible(false);
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
    private void getSelected(){
        deleteBtn.setVisible(true);
        updateBtn.setVisible(true);
        int index = tblLokasiBioskop.getSelectionModel().getSelectedIndex();
        fieldIdMovie.setText(tblIdMovie.getCellData(index));
        fieldAlamat.setText(tblAlamat.getCellData(index));
        fieldTempat.setText(tblTempat.getCellData(index));
    }

    @FXML
    private void onUpdateBtn(){
        int index = tblLokasiBioskop.getSelectionModel().getSelectedIndex();
        listLokasiBioskop.set(index,new LokasiBioskop(fieldIdMovie.getText(),fieldTempat.getText(),fieldAlamat.getText()));
        tblLokasiBioskop.setItems(listLokasiBioskop);
        deleteBtn.setVisible(false);
        updateBtn.setVisible(false);
    }
    @FXML
    private void onDeleteBtn(){
        int index = tblLokasiBioskop.getSelectionModel().getSelectedIndex();
        listLokasiBioskop.remove(index);
        fieldIdMovie.setText("");
        fieldAlamat.setText("");
        fieldTempat.setText("");
        deleteBtn.setVisible(false);
        updateBtn.setVisible(false);
    }
}
