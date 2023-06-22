package com.example.projectdatabase;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudioController {
    @FXML
    TableView<Studio> tblStudio;
    @FXML
    TableColumn<Studio, String> tblkodeStudio;
    @FXML
    TableColumn<Studio, String> tblIdBioskop;
    @FXML
    TableColumn<Studio, Integer> tblJumlahKursi;
    @FXML
    TextField fieldKodeStudio;
    @FXML
    TextField fieldIdBioskop;
    @FXML
    TextField fieldJumlahKursi;
    @FXML
    ObservableList<Studio> listStudio = FXCollections.observableArrayList();
    @FXML
    public void initialize(){
    tblkodeStudio.setCellValueFactory(new PropertyValueFactory<Studio, String>("kodeStudio"));
    tblIdBioskop.setCellValueFactory(new PropertyValueFactory<Studio, String>("idBioskop"));
        tblJumlahKursi.setCellValueFactory(new PropertyValueFactory<Studio, Integer>("jumlahKursi"));
    }
    @FXML
    private void onClrBtn(){
        fieldIdBioskop.setText("");
        fieldKodeStudio.setText("");
        fieldJumlahKursi.setText("");
    }
    @FXML
    private void onAddBtn(){

        listStudio.add(new Studio(fieldKodeStudio.getText(),fieldIdBioskop.getText(),Integer.parseInt(fieldJumlahKursi.getText())));
        tblStudio.setItems(listStudio);
        fieldIdBioskop.setText("");
        fieldKodeStudio.setText("");
        fieldJumlahKursi.setText("");
    }
    @FXML
    private void onDeleteBtn(){
        int index = tblStudio.getSelectionModel().getSelectedIndex();
        listStudio.remove(index);
    }
}
