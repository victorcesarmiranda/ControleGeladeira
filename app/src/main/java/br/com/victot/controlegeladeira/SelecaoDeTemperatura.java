package br.com.victot.controlegeladeira;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SelecaoDeTemperatura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecao_de_temperatura);

        SeekBar sbTemperature = findViewById(R.id.sbTemperatura);
        Button btNext = findViewById(R.id.btNext);
        final TextView textTemperature = findViewById(R.id.textTemperature);
        textTemperature.setText(OpcoesDeTemperatura.getNome(sbTemperature.getProgress()));

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MonitoramentoActivity.class);
                startActivity(intent);
            }
        });

        sbTemperature.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int p = seekBar.getProgress();
                textTemperature.setText(OpcoesDeTemperatura.getNome(p));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}