package br.sp.senac.appvalidausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class RespondeUsuario_activity extends AppCompatActivity {

    Button txtvoltar, btnRatingBar, btnIr;
    TextView recebevalor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.responde_usuario);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        recebevalor = (TextView) findViewById(R.id.lblRespondeUsuario);
        recebevalor.setText(message);

        //final RatingBar ratingBar = (RatingBar) findViewById(R.id.idRatingbar);

        txtvoltar = (Button) findViewById(R.id.btnVoltar);

        txtvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();


                
            }
        });
    }
}

