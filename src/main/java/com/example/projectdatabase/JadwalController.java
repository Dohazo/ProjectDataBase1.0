package com.example.projectdatabase;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.security.Key;
import java.time.LocalTime;
import java.util.Date;

public class JadwalController {
    @FXML
    TableView<Jadwal> tblJadwal ;
    @FXML
    TableColumn<Jadwal, String> tblKodeJadwal;
    @FXML
    TableColumn<Jadwal, LocalTime> tblJamMulai;
    @FXML
    ObservableList<Jadwal> listjadwal = FXCollections.observableArrayList();
    @FXML
    LocalTime jamMwf;
    @FXML
    TextField fieldkodeJadwal;
    @FXML
    TextField fieldJam;
    @FXML
    TextField fieldMenit;
    @FXML
    String kodejadwal;
@FXML
int jam;
@FXML
int menit;
    @FXML
    public void ininitialize(){
//        try {
//            Connection con = HelloApplication.createDatabaseConnection();
//            String query = "select * from jadwal";
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            int column_count = rs.getMetaData().getColumnCount();
//            if(column_count > 0) // ada data
//            {
//                while (rs.next())
//                {
//                    String kode_jadwal = rs.getString(1);
//                    LocalTime jamMulai = rs.getValue(2);
//
//
//                    listjadwal.add(new Jadwal(kode_jadwal, jamMulai));
//                }
//            }
//            con.close();
//        }
//        catch(ClassNotFoundException e)
//        {
//            System.out.println(e);
//        }
//        catch (SQLException e) {
//            System.out.println(e);
//        }

//        tblJadwal.setItems(listjadwal);
     tblKodeJadwal.setCellValueFactory(new PropertyValueFactory<Jadwal, String>("kodeJadwal"));
        tblJamMulai.setCellValueFactory(new PropertyValueFactory<Jadwal, LocalTime>("jamMulai"));
    }
    @FXML
    private void onClrBtn(){
        fieldkodeJadwal.setText("");
        fieldJam.setText("");
        fieldMenit.setText("");
    }
    @FXML
    private void onAddBtn(){
        kodejadwal = fieldkodeJadwal.getText();

        jamMwf = LocalTime.of(Integer.parseInt(fieldJam.getText()),Integer.parseInt(fieldMenit.getText()));
        System.out.println(jamMwf);
        listjadwal.add(new Jadwal(kodejadwal,jamMwf));
        tblJadwal.setItems(listjadwal);
        fieldkodeJadwal.setText("");
        fieldJam.setText("");
        fieldMenit.setText("");
    }
}
