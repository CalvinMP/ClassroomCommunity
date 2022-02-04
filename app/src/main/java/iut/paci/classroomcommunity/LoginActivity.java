package iut.paci.classroomcommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btnClick(View v) {
        EditText id = (EditText) findViewById(R.id.id);
        String identifiant = id.getText().toString();

        EditText pwd = (EditText) findViewById(R.id.password);
        String motDePasse = pwd.getText().toString();

        Toast t;

        if(identifiant.equals("Scuzzi") && motDePasse.equals("Lopotichat"))
        {
            t = Toast.makeText(v.getContext(), "Identification réussie !", Toast.LENGTH_SHORT);
            Log.i("login", "log");
            Intent districts = new Intent(this, MainActivity.class);
            startActivity(districts);
        }

        else
        {
            t = Toast.makeText(v.getContext(), "Utilisateur non reconnu.", Toast.LENGTH_SHORT);
            Log.i("login", identifiant);
            Log.i("login", motDePasse);
        }

        t.show();
    }

}