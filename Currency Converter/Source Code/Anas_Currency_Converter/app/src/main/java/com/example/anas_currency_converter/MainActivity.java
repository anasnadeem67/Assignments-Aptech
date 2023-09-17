package com.example.anas_currency_converter;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.anas_currency_converter.databinding.ActivityMainBinding;
import androidx.appcompat.widget.Toolbar;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    EditText money_ET;
    Button convert_btn;
    Spinner spinner;
    TextView rupees;

    ArrayAdapter adapter;
    
    String list, getMoney;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        money_ET = findViewById(R.id.value_ET);
        convert_btn = findViewById(R.id.conver_btn);
        rupees = findViewById(R.id.rupees);
        spinner = findViewById(R.id.spinner);

        adapter = ArrayAdapter.createFromResource(this, R.array.currencies, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner.setAdapter(adapter);
        
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                list = parent.getItemAtPosition(position).toString();

                switch (list){
                    case "PKR - Pakistani Rupee":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 213.72));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "KWD - Kuwaiti Dinar":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 0.31));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "EUR - Euro":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 0.99));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "BHD - Bahraini Dinar":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 0.38));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "OMR - Omani Riyal":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 0.38));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "JOD - Jordanian Dinar":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 0.71));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "GBP - Pound":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 0.83));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "TRY - Turkish Lira":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 17.96));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "QAR - Qatari Rial":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 3.64));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "CAD - Canadian Dollar":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 1.29));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "AUD - Australian Dollar":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 1.4295));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "SGD - Singapore Dollar":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 1.38));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "SAR - Saudi Riyal":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 3.75));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                    case "NPR - Nepalese Rupee":{
                        convert_btn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                getMoney = money_ET.getText().toString();
                                if(getMoney.isEmpty()){
                                    Toast.makeText(getApplication(), "Please Enter $$ to Convert", Toast.LENGTH_SHORT).show();
                                }else {
                                    Double converttodouble_et = Double.parseDouble(getMoney);
                                    Double store = Double.parseDouble(new DecimalFormat("##.####").format(converttodouble_et * 126.94));
                                    rupees.setText(""+store);
                                }
                            }
                        });
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }


}