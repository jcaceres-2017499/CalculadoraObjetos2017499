package org.juancaceres.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class FXMLDocumentController implements Initializable {
    int boton;
    double valor1, valor2 ,correccion,valorNuevo, result=0;
    @FXML private Button btnCero;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMasMenos;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnCe;
    @FXML private Button btnC;
    @FXML private Button btnUnoX;
    @FXML private Button btnRaiz;
    @FXML private Button btnDivision;
    @FXML private Button btnSuma;
    @FXML private Button btnResta;
    @FXML private Button btnMultiplicacion;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnPotencia;
    @FXML private TextField txtPantalla; 
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource()==btnUno){
            txtPantalla.setText(txtPantalla.getText()+"1");
    }else if(event.getSource()==btnDos){
            txtPantalla.setText(txtPantalla.getText()+"2");
    }else if(event.getSource()==btnTres){
            txtPantalla.setText(txtPantalla.getText()+"3");
    }else if(event.getSource()==btnCuatro){
            txtPantalla.setText(txtPantalla.getText()+"4");
    }else if(event.getSource()==btnCinco){
            txtPantalla.setText(txtPantalla.getText()+"5");
    }else if(event.getSource()==btnSeis){
            txtPantalla.setText(txtPantalla.getText()+"6");
    }else if(event.getSource()==btnSiete){
            txtPantalla.setText(txtPantalla.getText()+"7");
    }else if(event.getSource()==btnOcho){
            txtPantalla.setText(txtPantalla.getText()+"8");
    }else if(event.getSource()==btnNueve){
            txtPantalla.setText(txtPantalla.getText()+"9");
    }else if(event.getSource()==btnCero){
            txtPantalla.setText(txtPantalla.getText()+"0");
    }else if(event.getSource()==btnSuma){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            boton=1;
            btnPunto.setDisable(false);
    }else if(event.getSource()==btnResta){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            boton=2;
            btnPunto.setDisable(false);
    }else if(event.getSource()==btnMultiplicacion){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            boton=3;
            btnPunto.setDisable(false);
    }else if(event.getSource()==btnDivision){
            valor1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            boton=4;
            btnPunto.setDisable(false);
    }else if(event.getSource()==btnIgual){
        valor2=Double.parseDouble(txtPantalla.getText());
        switch(boton){
            case 1:
                result = valor1+valor2;
                txtPantalla.setText(String.valueOf(result));
                break;
            case 2:
                result = valor1-valor2;
                txtPantalla.setText(String.valueOf(result));
                break;
            case 3:
                result = valor1*valor2;
                txtPantalla.setText(String.valueOf(result));
                break;
            case 4:
                result = valor1/valor2;
                txtPantalla.setText(String.valueOf(result));
                break;
            
        }
    }else if(event.getSource()==btnC){
        switch(boton){
            case 1:
                correccion = valor1;
                txtPantalla.clear();
                valorNuevo=Double.parseDouble(txtPantalla.getText());
                result = valor1 + valorNuevo;
                txtPantalla.setText(String.valueOf(result));
                break;
            case 2:
                correccion = valor1;
                txtPantalla.clear();
                valorNuevo=Double.parseDouble(txtPantalla.getText());
                result = valor1 - valorNuevo;
                txtPantalla.setText(String.valueOf(result));
                break;
            case 3:
                correccion = valor1;
                txtPantalla.clear();
                valorNuevo=Double.parseDouble(txtPantalla.getText());
                result = valor1 * valorNuevo;
                txtPantalla.setText(String.valueOf(result));
                break;
            case 4:
                correccion = valor1;
                txtPantalla.clear();
                valorNuevo=Double.parseDouble(txtPantalla.getText());
                result = valor1 / valorNuevo;
                txtPantalla.setText(String.valueOf(result));
                break;
            
        }
  
    }else if(event.getSource()==btnCe){
            txtPantalla.clear();
            btnPunto.setDisable(false);
    }else if(event.getSource()==btnPunto){
            if(txtPantalla.getText().length()==0){
               txtPantalla.setText("0.");
               btnPunto.setDisable(true);
            }else{
                txtPantalla.setText(txtPantalla.getText()+".");
                btnPunto.setDisable(true);
            }
    }else if(event.getSource()==btnPotencia){
            valor1 = Double.parseDouble(txtPantalla.getText());
            result= valor1*valor1;
            txtPantalla.setText(String.valueOf(result));
    }else if(event.getSource()==btnRaiz){
            valor1 = Double.parseDouble(txtPantalla.getText());
            result= Math.sqrt(valor1);
            txtPantalla.setText(String.valueOf(result));
    }else if(event.getSource()==btnPorcentaje){
        double valPantalla, valPorciento;
        valPantalla = Double.parseDouble(txtPantalla.getText());
        txtPantalla.clear();
        valPorciento = valor1 * valPantalla / 100;
        txtPantalla.setText(String.valueOf(valPorciento));
    }else if(event.getSource()==btnUnoX){
            valor1 = Double.parseDouble(txtPantalla.getText());
            result= 1/valor1;
            txtPantalla.setText(String.valueOf(result));
    }else if(event.getSource()==btnMasMenos){
            valor1 = Double.parseDouble(txtPantalla.getText());
            result= valor1*-1;
            txtPantalla.setText(String.valueOf(result));
    }      
}    
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }    
    
}
