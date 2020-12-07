package br.com.victot.controlegeladeira;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // acessar um objeto em tela
        Button btOk = findViewById(R.id.btOk);
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:");
                Intent intent = new Intent(getApplicationContext(), SelecaoDeTemperatura.class);
                EditText editText = (EditText) findViewById(R.id.edNome);
                String message = editText.getText().toString();
                intent.putExtra("EXTRA_MESSAGE", message);
                startActivity(intent);
            }
        });


    }
}