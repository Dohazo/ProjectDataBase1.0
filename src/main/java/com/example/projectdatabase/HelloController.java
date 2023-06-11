package com.example.projectdatabase;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    TextField fieldIdMovie;
    @FXML
    TextField fieldGenre;
    @FXML
    TextField fieldIdLisensor;
    @FXML
    TextField fieldKodeJadwal;
    @FXML
    TextField fieldJudul;
    @FXML
    TextField fieldDurasi;
    @FXML
    DatePicker fieldTahunProduksi;
    @FXML
    TextField fieldSutradara;
    @FXML
    TextField fieldDimensi;

    @FXML
    TableView<NamaMovie> tbl_nama_movie;
    @FXML
    TableColumn<NamaMovie, String> colIdMovie;
    @FXML
    TableColumn<NamaMovie, String> colIdLisensor;
    @FXML
    TableColumn<NamaMovie, String> colKodeJadwal;
    @FXML
    TableColumn<NamaMovie, String> colJudul;
    @FXML
    TableColumn<NamaMovie, Integer> colDurasi;
    @FXML
    TableColumn<NamaMovie, String> colGenre;
    @FXML
    TableColumn<NamaMovie, LocalDate> colTahunProduksi;
    @FXML
    TableColumn<NamaMovie, String> colSutradara;
    @FXML
    TableColumn<NamaMovie, String> colDimensi;
    @FXML
    Button clearBtn;
    @FXML
    Button saveBtn;
    @FXML
    ObservableList<NamaMovie> listNamaMovie = FXCollections.observableArrayList();
    @FXML
    private String idMovie;
    @FXML
    private String idLisensor;
    @FXML
    private String kodejadwal;
    @FXML
    private String judul;
    @FXML
    private int durasi;
    @FXML
    private String genre;
    @FXML
    private LocalDate tahunProduksi;
    @FXML
    private String sutradara;
    @FXML
    private String dimensi;
    @FXML
    protected void onClrBtn() {
fieldIdMovie.setText("");
fieldIdLisensor.setText("");
fieldKodeJadwal.setText("");
fieldJudul.setText("");
fieldDurasi.setText("");
fieldGenre.setText("");
fieldTahunProduksi.setValue(null);
fieldSutradara.setText("");
fieldDimensi.setText("");
    }
@FXML
protected void onSaveBtn() {
        int index = tbl_nama_movie.getSelectionModel().getSelectedIndex();
        if(clearBtn.isVisible()){
            if (fieldIdMovie.getText().equals("")&& fieldIdLisensor.getText().equals("")
            && fieldKodeJadwal.getText().equals("") && fieldJudul.getText().equals("")
            && fieldDurasi.getText().equals("") && fieldGenre.getText().equals("")
            && fieldTahunProduksi.getValue() == null && fieldSutradara.getText().equals("")
            && fieldDimensi.getText().equals("")){
                listNamaMovie.remove(index);
            }
    }
        else{
            listNamaMovie.add(new NamaMovie(fieldIdMovie.getText(),
                    fieldIdLisensor.getText(),
                    fieldKodeJadwal.getText(),
                    fieldJudul.getText(),
                    Integer.parseInt(fieldDurasi.getText()),
                    fieldGenre.getText(),
                    fieldTahunProduksi.getValue(),
                    fieldSutradara.getText(),
                    fieldDimensi.getText()));

        }
        tbl_nama_movie.setItems(listNamaMovie);
}
@FXML
protected void getSelected(){
        clearBtn.setVisible(true);
        int index = tbl_nama_movie.getSelectionModel().getSelectedIndex();
        fieldIdMovie.setText(colIdMovie.getCellData(index));
        fieldIdLisensor.setText(colIdLisensor.getCellData(index));
    fieldKodeJadwal.setText(colKodeJadwal.getCellData(index));
    fieldJudul.setText(colJudul.getCellData(index));
    fieldDurasi.setText(Integer.toString(colDurasi.getCellData(index)));
    fieldGenre.setText(colGenre.getCellData(index));
    fieldTahunProduksi.setValue(colTahunProduksi.getCellData(index));
    fieldSutradara.setText(colSutradara.getCellData(index));
    fieldDimensi.setText(colDimensi.getCellData(index));

}
    @FXML
    public void initialize() {
        clearBtn.setVisible(false);
        colIdMovie.setCellValueFactory(new PropertyValueFactory<NamaMovie, String>("id_movie"));
        colIdLisensor.setCellValueFactory(new PropertyValueFactory<NamaMovie, String>("id_lisensor"));
        colKodeJadwal.setCellValueFactory(new PropertyValueFactory<NamaMovie, String>("kode_jadwal"));
        colJudul.setCellValueFactory(new PropertyValueFactory<NamaMovie, String>("judul"));
        colDurasi.setCellValueFactory(new PropertyValueFactory<NamaMovie, Integer>("durasi"));
        colGenre.setCellValueFactory(new PropertyValueFactory<NamaMovie, String>("genre"));
        colTahunProduksi.setCellValueFactory(new PropertyValueFactory<NamaMovie, LocalDate>("tahun_produksi"));
        colSutradara.setCellValueFactory(new PropertyValueFactory<NamaMovie, String>("sutradara"));
        colDimensi.setCellValueFactory(new PropertyValueFactory<NamaMovie, String>("dimensi"));

    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}