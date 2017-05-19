package com.elorapps.calculadorasmarti;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    private Button n0;
    private Button n1;
    private Button n2;
    private Button n3;
    private Button n4;
    private Button n5;
    private Button n6;
    private Button n7;
    private Button n8;
    private Button n9;
    private Button coma;
    private Button suma;
    private Button resta;
    private Button multiplica;
    private Button divide;
    private Button igual;
    private Button porciento;
    private Button signo;
    private Button borrar;
    private Button raiz;
    private EditText et;
    private String display;
    private double valor1 = 0;
    private double valor2 = 0;
    private double resultado;
    private boolean flagEscritura = false; //CUANDO ES TRUE COMIENZA A ESCRIBIR EN EL EDITTEXT. SI ES FALSE HACE APPEND EN EL ET
    private int operador = -1; //-1 no hay; 1 suma; 2 resta; 3 multiplica; 4 divide

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActionBar().setElevation(0);

        n0 = (Button) findViewById(R.id.button52);
        n1 = (Button) findViewById(R.id.button41);
        n2 = (Button) findViewById(R.id.button42);
        n3 = (Button) findViewById(R.id.button43);
        n4 = (Button) findViewById(R.id.button31);
        n5 = (Button) findViewById(R.id.button32);
        n6 = (Button) findViewById(R.id.button33);
        n7 = (Button) findViewById(R.id.button21);
        n8 = (Button) findViewById(R.id.button22);
        n9 = (Button) findViewById(R.id.button23);
        coma = (Button) findViewById(R.id.button51);
        borrar = (Button) findViewById(R.id.button11);
        raiz = (Button) findViewById(R.id.button12);
        porciento = (Button) findViewById(R.id.button13);
        divide = (Button) findViewById(R.id.button14);
        multiplica = (Button) findViewById(R.id.button24);
        suma = (Button) findViewById(R.id.button34);
        resta = (Button) findViewById(R.id.button44);
        igual = (Button) findViewById(R.id.button54);
        signo = (Button) findViewById(R.id.button53);

        et = (EditText) findViewById(R.id.editText);

        n0.setOnClickListener(this);
        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
        coma.setOnClickListener(this);
        borrar.setOnClickListener(this);
        raiz.setOnClickListener(this);
        porciento.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiplica.setOnClickListener(this);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        igual.setOnClickListener(this);
        signo.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){

            case R.id.button51:
                display = et.getText().toString();
                if (display.lastIndexOf(".") == -1) {
                    et.append(".");
                }
                break;
            case R.id.button52:
                if (flagEscritura == false){
                    et.append("0");
                }else{
                    et.setText("0");
                    flagEscritura = false;
                }
                valor1 = Double.parseDouble(et.getText().toString());
                break;
            case R.id.button41:
                if (flagEscritura == false){
                    et.append("1");
                }else{
                    et.setText("1");
                    flagEscritura = false;
                }
                valor1 = Double.parseDouble(et.getText().toString());
                break;
            case R.id.button42:
                if (flagEscritura == false){
                    et.append("2");
                }else{
                    et.setText("2");
                    flagEscritura = false;
                }
                valor1 = Double.parseDouble(et.getText().toString());
                break;
            case R.id.button43:
                if (flagEscritura == false){
                    et.append("3");
                }else{
                    et.setText("3");
                    flagEscritura = false;
                }
                valor1 = Double.parseDouble(et.getText().toString());
                break;
            case R.id.button31:
                if (flagEscritura == false){
                    et.append("4");
                }else{
                    et.setText("4");
                    flagEscritura = false;
                }
                valor1 = Double.parseDouble(et.getText().toString());
                break;
            case R.id.button32:
                if (flagEscritura == false){
                    et.append("5");
                }else{
                    et.setText("5");
                    flagEscritura = false;
                }
                valor1 = Double.parseDouble(et.getText().toString());
                break;
            case R.id.button33:
                if (flagEscritura == false){
                    et.append("6");
                }else{
                    et.setText("6");
                    flagEscritura = false;
                }
                valor1 = Double.parseDouble(et.getText().toString());
                break;
            case R.id.button21:
                if (flagEscritura == false){
                    et.append("7");
                }else{
                    et.setText("7");
                    flagEscritura = false;
                }
                valor1 = Double.parseDouble(et.getText().toString());
                break;
            case R.id.button22:
                if (flagEscritura == false){
                    et.append("8");
                }else{
                    et.setText("8");
                    flagEscritura = false;
                }
                valor1 = Double.parseDouble(et.getText().toString());
                break;
            case R.id.button23:
                if (flagEscritura == false){
                    et.append("9");
                }else{
                    et.setText("9");
                    flagEscritura = false;
                }
                valor1 = Double.parseDouble(et.getText().toString());
                break;

            case R.id.button11:
                //boton borrar
                et.setText("");
                valor1 = 0;
                valor2 = 0;
                break;
            case R.id.button12:
                if(et.getText().toString().isEmpty()){
                    Toast.makeText(this, "NO HAY VALORES", Toast.LENGTH_LONG).show();
                }else{
                    valor1 = Double.parseDouble(et.getText().toString());
                    valor1 = Math.sqrt(valor1);
                    et.setText(String.valueOf(valor1));
                    flagEscritura = true;
                }
                break;

            case R.id.button13:
                if(et.getText().toString().isEmpty()){
                    Toast.makeText(this, "NO HAY VALORES", Toast.LENGTH_LONG).show();
                }else{
                    valor1 = Double.parseDouble(et.getText().toString());
                    valor1 = valor1/100;
                    et.setText(String.valueOf(valor1));
                }
                break;

            //DIVIDIR
            case R.id.button14:

                if (et.getText().toString().isEmpty()){
                    Toast.makeText(this, getResources().getString(R.string.msg_error), Toast.LENGTH_LONG).show();
                }else{
                    if (operador == -1){
                        operador = 4;
                        valor2 = valor1;
                    }else{
                        resultado = operar(operador, valor2, valor1);
                        operador = -1;
                        et.setText(String.valueOf(resultado));
                    }
                }
                flagEscritura = true;
                break;

            //MULTIPLICAR
            case R.id.button24:
                if (et.getText().toString().isEmpty()){
                    Toast.makeText(this, getResources().getString(R.string.msg_error), Toast.LENGTH_LONG).show();
                }else{
                    if (operador == -1){
                        operador = 3;
                        valor2 = valor1;
                    }else{
                        resultado = operar(operador, valor2, valor1);
                        operador = -1;
                        et.setText(String.valueOf(resultado));
                    }
                }

                flagEscritura = true;
                break;

            //SUMAR
            case R.id.button34:
                if (et.getText().toString().isEmpty()){
                    Toast.makeText(this, getResources().getString(R.string.msg_error), Toast.LENGTH_LONG).show();
                }else{
                    if (operador == -1){
                        operador = 1;
                        valor2 = valor1;
                    }else{
                        resultado = operar(operador, valor2, valor1);
                        operador = -1;
                        et.setText(String.valueOf(resultado));
                    }
                }
                flagEscritura = true;
                break;

            //RESTAR
            case R.id.button44:
                if (et.getText().toString().isEmpty()){
                    Toast.makeText(this, getResources().getString(R.string.msg_error), Toast.LENGTH_LONG).show();
                }else{
                    if (operador == -1){
                        operador = 2;
                        valor2 = valor1;
                    }else{
                        resultado = operar(operador, valor2, valor1);
                        operador = -1;
                        et.setText(String.valueOf(resultado));
                    }
                }
                flagEscritura = true;
                break;

            case R.id.button53:
                //NEGATIVO
                if(et.getText().toString().isEmpty()){
                    Toast.makeText(this, "NO HAY VALORES", Toast.LENGTH_LONG).show();
                }else{
                    valor1 = Double.parseDouble(et.getText().toString());
                    valor1 = valor1 * (-1.0);
                    et.setText(String.valueOf(valor1));
                    flagEscritura = true;
                    //et.setText(String.valueOf(valor1));
                }

                break;


            case R.id.button54:

                if (et.getText().toString().isEmpty()){
                    Toast.makeText(this, getResources().getString(R.string.msg_error), Toast.LENGTH_LONG).show();
                }else{
                        if (operador != -1){

                            resultado = operar(operador, valor2, valor1);
                            operador = -1;
                            et.setText(String.valueOf(resultado));
                            //IGUALO VALOR 1 A RESULTADO PORQUE CUANDO SELECCIONE
                            //CUALQUIER OPCIÓN DE CÁLCULO DIRÉ QUE VALOR2 = VALOR1;
                            valor1 = resultado;
                        }

                    }
                flagEscritura = true;
                break;

        }

    }

    public Double operar (int operador, Double valor1, Double valor2){

        Double resultado = null;

        switch (operador){
            case 1:
                resultado = valor1 + valor2;

                break;
            case 2:
                resultado = valor1 - valor2;

                break;
            case 3:
                resultado = valor1 * valor2;

                break;
            case 4:
                try{
                    resultado = valor1 / valor2;

                }catch(Exception e){
                    Toast.makeText(this, getResources().getString(R.string.msg_error_division), Toast.LENGTH_LONG).show();
                }
                break;
        }

        return resultado;

    }
}
