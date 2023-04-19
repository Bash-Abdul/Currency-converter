package com.example.currencyconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1, sp2;
    EditText ed1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtAmount);
        sp1 = findViewById(R.id.spFrom);
        sp2 = findViewById(R.id.spTo);
        b1 = findViewById(R.id.b);

        String[] from = {"NGA","USA","RUS","ENG","IND","RSA","MEX","CHN","JPN","KOR","DEN","DEU","NO","PK","AR","BRA"};
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(arrayAdapter);

        String[] to = {"US DOLLAR","EURO","BRITISH POUND STERLING"};
        ArrayAdapter arrayAdapter1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(arrayAdapter1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                Double amount = Double.parseDouble(ed1.getText().toString());

                if (sp1.getSelectedItem().toString() == "US DOLLAR" && sp2.getSelectedItem().toString() == "NGA"){
                    tot = amount * 460;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "NGA" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 505.50;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "NGA" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 572.66;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "USA" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "USA" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 1.10;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "USA" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 1.416069;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "RUS" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 81.56;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "RUS" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 89.48;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "RUS" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 101.44;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "ENG" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 0.80;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "ENG" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 0.88;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "ENG" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "IND" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 82.04;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "IND" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 90.00;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "IND" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 102.02;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "RSA" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 18.16;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "RSA" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 19.92;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "RSA" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 22.59;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "MEX" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 17.99;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "MEX" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 19.73;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "MEX" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 22.37;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "CHN" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 6.88;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "CHN" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 7.54;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "CHN" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 8.55;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "JPN" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 1833.94;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "JPN" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 146.98;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "JPN" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 166.60;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "KOR" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 1317.39;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "KOR" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 1445.55;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "KOR" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 1638.57;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "DEN" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 6.79;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "DEN" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 7.45;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "DEN" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 8.45;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "DEU" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 1.61;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "DEU" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 1.96;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "DEU" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 2.28;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "NO" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 10.45;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "NO" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 11.47;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "NO" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 13.00;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "PK" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 154.625;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "PK" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 187.9731;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "PK" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 218.735;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "AR" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 94.783;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "AR" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 115.334;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "AR" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 134.38;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "BRA" && sp2.getSelectedItem().toString() == "US DOLLAR"){
                    tot = amount * 4.94;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "BRA" && sp2.getSelectedItem().toString() == "EURO"){
                    tot = amount * 5.42;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }else if (sp1.getSelectedItem().toString() == "BRA" && sp2.getSelectedItem().toString() == "BRITISH POUND STERLING"){
                    tot = amount * 6.14;
                    Toast.makeText(getApplicationContext(), tot.toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}