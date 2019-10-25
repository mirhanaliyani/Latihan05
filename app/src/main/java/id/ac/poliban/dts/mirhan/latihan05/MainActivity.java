package id.ac.poliban.dts.mirhan.latihan05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAjak = findViewById(R.id.btAjak);
        Button btRealmadrid = findViewById(R.id.btRealmadrid);
        Button btBarcelona = findViewById(R.id.btBarcelona);

        //event handler
        btAjak.setOnClickListener(v -> Toast.makeText(this, "Hi Ajak", Toast.LENGTH_SHORT).show());
        btRealmadrid.setOnClickListener(v -> Toast.makeText(this, "Hi Realmadrid", Toast.LENGTH_SHORT).show());
        btBarcelona.setOnClickListener(v -> Toast.makeText(this, "Hi Barcelona", Toast.LENGTH_SHORT).show());

    }
}
