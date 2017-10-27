/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField beratbadan;
    @FXML
    private JFXTextField tinggibadan;
    @FXML
    private RadioButton rdLaki;
    @FXML
    private RadioButton rdPerempuan;
    @FXML
    private JFXTextField ideal;
    @FXML
    private JFXTextArea Hasil;
    @FXML
    private JFXTextArea Saran;
    @FXML
    private JFXButton proses;
    @FXML
    private JFXButton reset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Proses(ActionEvent event) {
        String Nama = nama.getText();
         int BeratBadan = Integer.parseInt(beratbadan.getText());
         int TinggiBadan = Integer.parseInt(tinggibadan.getText());
         String Jeniskelamin;
         int ideals = TinggiBadan - 105;
         int idealp = TinggiBadan - 110;
         String saran=Saran.getText();
         
         if(rdLaki.isSelected()){
             Jeniskelamin="Laki-Laki";
             if(ideals == BeratBadan  ){
                 ideal.setText(" "+ideals);
                 saran="\n ok sip";
             }
             else if(ideals > BeratBadan){
                 ideal.setText(" "+ideals);
                 saran="\n Makan yang BANYAK";
             }
             else if(ideals < BeratBadan){
             ideal.setText(" "+ideals);
                 saran=("\n Makan yang sedikit");
         }
         }
         else if(rdPerempuan.isSelected()){
             Jeniskelamin="Perempuan";
             if(idealp == BeratBadan  ){
                 ideal.setText(" "+idealp);
                 saran="\n ok sip";
             }
             else if(idealp > BeratBadan){
                 ideal.setText(" "+idealp);
                 saran="\n Makan yang sedikit";
             }
             else if(idealp < BeratBadan){
             ideal.setText(" "+idealp);
                 saran=("\n Makan yang banyak");
         }
         }
         else{
             Jeniskelamin="unknow";
         }
         
         Hasil.setText("Nama Anda : "+Nama+"\n Berat Badan anda : "+BeratBadan+"\n Tinggi Badan anda : "+TinggiBadan+"\n Jenis Kelamin : "+Jeniskelamin+"");
         Saran.setText(" "+saran);
         
         
    }
    
    @FXML
    void Hapus(ActionEvent event) {
        nama.setText(" ");
        beratbadan.setText(" ");
        tinggibadan.setText(" ");
        rdLaki.setSelected(false);
        rdPerempuan.setSelected(false);
        Hasil.setText(" ");
        Saran.setText("");
        ideal.setText("");
    }
    
}
