package leonreimann.example.uebung4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickButton(View view){

        //variablendefinition
        //int zahl = 12;
        // ausgabe auf dem log
        //Log.i("eine zahl", String.valueOf(zahl));

        EditText benutzernameedit=findViewById(R.id.BenutzernameET);

        EditText editTextNumber=findViewById(R.id.PinET);

        Log.i("Info","Hallo " + benutzernameedit.getText().toString());

        Log.i("Name", benutzernameedit.getText().toString());

        Log.i("Pin",editTextNumber.getText().toString());

        Toast.makeText(this, "Kontodaten wurden erfolgreich an die Chinesische Regierung Verkauft", Toast.LENGTH_SHORT).show();
    }


}